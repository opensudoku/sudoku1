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
public class Problem {

    private int[] problem = new int[81];
    private int[] wikiSample = {
        5, 3, 0, 0, 7, 0, 0, 0, 0,
        6, 0, 0, 1, 9, 5, 0, 0, 0,
        0, 9, 8, 0, 0, 0, 0, 6, 0,
        8, 0, 0, 0, 6, 0, 0, 0, 3,
        4, 0, 0, 8, 0, 3, 0, 0, 1,
        7, 0, 0, 0, 2, 0, 0, 0, 6,
        0, 6, 0, 0, 0, 0, 2, 8, 0,
        0, 0, 0, 4, 1, 9, 0, 0, 5,
        0, 0, 0, 0, 8, 0, 0, 7, 9

    };

    public Problem() {
        problem[0] = 9;
        problem[1] = 8;
        problem[2] = 7;
        problem[3] = 6;
        problem[4] = 5;
        problem[5] = 4;
        problem[6] = 3;
        problem[7] = 2;
        problem[8] = 1;
        problem = wikiSample;
    }

    public int[] getProblem() {
        return problem;
    }

    public void setProblem(int[] problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 81; i++) {
            sb.append(problem[i]);
        }
        return sb.toString();
    }

    public void toPrint() {
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 9; n++) {
                if (problem[m * 9 + n] == 0) {
                    System.out.print(" .");

                } else {
                    System.out.print(" " + problem[m * 9 + n]);
                }
            }
            System.out.println();
        }
    }

}
