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
    private Problem problem=new Problem();
    private Problem answer=new Problem();
    
    private int[][] possible=new int[81][10];
    
    private Checker checker=new Checker();
    public Solver() {
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
    
    public void doAnswer(){
        // method 1
        // for given cell, byRow,byCol and byBox
        // if only one number didn't show, then it is the number
        
        // method 2
        // possible array
        // for given cell, known number, to elimilate same possible number on
        // same row
        // same col
        // same box
    }
}
