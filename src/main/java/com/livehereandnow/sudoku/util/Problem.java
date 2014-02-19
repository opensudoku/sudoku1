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

    }

    public int[] getProblem() {
        return problem;
    }

    public void setProblem(int[] problem) {
        this.problem = problem;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < 81; i++) {
            sb.append(problem[i]);
        }
        return sb.toString();
    }

    public void toPrint() {
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < 9; n++) {
                System.out.print(" " + problem[m * 9 + n]);
            }
            System.out.println();
        }
    }

}
