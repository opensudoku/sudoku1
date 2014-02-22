/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Checker;
import com.livehereandnow.sudoku.util.Possible;
import com.livehereandnow.sudoku.util.Problem;
import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.Sudoku;

/**
 *
 * @author mark
 */
public class App {

    public static void main(String[] arg) {
        System.out.println("=== com.livehereandnow.sodoku.Main");

        // === 0. setup default question ===
        String str = ""
                + "530070000"
                + "600195000"
                + "098000060"
                + "800060003"
                + "400803001"
                + "700020006"
                + "060000280"
                + "000419005"
                + "000080079";

        Sudoku question = new Sudoku(str);
//// 
        Solver solver = new Solver(question);

        solver.run();
        solver.toPrint();
//        solver.getAnswer().toPrint();
//        solver.getPossible().toPrint();

//        System.out.println("**************");
//        System.out.println("*   Step 3   *");
//        System.out.println("**************");
//        System.out.println(" ... doing ");
    }
}
