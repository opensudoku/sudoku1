/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Possible;
import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.Sudoku;
import java.util.Stack;

/**
 * This is to run on command line. Based on trial and error, to provide branch
 * instructions on command line to solve Sudoku.
 *
 * @author mark
 */
public class CommandLine {

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

            http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-22.shtml
            str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";
            show("Please try command line, ");
            show("java -jar target/sudoku1-1.0.jar 000902007006003900200067048900070060805010709060030002710620004002300100600701000");
            return;
        } else {
            str = arg[0]; // just accept the FIRST arguement
        }
        Sudoku question = new Sudoku(str);
        Solver solver = new Solver(question);
        solver.run();
       // solver.show();
        //  solver.getPossible().show(); // FIXED, 2/23/2014
        //
        //
        //  show("what is ?"+solver.getAnswer().getCount());
        int argCnt = arg.length - 1;
        int argId = 0;
        while (true) {
            if (solver.getAnswer().getCount() == 81) {
                show("*****  This Sudoku question has been solved *****");
                show("*************************************************");
                show("************************************************");
            //    show("*********************************************");

                return;
            }
            //
            //
            solver.show();
            solver.getPossible().show(); // FIXED, 2/23/2014

            if (argId + 1 > argCnt) {
                show("???xxx  Not enough arguments to solve this question yet.");
                break; // no more pre-assigned arguements
            }
            argId++;
            System.out.println("********** branching time **********");
            System.out.println("********** this branch is #"+ argId);
            
            int id = solver.getPossible().getFirstCellIdHavingPossible();
            int x = Integer.parseInt(arg[argId]);
            show("choose to make at cell#" + id);
            show("pre-assigned value is " + x);
            solver.getPossible().setSinglePossibleValue(id, x);
            solver.run();
            solver.show();
            solver.getPossible().show();

        }
    }
}
