/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.SolverCore;
import com.livehereandnow.sudoku.util.Sudoku;

/**
 * For Linux's term, name it as Terminal. Use this to test SudokuCore class.
 *
 * @version 1.0
 * @author mark
 */
public class SolverCoreDev {

    public static void show(String str) {
        System.out.println(str);
    }

    public static void main(String[] arg) throws CloneNotSupportedException {
        String str = null;
//        SolverCore solves following in one shot, not a good example for this needs
//        str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";//SolverCore done

//        SolverCore has no finding at first try, easily confused
//        str = "000902007006003900200067048900070060805010709060030002710620004002300100600701000";//SolverCore no first move
//   
//        SolverCore has some finding but not complete, better sample
        str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";
        Sudoku s = new Sudoku(str);
        SolverCore sc = new SolverCore(s);
        sc.run();
        sc.show();

        
        
    }
}
