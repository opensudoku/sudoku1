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
public class Groups {
    private Group row;
    private Group col;
    private Group box;

    public Groups() {
    }

    public Groups(Group row, Group col, Group box) {
        this.row = row;
        this.col = col;
        this.box = box;
    }

    public Group getRow() {
        return row;
    }

    public void setRow(Group row) {
        this.row = row;
    }

    public Group getCol() {
        return col;
    }

    public void setCol(Group col) {
        this.col = col;
    }

    public Group getBox() {
        return box;
    }

    public void setBox(Group box) {
        this.box = box;
    }

    @Override
    public String toString() {
        return "Groups{" + "row#" + row.getId() + ", col#" + col.getId() + ", box#" + box.getId() + "}\n";
    }
    
}
