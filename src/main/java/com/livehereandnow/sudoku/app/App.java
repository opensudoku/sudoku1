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
            str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";
        }else{
           str= arg[0]; // just accept the FIRST arguement
        }
        Sudoku question = new Sudoku(str);
        Solver solver = new Solver(question);
        solver.run();
        solver.show();
    }
}
