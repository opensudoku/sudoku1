/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

import com.livehereandnow.sudoku.util.BasicRule;
import com.livehereandnow.sudoku.util.Problem;

/**
 *
 * @author mark
 */
public class App implements BasicRule {

    public static void main(String[] arg) {
        System.out.println("=== com.livehereandnow.sodoku.Main");
        App app = new App();
        Problem problem = new Problem();
   //     problem.setProblem("12345");
        if (app.isSudoku9x9(problem.toString())) {
            System.out.println("This is a Sudoku9x9," + problem);
            problem.toPrint();
        }else{
            System.out.println("This is not a Sudoku9x9," + problem);            
        }
    }

    public boolean isSudoku9x9(Problem problem) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isSudoku9x9(String problem) {

        System.out.println("given problem is " + problem);
        System.out.println("length of given problem is " + problem.length());

        return true;
    }
}
