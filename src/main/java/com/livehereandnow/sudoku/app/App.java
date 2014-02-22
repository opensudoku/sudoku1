/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.app;

import com.livehereandnow.sudoku.util.Checker;
import com.livehereandnow.sudoku.util.Possible;
import com.livehereandnow.sudoku.util.Problem;
import com.livehereandnow.sudoku.util.Sudoku;

/**
 *
 * @author mark
 */
public class App {

    public static void main(String[] arg) {
        System.out.println("=== com.livehereandnow.sodoku.Main");

        // === 0. setup default question ===
        Sudoku question = new Sudoku();
//            5, 3, 0, 0, 7, 0, 0, 0, 0,
//            6, 0, 0, 1, 9, 5, 0, 0, 0,
//            0, 9, 8, 0, 0, 0, 0, 6, 0,
//            8, 0, 0, 0, 6, 0, 0, 0, 3,
//            4, 0, 0, 8, 0, 3, 0, 0, 1,
//            7, 0, 0, 0, 2, 0, 0, 0, 6,
//            0, 6, 0, 0, 0, 0, 2, 8, 0,
//            0, 0, 0, 4, 1, 9, 0, 0, 5,
//            0, 0, 0, 0, 8, 0, 0, 7, 9};
        question.setMembersByGroup(1, 5, 3, 0, 0, 7, 0, 0, 0, 0);
        question.setMembersByGroup(2, 6, 0, 0, 1, 9, 5, 0, 0, 0);
        question.setMembersByGroup(3, 0, 9, 8, 0, 0, 0, 0, 6, 0);
        question.setMembersByGroup(4, 8, 0, 0, 0, 6, 0, 0, 0, 3);
        question.setMembersByGroup(5, 4, 0, 0, 8, 0, 3, 0, 0, 1);
        question.setMembersByGroup(6, 7, 0, 0, 0, 2, 0, 0, 0, 6);
        question.setMembersByGroup(7, 0, 6, 0, 0, 0, 0, 2, 8, 0);
        question.setMembersByGroup(8, 0, 0, 0, 4, 1, 9, 0, 0, 5);
        question.setMembersByGroup(9, 0, 0, 0, 0, 8, 0, 0, 7, 9);
        question.toPrint();

        Sudoku answer = new Sudoku(question.getSudokuIntArray());
        //answer.setMembers(question.getSudokuIntArray());

        Possible possible = new Possible();
       // possible.setSudokuMembers(question.getSudokuIntArray());

        // === 1. first time ===
        for (int m = 1; m < 81; m++) {
            if (question.getMember(m) > 0) { // for known cell, 
                possible.removePossibleValueByCell(m, answer.getMember(m));
            }//    
        }
        System.out.println(possible.toString());
        answer.setMember(possible.getSingleArray());
        answer.toPrint(1);

        // === 2. going for loop ===
        int possibleCnt = possible.getCount();

        while (true) {
            int[] newlyAdded = answer.getNewlyAdded();
            for (int m = 1; m < 81; m++) {
                if (newlyAdded[m] > 0) { // for known cell, 
                    possible.removePossibleValueByCell(m, answer.getMember(m));
                }//    
            }

            System.out.println(possible.toString());
            answer.setMember(possible.getSingleArray());
            answer.toPrint(1);
//
            // to end this loop  
            //   when no more improvement
            if (possibleCnt == possible.getCount()) {
                break;
            } else {
                possibleCnt = possible.getCount();
            }
        }

    }
}
