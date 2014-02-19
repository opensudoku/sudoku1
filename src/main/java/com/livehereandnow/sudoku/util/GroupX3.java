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
public class GroupX3 {
    private SudokuGroup row;
    private SudokuGroup col;
    private SudokuGroup box;


    public SudokuGroup getRow() {
        return row;
    }

    public void setRow(SudokuGroup row) {
        this.row = row;
    }

    public SudokuGroup getCol() {
        return col;
    }

    public void setCol(SudokuGroup col) {
        this.col = col;
    }

    public SudokuGroup getBox() {
        return box;
    }

    public void setBox(SudokuGroup box) {
        this.box = box;
    }
    
    
}
