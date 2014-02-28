/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

//import static com.livehereandnow.sudoku.app.Main.show;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Solver has a Core to perform basic solving technique. Solver provides
 * branching features to automatically create game tree.
 *
 * @author mark
 */
public class Solver implements Coordinate {

    private Stack<Sudoku> stack;
    private final Core core;
    private final String ABCEDFGHI = "@abcdefghi";

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
            case "quit": {
                show(" ans:to end this application.");
                show(" *====================================*");
                show(" *   Thank You! See You Next Time!    *");
                show(" *====================================*\n");

                System.exit(0);
                return true;
            }

            case "status": {
                show(" ans:" + core.getStatus());

                return true;
            }

            case "sample": {
                show(" ans:sample question, as follows");
                getCore().getQuestion().setData(str);
                getCore().getQuestion().show();
                return true;
            }
            case "question": {
                show(" ans:show question, as follows");
                //   getCore().getQuestion().setData(str);
                getCore().getQuestion().show();
                return true;
            }
            case "answer": {
                show(" ans:show answer, as follows");
                //   getCore().getQuestion().setData(str);
                getCore().getAnswer().show();
                return true;
            }
            case "clean": {
                show(" ans:clean working pad is done");
                getCore().getAnswer().setSudoku(getCore().getQuestion().clone());
                getCore().getPossible().init();
                return true;
            }

            case "run": {
                show(" ans:run answer as it can, done!");
                getCore().run();
//                getCore().getAnswer().show();
                return true;
            }
            case "possible": {
                show(" ans:show possible, as follows");
//                    solver.getCore();
                getCore().getPossible().show();
                return true;
            }
            case "question=answer": {
                show(" ans:assign question as answer, done!");
//                    solver.getCore();
                getCore().getQuestion().setSudoku(getCore().getAnswer().clone());
                getCore().getPossible().init();

                return true;
            }

            default:
                // A1=2
                if (cmd.length() == 4) {
                    if (cmd.charAt(0) < 'a') {
                        break;
                    }
                    if (cmd.charAt(0) > 'i') {
                        break;
                    }
                    if (cmd.charAt(1) < '0') {
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

//                    show("...debug here," + cmd + " row#" + row + ", seq=" + seq + ", val=" + val);
                    //   show(seq+" ans:Set cell("  + ")=" + val);
                    show(" ans:assign value " + val + " to answer's cell " + ABCEDFGHI.charAt(row) + seq + " , done!");

                    getCore().getAnswer().setData(row, seq, val);
               //     getCore().getQuestion().setSudoku(getCore().getAnswer().clone());
                    //   getCore().getPossible().init();

//                    show("...we assume question is ");
                    //   getCore().getQuestion().show();
//                    
//                    
//                    getCore().run();
//                    show("...and get answer ");
//                    if (getCore().isBroken()) {
//                        show("...it's broken ");
//                        getCore().getAnswer().show();
//                        getCore().getPossible().show();
//                        return true;
//                    }
//
//                    if (getCore().getAnswer().isSolved()) {
//                        show("ans:auto-run result, as follows ");
//                        getCore().getAnswer().show();
//                        show("ans:This Sudoku is solved!");
//                        return true;
//                    }
//                    show("...still ok, continue ");
//                    getCore().getAnswer().show();
                    return true;
                }

                // A=123456789, 
                if (cmd.length() == 11) {
                    Pattern p = Pattern.compile("[a-i]=\\d\\d\\d\\d\\d\\d\\d\\d\\d");
                    Matcher m = p.matcher(cmd);
                    if (m.matches()) {
                        int row = ABCEDFGHI.indexOf(cmd.charAt(0));
                        int v1 = cmd.charAt(2)-'0';
                        int v2 = cmd.charAt(3)-'0';
                        int v3 = cmd.charAt(4)-'0';
                        int v4 = cmd.charAt(5)-'0';
                        int v5 = cmd.charAt(6)-'0';
                        int v6 = cmd.charAt(7)-'0';
                        int v7 = cmd.charAt(8)-'0';
                        int v8 = cmd.charAt(9)-'0';
                        int v9 = cmd.charAt(10)-'0';
                        core.getAnswer().setData(row, v1, v2, v3, v4, v5, v6, v7, v8, v9);
                    }
                    show(" ans:assign " + cmd.substring(2) + " to answer's row " + cmd.charAt(0) + ", done!");
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
