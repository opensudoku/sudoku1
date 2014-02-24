/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

import java.util.List;
import java.util.Stack;

/**
 * Solver has a Core to perform basic solving technique.
 * Solver provides branching features to automatically create game tree. 
 * @author mark
 */
public class Solver {

    private Stack<Sudoku> stack;
    private final Core core;

    public Solver() throws CloneNotSupportedException {
        Sudoku question = new Sudoku();

        core = new Core(question);
    }

//
//    public Solver(Core core) {
//        this.core = core;
//    }
    static void show(String str) {
        System.out.println(str);
    }

    public Core getCore() {
        return core;
    }

    public void run() throws CloneNotSupportedException {
        core.run();
//        core.show();

        if (core.getAnswer().isSolved()) {
//            show(" *** Game Over  ***");
//            show(" *** Solved!!!  ***");
            return;
        }
        if (core.getAnswer().isBroken()) {
//            show(" *** Game Over  ***");
//            show(" *** xxx broken xxx  ***");
            return;
        }

        //
        // new Stack
        //
        stack = new Stack<Sudoku>();
        List<Integer> branch = core.getBranch();
        int id = core.getBranchCellId();
        //      show(" ...after Core's run \n show List: " + branch.toString());
        for (Integer val : branch) {
            Sudoku newQuestion = new Sudoku();
            newQuestion = core.getAnswer().clone();
//            show(" ... cell#" + id + " with assigned value " + val.toString());
            newQuestion.setMember(id, val);
//            newQuestion.show();
            stack.push(newQuestion);
//            core.getQuestion().setSudoku(newQuestion);
//            core.run();
//            core.show();

        }
        run2();

//        show(" just show last try");
//        core.getAnswer().show();
    }

    private int run2() throws CloneNotSupportedException {
        int result = 0;
        Sudoku s = new Sudoku();
        while (!stack.isEmpty()) {
            s = stack.pop();
            core.getQuestion().setSudoku(s);
            core.run();
//            core.show();

            if (core.getAnswer().isSolved()) {
//                show(" *** Game Over  ***");
//                show(" *** Solved!!!  ***");
                return 1;
            }
            if (core.getAnswer().isBroken()) {
//                show(" *** Game Over  ***");
//                show(" *** xxx broken xxx  ***");
                continue;
            }

            //
            // next level branch
            //
            List<Integer> branch = core.getBranch();
            int id = core.getBranchCellId();
            //      show(" ...after Core's run \n show List: " + branch.toString());
            for (Integer val : branch) {
                Sudoku newQuestion = new Sudoku();
                newQuestion = core.getAnswer().clone();
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
        // core.run();
//        show(" ...DOING show");
    }
}
