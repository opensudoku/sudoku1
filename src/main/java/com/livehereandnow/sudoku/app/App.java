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
 *
 * @author mark
 */
public class App {

    public static void main(String[] arg) {
        String str = null;
        if (arg.length == 0) {
            //http://www.dailysudoku.com/sudoku/archive/2014/02/2014-02-12.shtml
//              str="500960340_000057000_097000800_726009400_085302670_003700125_004000580_000870000_061025003";
            //http://en.wikipedia.org/wiki/Sudoku
            str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";
        } else {
            str = arg[0]; // just accept the FIRST arguement
        }
        Sudoku question = new Sudoku(str);
        Solver solver = new Solver(question);
        solver.run();
        solver.show();

        if (solver.getAnswer().getCount() != 81) {
            System.out.println("********** Stack time **********");
            //
//**************
//*   Answer   *
//**************
// --- Sudoku 9x9 ---
// 5 3 . . 7 . . . .
// 6 . . 1 9 5 . . .
// 1 9 8 . . . . 6 .
// 8 . . . 6 . . . 3
// 4 . . 8 . 3 . . 1
// 7 . . . 2 . . . 6
// 9 6 . . . . 2 8 4
// 2 8 7 4 1 9 6 3 5
// 3 . . . 8 . 1 7 9
//known cells count: 40
//
//**************
//*  Possible  *
//**************
//--- Sudoku 9x9 possible --- (start)
//row#1:{},{},{24},{26},{},{2468},{489},{1249},{28}
//row#2:{},{247},{24},{},{},{},{3478},{24},{278}
//row#3:{},{},{},{23},{34},{24},{3457},{},{27}
//row#4:{},{125},{1259},{579},{},{14},{4579},{2459},{}
//row#5:{},{25},{2569},{},{57},{},{579},{259},{}
//row#6:{},{15},{1359},{59},{},{14},{4589},{459},{}
//row#7:{},{},{15},{357},{357},{},{},{},{}
//row#8:{},{},{},{},{},{},{},{},{}
//row#9:{},{45},{45},{256},{},{26},{},{},{}
//possible value count:111
//
// We split the first {24} to be {2} and {4}
// for good Sudoku it will show answer(s) or simply to show bad Sudoku result            
            
            
            Stack<Sudoku> stack=new Stack<Sudoku>();
            //stack.add(answer);
            Solver s1=new Solver(solver.getAnswer());
            
            Possible p1= new Possible();
            Possible p2=new Possible();
            Sudoku ans1=new Sudoku();
            Sudoku ans2=new Sudoku();
            
            ans1.setSudokuData(solver.getAnswer().getSudokuData());
            ans2.setSudokuData(solver.getAnswer().getSudokuData());
            
            
            
            p1.setPossibleData(solver.getPossible().getPossibleData());
            p2.setPossibleData(solver.getPossible().getPossibleData());
            
            p1.show();
//            p1.setSinglePossibleValue(3, 2); // correct
            p1.setSinglePossibleValue(3, 4); // correct
            
         //   p2.setSinglePossibleValue(3, 4);
            
            p1.show();
            p2.show();
            
            System.out.println("****************************** sol1");
            Solver sol1=new Solver(ans1);
            sol1.getPossible().setPossibleData(p1.getPossibleData());
            sol1.run();
            sol1.show();
            
//            System.out.println("****************************** sol2");
//            Solver sol2=new Solver(ans2);
//            sol2.getPossible().setPossibleData(p2.getPossibleData());
//            sol2.run();
//            sol2.show();
        } else {
            System.out.println("########### no split yet ##############This Sudoku has been solved successfully.");

        }
    }
}
