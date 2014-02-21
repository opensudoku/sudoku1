/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

/**
 * SudokuManager provides service for Sudoku related issues.
 *
 * @author mark
 */
public class SudokuManager {

    /**
     * Returns given Sudoku's value set is good or not.
     * 
     * There are 3x9=27 groups.
     * Each group has 9 cells with value 1 to 9. 0 represents empty, ignore it.
     * No any repeat numbers in any groups is good.
     * 
     *
     * @return 
     * true, a good Sudoku.
     * false, a bad one.
     */
    public boolean isGoodSudoku(Sudoku s) {
        boolean result = true;

        return result;
    }
}
