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
public class Solver implements RunMode {

    

    private Sudoku question;
    private Sudoku answer = new Sudoku();
    private Possible possible = new Possible();

    public void setQuestion(Sudoku question) {
        this.question = question;
    }

    public void setPossible(Possible possible) {
        this.possible = possible;
    }

    public Sudoku getQuestion() {
        return question;
    }

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

    /**
     * for any unknown cell having no any possible values
     *
     * @return true: it's broken
     */
    public boolean isBroken() {
        for (int k = 1; k <= 81; k++) {
            if (answer.getMember(k) == 0) {
                if (possible.getCount(k) == 0) {
                    return true;
                }
            }
        }
        //for (answer.getMember(id))

        return false;
    }

    public void run() {
        if (IS_DEBUG) {
            System.out.println("**************");
            System.out.println("*   Step 1   *");
            System.out.println("**************");
        }
        for (int m = 1; m <= 81; m++) {
            if (question.getMember(m) > 0) { // for known cell, 
                possible.removePossibleValueByCell(m, question.getMember(m));
            }//    
        }
        answer.setKnownMembers(possible.getSingleArray());

        if (IS_DEBUG) {
            System.out.println(possible.toString());
            answer.show(1);
        }
//
        // === 2. going for loop ===
        if (IS_DEBUG) {
            System.out.println("**************");
            System.out.println("*   Step 2   *");
            System.out.println("**************");

        }
        int possibleCnt = possible.getCount();

        while (true) {
            int[] newlyAdded = answer.getNewlyAdded();
            for (int m = 1; m <= 81; m++) {
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
                answer.setKnownMembers(possible.getSingleArray());
                if (IS_DEBUG) {
                    System.out.println(possible.toString());
                    answer.show(1);
                }
            }
        }
    }

    public void show() {
        System.out.println("======== Solver.show ======== (start)");
        System.out.println("**************");
        System.out.println("*  Question  *");
        System.out.println("**************");
        System.out.println("question is " + question.toString());
        question.show();

        System.out.println("**************");
        System.out.println("*   Answer   *");
        System.out.println("**************");
        answer.show();

        System.out.println("**************");
        System.out.println("*  Possible  *");
        System.out.println("**************");
        possible.show();

        System.out.println("**************");
        System.out.println("*   Status   *");
        System.out.println("**************");
        if (isBroken()) {
            System.out.println("This Sudoku is Broken!!!");
        } else {
            if (answer.getCount() == 81) {
                System.out.println("Got it!");

            } else {
                System.out.println(" ... still good, need to go deeper");
            }
        }

        System.out.println("======== Solver.show ======== (end)");

    }

}
