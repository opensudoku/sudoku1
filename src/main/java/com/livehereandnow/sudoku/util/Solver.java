/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

/**
 *
 * @author mark
 */
public class Solver {

    private Sudoku question;
    private Sudoku answer = new Sudoku();
    private Possible possible = new Possible();

    public Sudoku getAnswer() {
        return answer;
    }

    public Possible getPossible() {
        return possible;
    }

    /**
     * Main purpose for Solver to provide answer based on given Sudoku question
     *
     * @param problem
     */
    public Solver(Sudoku s) {
        question = s;
        answer.setSudoku(s);;
      //  run();
    }

    public void run() {
//        System.out.println("**************");
//        System.out.println("*   Step 1   *");
//        System.out.println("**************");

        for (int m = 1; m < 81; m++) {
            if (question.getMember(m) > 0) { // for known cell, 
                possible.removePossibleValueByCell(m, question.getMember(m));
            }//    
        }
//        System.out.println(possible.toString());
        answer.setKnownMembers(possible.getSingleArray());
//        answer.toPrint(1);

        // === 2. going for loop ===
//        System.out.println("**************");
//        System.out.println("*   Step 2   *");
//        System.out.println("**************");
        int possibleCnt = possible.getCount();

        while (true) {
            int[] newlyAdded = answer.getNewlyAdded();
            for (int m = 1; m < 81; m++) {
                if (newlyAdded[m] > 0) { // for known cell, 
                    possible.removePossibleValueByCell(m, answer.getMember(m));
                }//    
            }

            //
            // to end this loop  
            //   when no more improvement
            if (possibleCnt == possible.getCount()) {
                break;
            } else {
                possibleCnt = possible.getCount();
//                System.out.println(possible.toString());
                answer.setKnownMembers(possible.getSingleArray());
//                answer.toPrint(1);

            }
        }
    }

    public void toPrint() {
        System.out.println("=== Solver.toPrint() === start");
        System.out.println("**************");
        System.out.println("*  Question  *");
        System.out.println("**************");
        question.toPrint();
        
        System.out.println("**************");
        System.out.println("*   Answer   *");
        System.out.println("**************");
        answer.toPrint();
        
        System.out.println("**************");
        System.out.println("*  Possible  *");
        System.out.println("**************");
        possible.toPrint(1);

        System.out.println("=== Solver.toPrint() === end");
    }

}
