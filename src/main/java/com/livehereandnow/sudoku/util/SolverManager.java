/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

import static com.livehereandnow.sudoku.app.App.show;
import java.util.Stack;

/**
 *
 * @author mark
 */
public class SolverManager implements RunMode {

    private Solver solver;
//    Stack <Sudoku> sudokuStack;
//    Stack <Possible> possibleStack;
    Stack stack;

    public static void show(String str) {
        System.out.println(str);
    }

    public static void mark(String str) {
        if (IS_DEBUG) {
            System.out.println(str);
        }
    }

    public Solver getSolver() {
        return solver;
    }

    public void setSolver(Solver solver) {
        this.solver = solver;
    }

    public void run() {
        solver.run();
//        solver.show();
        if (solver.getAnswer().getCount() == 81) {
//            solver.show();
            return; // simple case
        }
//        sudokuStack=new Stack<Sudoku>();
//        possibleStack=new Stack<Possible>();
        stack = new Stack();
        run2();
//        solver.show();
    }

    public void run2() {
        while (true) {
            if (solver.getAnswer().getCount() == 81) {

                mark("Sovled!!!");
                return; // simple case
            }
            if (solver.isBroken()) {
                mark("xxxx broken case!");
                mark("stack size is " + stack.size());
                if (stack.size() > 0) {
                    solver.getQuestion().setSudokuData((int[]) stack.pop());
                    mark(" now ....stack size is " + stack.size());

                    solver.getAnswer().setSudokuData(solver.getQuestion().getSudokuData());
                    solver.getPossible().init();
                    solver.run();
                    run2();
                } else {
                    mark("no more Sudoku on stack ");
                    mark("XXXX should be no answer for this question XXXX ");

                    return;
                }

                return; // simple case
            } else {

                int id = solver.getPossible().getFirstCellIdHavingPossible();
                int[] list = solver.getPossible().getPossibleValues(id);

                for (int k = 0; k < 10; k++) {
                    if (list[k] > 0) {

                        mark("branch at cell#" + id + ", value is " + list[k]);
                        Sudoku s1 = new Sudoku();
                        s1.setSudokuData(solver.getAnswer().getSudokuData());
                        s1.setMember(id, list[k]);
                        stack.add(s1.getSudokuData());// 
                        mark("after adding , size now is " + stack.size());
                    } else {
                        break;
                    }
                }

                mark("stack size is " + stack.size());
                if (stack.size() > 0) {
                    mark(" now ....stack size is " + stack.size());
                    solver.getQuestion().setSudokuData((int[]) stack.pop());
                    mark(" now ....stack size is " + stack.size());

                    solver.getAnswer().setSudokuData(solver.getQuestion().getSudokuData());
                    solver.getPossible().init();
                    solver.run();
                    run2();
                } else {
                    mark("no more Sudoku on stack ");

                    return;
                }

            }
            // int x = Integer.parseInt(arg[argId]);
        }
    }
}
