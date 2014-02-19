/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

/**
 *
 * @author mark
 */
public class Checker extends Problem implements BasicRule {

    public boolean isSudoku9x9(Problem problem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isGoodSudoku9x9(Problem problem) {
        int len = problem.getProblem().length;
        if (len != 81) {
            System.out.println("This is not a good Sudoku 9x9, wrong size.");
            System.out.println("The length of " + problem + " is " + len + ", supposed to be 81");
            return false;
        }
        System.out.println("(1) size=81, passed!");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 81; i++) {
            sb.append(problem.getProblem()[i]);
            if (problem.getProblem()[i] < 0 || problem.getProblem()[i] > 9) {
                System.out.println("(2)Some cell's integer value is not between 0 and 9.");
                System.out.println("The first not legal number is found " + problem.getProblem()[i] + " of " + sb.toString());
                return false;

            }
        }
        System.out.println("(2) all in number 0 to 9, passed!");

        Coordinate coord = new Coordinate();
        SudokuGroup sg;
        // by Row
        for (int g = 0; g < 9; g++) {
            sg = coord.getGroupByRow(g);

            int[] val = new int[10];
            for (int i = 0; i < 9; i++) {
//                System.out.println(i + " " + sg.getMember()[i] + " " + problem.getProblem()[sg.getMember()[i]]);
                val[problem.getProblem()[sg.getMember()[i]]]++;
            }
            for (int i = 1; i < 9; i++) {
//                System.out.println(i + " " + val[i]);
                if (val[i] > 1) {
                    System.out.println("(3)Repeat number on the same group," + " Row#" + (1 + g));
                    return false;
                }
            }
        }
        System.out.println("(3-1) by Row, no repeat number between 1 to 9, passed!");

        // by Col
        for (int g = 0; g < 9; g++) {
            sg = coord.getGroupByCol(g);
            int[] val = new int[10];
            for (int i = 0; i < 9; i++) {
//                System.out.println(i + " " + sg.getMember()[i] + " " + problem.getProblem()[sg.getMember()[i]]);
                val[problem.getProblem()[sg.getMember()[i]]]++;
            }
            for (int i = 1; i < 9; i++) {
//                System.out.println(i + " " + val[i]);
                if (val[i] > 1) {
                    System.out.println("(3)Repeat number on the same group," + " Col#" + (1 + g));
                    return false;
                }
            }
        }
        System.out.println("(3-2) by Col, no repeat number between 1 to 9, passed!");

        // by Box
        for (int g = 0; g < 9; g++) {
            sg = coord.getGroupByBox(g);
            int[] val = new int[10];
            for (int i = 0; i < 9; i++) {
//                System.out.println(i + " " + sg.getMember()[i] + " " + problem.getProblem()[sg.getMember()[i]]);
                val[problem.getProblem()[sg.getMember()[i]]]++;
            }
            for (int i = 1; i < 9; i++) {
//                System.out.println(i + " " + val[i]);
                if (val[i] > 1) {
                    System.out.println("(3)Repeat number on the same group," + " Box#" + (1 + g));
                    return false;
                }
            }
        }
        System.out.println("(3-3) by Box, no repeat number between 1 to 9, passed!");

        return true;

    }

    public boolean isSudoku9x9(String problem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
