/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Possible;
import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.SolverManager;
import com.livehereandnow.sudoku.util.Sudoku;
import java.util.Stack;

/**
 *
 * @author mark
 */
public class Main {

    public static void show(String str) {
        System.out.println(str);
    }

    public static void main(String[] arg) {
        String str = null;
        if (arg.length == 0) {
//            http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-12.shtml
//            str="500960340_000057000_097000800_726009400_085302670_003700125_004000580_000870000_061025003";
//            http://en.wikipedia.org/wiki/Sudoku
//            str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";

//            http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-22.shtml
//            str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";
//http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-16.shtml
            str = "000902007006003900200067048900070060805010709060030002710620004002300100600701000";
        } else {
            str = arg[0]; // just accept the FIRST arguement
        }
        Sudoku question = new Sudoku(str);
        question.show();
        Solver solver = new Solver(question);
        
        SolverManager sm=new SolverManager();
        
        sm.setSolver(solver);
        sm.run();
        sm.getSolver().getAnswer().show();
        
    }
}
