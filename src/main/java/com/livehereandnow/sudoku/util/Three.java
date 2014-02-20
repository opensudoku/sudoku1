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
public class Three {
    private Nine row;
    private Nine col;
    private Nine box;

    public Three() {
    }

    public Three(Nine row, Nine col, Nine box) {
        this.row = row;
        this.col = col;
        this.box = box;
        System.out.println("??????????????"+row.toStringGroupNumbers());
    }

    public Nine getRow() {
        return row;
    }

    public void setRow(Nine row) {
        this.row = row;
    }

    public Nine getCol() {
        return col;
    }

    public void setCol(Nine col) {
        this.col = col;
    }

    public Nine getBox() {
        return box;
    }

    public void setBox(Nine box) {
        this.box = box;
    }
}
