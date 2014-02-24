/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.SolverCore;
import com.livehereandnow.sudoku.util.Solver;
import com.livehereandnow.sudoku.util.Sudoku;

/**
 * For Linux's term, name it as Terminal. Use this to test SudokuCore class.
 *
 * @version 1.0
 * @author mark
 */
public class SolverCoreExtDev {

    public static void show(String str) {
        System.out.println(str);
    }

    public static void main(String[] arg) throws CloneNotSupportedException {
        String str = null;
//        SolverCore solves following in one shot, not a good example for this needs
//        str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";//SolverCore done

        //broken case
//        str = "535070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";//SolverCore done
//        SolverCore has no finding at first try, easily confused
//        str = "000902007006003900200067048900070060805010709060030002710620004002300100600701000";//SolverCore no first move
//   
//        SolverCore has some finding but not complete, better sample
        str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";
        if (arg.length > 0) {
            str = arg[0];
        }
        Sudoku s = new Sudoku(str);
        Solver sce = new Solver();
        show("");
        show(" *===============*");
        show(" *    Question   *");
        show(" *===============*");
        s.show();

        sce.getSolverCore().getQuestion().setSudoku(s);
        sce.run();

        show("");
        show(" *===============*");
        show(" *    Answer     *");
        show(" *===============*");

        sce.getSolverCore().getAnswer().show();
        show("");

        show("");
        show(" *===============*");
        show(" *    TODO       *");
        show(" *===============*");
        show(" ...interactive mode");

        show("");
        show(" *===============*");
        show(" *    Command    *");
        show(" *===============*");
        show(" new, to start a new game ");
        show(" run, to perform auto solving ");
        show(" show, to display current Sudoku ");
        
        show(" a123456789, to assign value 123456789 to row a ");
        show(" a1=9, to assign value 9 to cell a1 ");
        

    }
}
