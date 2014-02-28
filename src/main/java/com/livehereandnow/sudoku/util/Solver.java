/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

//import static com.livehereandnow.sudoku.app.Main.show;
import java.util.List;
import java.util.Stack;

/**
 * Solver has a Core to perform basic solving technique. Solver provides
 * branching features to automatically create game tree.
 *
 * @author mark
 */
public class Solver {

    private Stack<Sudoku> stack;
    private final Core core;
    private final String ABCEDFGHI = "@ABCDEFGHI";

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

    public boolean runCommand(String cmd) throws CloneNotSupportedException {
        String str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";

        switch (cmd) {
            case "sample": {
                show(" ans:sample question, as follows");
                getCore().getQuestion().setData(str);
                getCore().getQuestion().show();
                return true;
            }
            case "question": {
                show(" ans:question, as follows");
                //   getCore().getQuestion().setData(str);
                getCore().getQuestion().show();
                return true;
            }
            case "clean": {
                show(" ans:clean working pad is done");
                getCore().getAnswer().setSudoku(getCore().getQuestion().clone());
                getCore().getPossible().init();
                return true;
            }

            case "run": {
                show(" ans:run result, as follows");
                getCore().run();
                getCore().getAnswer().show();
                return true;
            }
            case "possible": {
                show(" ans:show possible, as follows");
//                    solver.getCore();
                getCore().getPossible().show();
                return true;
            }
            default:
                if (cmd.length() == 4) {
                    if (cmd.charAt(0) < 'A') {
                        break;
                    }
                    if (cmd.charAt(0) > 'I') {
                        break;
                    }
                    if (cmd.charAt(1) < '1') {
                        break;
                    }
                    if (cmd.charAt(1) > '9') {
                        break;
                    }
                    if (cmd.charAt(2) != '=') {
                        break;
                    }
                    if (cmd.charAt(3) < '0') {
                        break;
                    }
                    if (cmd.charAt(3) > '9') {
                        break;
                    }
                    //
                    // A1=2
                    //
                    char c0 = cmd.charAt(0);
                    int row = ABCEDFGHI.indexOf(c0);
                    int seq = Integer.parseInt(cmd.substring(1, 2));
                    int val = Integer.parseInt(cmd.substring(3, 4));

                    show("...debug here," + cmd + " row#" + row + ", seq=" + seq + ", val=" + val);
                    getCore().getAnswer().setData(row, seq, val);
                    getCore().getQuestion().setSudoku(getCore().getAnswer().clone());
                    getCore().getPossible().init();

                    show("...we assume question is ");
                    getCore().getQuestion().show();
                    getCore().run();
                    show("...and get answer ");
                    if (getCore().isBroken()) {
                        show("...it's broken ");
                        getCore().getAnswer().show();
                        getCore().getPossible().show();
                        return true;
                    }

                    if (getCore().getAnswer().isSolved()) {
                        show("ans:auto-run result, as follows ");
                        getCore().getAnswer().show();
                        show("ans:This Sudoku is solved!");
                        return true;
                    }
                    show("...still ok, continue ");
                    getCore().getAnswer().show();

                    return true;
                }
        }
        return false;
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
            newQuestion.setData(id, val);
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
                newQuestion.setData(id, val);
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
