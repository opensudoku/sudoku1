/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;


import com.livehereandnow.sudoku.util.Checker;
import com.livehereandnow.sudoku.util.Problem;

/**
 *
 * @author mark
 */
public class App  {

    public static void main(String[] arg) {
        System.out.println("=== com.livehereandnow.sodoku.Main");
        App app = new App();
        Checker checker = new Checker();
        Problem problem=new Problem();
   //     problem.setProblem("12345");
        if (checker.isGoodSudoku9x9(problem)) {
            System.out.println("This is a good Sudoku9x9,...doing ");
            problem.toPrint();
        }else{
            System.out.println("This is not a good Sudoku9x9.");            
        }
    }
}
