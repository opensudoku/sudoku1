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
                System.out.println("Some cell's integer value is not between 0 and 9.");
                System.out.println("The first not legal number is found " + problem.getProblem()[i] + " of " + sb.toString());
                return false;

            }
        }
        System.out.println("(2) all in number 0 to 9, passed!");

        return true;

    }

    public boolean isSudoku9x9(String problem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
