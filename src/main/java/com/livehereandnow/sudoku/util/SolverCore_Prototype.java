/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;



/**
 * SolverCore_Prototype uses method run to perform very basic rule of Sudoku, which is to
 eliminate possible value from each cell's possible list then to reveal single
 value. It stops when no more improvement. Programmer can use isBroken to
 * determine current answer is useful or now. There are 3 private fields: Sudoku
 * question, Sudoku answer and Possible possible. Currently use setter and
 * getter on data, not using clone method yet (and to evaluate it).
 *
 * @author mark
 */
public class SolverCore_Prototype {

    //
    // my basic setup to dev
    //
    static boolean IS_DEBUG = true;

    public static void mark(String str) {
        if (IS_DEBUG) {
            System.out.println(str);
        }
    }

    public static void show(String str) {
        System.out.println(str);
    }

    private Sudoku question = new Sudoku();
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
     * Main purpose for Solver to provide answer based on given Sudoku question.
     * Constructor copies given Sudoku's data, so it won't affect original
     * Sudoku's data.
     *
     * @param problem
     */
    public SolverCore_Prototype(Sudoku s) throws CloneNotSupportedException {
        question = s.clone();
        answer = s.clone();

//        following is the style without clone method,
//        --------------------------------------------
//        question.setSudokuData(s.getSudokuData());
//        answer.setSudokuData(s.getSudokuData());
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
//        if (IS_DEBUG) {
//            mark("**************");
//            mark("*   Step 1   *");
//            mark("**************");
//        }
        for (int m = 1; m <= 81; m++) {
            if (question.getMember(m) > 0) { // for known cell, 
                possible.sweepGroups(m, question.getMember(m));
            }//    
        }
        answer.setKnownMembers(possible.getSingleArray());

//        if (IS_DEBUG) {
//            mark(possible.toString());
//            answer.show(1);
//        }
//
        // === 2. going for loop ===
//        if (IS_DEBUG) {
//            mark("**************");
//            mark("*   Step 2   *");
//            mark("**************");
//        }
        int possibleCnt = possible.getCount();

        while (true) {
            int[] newlyAdded = answer.getNewlyAdded();
            for (int m = 1; m <= 81; m++) {
                if (newlyAdded[m] > 0) { // for known cell, 
                    possible.sweepGroups(m, answer.getMember(m));
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
//                mark(possible.toString());
//                    answer.show(1);
            }
        }
    }

    public void show() {
        show("");
        show(" *=============*");
        show(" *   Question  *");
        show(" *=============*");

        this.getQuestion().show();

        show("");
        show(" *=============*");
        show(" *    Answer   *");
        show(" *=============*");
        this.getAnswer().show();

        //
        // when solved, done
        //
        show("");
        show(" *=============*");
        show(" *    Status   *");
        show(" *=============*");
        if (this.getAnswer().getCount() == 81) {
            show("");
            show("***********************************************");
            show("*   This Sudoku question has been solved!!!   *");
            show("***********************************************");
            show("");
            return;
        }

        if (this.isBroken()) {
            show(" It's broken!");

        } else {
            show("  ...still good");

        }

        // prompts possible to users
        show("");
        show(" *=============*");
        show(" *   Possible  *");
        show(" *=============*");
        this.getPossible().show();

        show("");
        show(" *=============*");
        show(" *   Branch   *");
        show(" *=============*");
 
        show(" TODO ... branch info");

    }

}
