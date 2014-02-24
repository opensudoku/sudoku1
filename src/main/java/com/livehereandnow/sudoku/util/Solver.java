/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

import java.util.List;
import java.util.Stack;

/**
 *
 * @author mark
 */
public class Solver {

    private Stack<Sudoku> stack;
    private final SolverCore sc;

    public Solver() throws CloneNotSupportedException {
        Sudoku question = new Sudoku();

        sc = new SolverCore(question);
    }

//
//    public Solver(SolverCore sc) {
//        this.sc = sc;
//    }
    static void show(String str) {
        System.out.println(str);
    }

    public SolverCore getSolverCore() {
        return sc;
    }

    public void run() throws CloneNotSupportedException {
        sc.run();
//        sc.show();

        if (sc.getAnswer().isSolved()) {
//            show(" *** Game Over  ***");
//            show(" *** Solved!!!  ***");
            return;
        }
        if (sc.getAnswer().isBroken()) {
//            show(" *** Game Over  ***");
//            show(" *** xxx broken xxx  ***");
            return;
        }

        //
        // new Stack
        //
        stack = new Stack<Sudoku>();
        List<Integer> branch = sc.getBranch();
        int id = sc.getBranchCellId();
        //      show(" ...after SolverCore's run \n show List: " + branch.toString());
        for (Integer val : branch) {
            Sudoku newQuestion = new Sudoku();
            newQuestion = sc.getAnswer().clone();
//            show(" ... cell#" + id + " with assigned value " + val.toString());
            newQuestion.setMember(id, val);
//            newQuestion.show();
            stack.push(newQuestion);
//            sc.getQuestion().setSudoku(newQuestion);
//            sc.run();
//            sc.show();

        }
        run2();

//        show(" just show last try");
//        sc.getAnswer().show();
    }

    public int run2() throws CloneNotSupportedException {
        int result = 0;
        Sudoku s = new Sudoku();
        while (!stack.isEmpty()) {
            s = stack.pop();
            sc.getQuestion().setSudoku(s);
            sc.run();
//            sc.show();

            if (sc.getAnswer().isSolved()) {
//                show(" *** Game Over  ***");
//                show(" *** Solved!!!  ***");
                return 1;
            }
            if (sc.getAnswer().isBroken()) {
//                show(" *** Game Over  ***");
//                show(" *** xxx broken xxx  ***");
                continue;
            }

            //
            // next level branch
            //
            List<Integer> branch = sc.getBranch();
            int id = sc.getBranchCellId();
            //      show(" ...after SolverCore's run \n show List: " + branch.toString());
            for (Integer val : branch) {
                Sudoku newQuestion = new Sudoku();
                newQuestion = sc.getAnswer().clone();
//                show(" ... cell#" + id + " with assigned value " + val.toString());
                newQuestion.setMember(id, val);
//            newQuestion.show();

                stack.push(newQuestion);
            }

            // return result;
        }
        return -1;// no solution
    }

    public void show() {
        // sc.run();
//        show(" ...DOING show");
    }
}
