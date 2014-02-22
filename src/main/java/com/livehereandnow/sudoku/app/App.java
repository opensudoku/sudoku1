/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.Sudoku;

/**
 *
 * @author mark
 */
public class App {

    public static void main(String[] arg) {
        String str = null;
        if (arg.length == 0) {
            //http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-12.shtml
              str="500960340_000057000_097000800_726009400_085302670_003700125_004000580_000870000_061025003";
            //http://en.wikipedia.org/wiki/Sudoku
//            str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";
        } else {
            str = arg[0]; // just accept the FIRST arguement
        }
        Sudoku question = new Sudoku(str);
        Solver solver = new Solver(question);
        solver.run();
        solver.show();

        if (solver.getAnswer().getCount() != 81) {
            System.out.println("********** Stack time **********");
        } else {
            System.out.println("This Sudoku has been solved successfully.");

        }
    }
}
