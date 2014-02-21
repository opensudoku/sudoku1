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

        Sudoku answer = new Sudoku();
        answer.setMembers(question.getMemberArray());
        Possible possible = new Possible();
        possible.setSudokuMembers(question.getMemberArray());
// System.out.println("=====");

        for (int m = 1; m < 81; m++) {
            if (question.getMember(m) > 0) // for known cell, 
            {
                possible.removePossibleValueByCell(question.getMember(m), m);
            }
//    
        }
//        System.out.println("#####");

        System.out.println(possible.toString());
        int[] temp = possible.getSingleArray();
        for (int m = 0; m < 81; m = m + 2) {
            if (temp[m] > 0) {
                answer.setMember(temp[m], temp[m + 1]);
                System.out.println("cell#" + temp[m] + " is {" + temp[m + 1] + "}");

            } else {
                break;
            }

        }

        //    possible.toPrint();
    }
}
