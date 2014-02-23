/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Possible;
import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.SolverCore_Prototype;
import com.livehereandnow.sudoku.util.Sudoku;
import java.util.Stack;

/**
 * For Linux's term, name it as Terminal. Use this to test SudokuCore class.
 *
 * @version 1.0
 * @author mark
 */
public class Terminal {

    public static void show(String str) {
        System.out.println(str);
    }

    public static void main(String[] arg) throws CloneNotSupportedException {
        String str = null;
        if (arg.length == 0) {
////            http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-12.shtml
////            str="500960340_000057000_097000800_726009400_085302670_003700125_004000580_000870000_061025003";
////            http://en.wikipedia.org/wiki/Sudoku
////            str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";
//
//            http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-22.shtml
//            str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";
            str = "000902007_006003900_200067048_900070060_805010739_060030002_710620004_002300100_600701000";
            show("Please try command line, ");
            show("");
            show("java -jar target/sudoku1-1.0.jar " + str);
            show("");
            return;
        } else {
            str = arg[0]; // just accept the FIRST arguement
        }
        //
        //
        //
        SolverCore_Prototype solver = new SolverCore_Prototype(new Sudoku(str));
        show("");
        show(" *=============*");
        show(" *   Question  *");
        show(" *=============*");

        solver.getQuestion().show();
        solver.run();

        //
        //
        //  
        int argCnt = arg.length - 1;
        int argId = 0;

        //
        //
        //
        while (true) {
            // prompts answer to users
            show("");
            show(" *=============*");
            show(" *    Answer   *");
            show(" *=============*");
            solver.getAnswer().show();

            //
            // when solved, done
            //
            if (solver.getAnswer().getCount() == 81) {
                show("");
                show("***********************************************");
                show("*   This Sudoku question has been solved!!!   *");
                show("***********************************************");
                show("");
                return;
            }

            show("");
            show(" *=============*");
            show(" *    Status   *");
            show(" *=============*");
            if (solver.isBroken()) {
                show(" It's broken!");

            } else {
                show("  ...still good");

            }

            // prompts possible to users
            show("");
            show(" *=============*");
            show(" *   Possible  *");
            show(" *=============*");
            solver.getPossible().show();

            //
            // not yet solved, more arguments is in need
            //
            if (argId + 1 > argCnt) {
                show(" ...not yet complete, need more arguments to run again");
                show("");
                break;
            }

            //
            // taking argument one step
            // run and show
            //
            argId++;
            show("");
            show(" *=============*");
            show(" *   Branch   *");
            show(" *=============*");
            // determine which cell and given value
            int id = solver.getPossible().getFirstCellIdHavingPossible();
            int x = Integer.parseInt(arg[argId]);
            show(" ... branch #" + argId + ", assign cell[" + id + "]=" + x);
            solver.getPossible().setSinglePossibleValue(id, x);
            solver.run();
//            solver.getAnswer().show();
//            solver.getPossible().show();
        }
    }
}
