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
public interface SudokuCellSequence {

    public class SudokuGroup {

        private int member[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        public int[] getMember() {
            return member;
        }
        public void setMember(int v0,int v1,int v2,int v3,int v4,
                int v5,int v6,int v7,int v8 ){
            member[0]=v0;
            member[1]=v1;
            member[2]=v2;
            member[3]=v3;
            member[4]=v4;
            member[5]=v5;
            member[6]=v6;
            member[7]=v7;
            member[8]=v8;            
        }
    }

    SudokuGroup getRow(int index);

    SudokuGroup getCol(int index);

    SudokuGroup getBox(int index);

}
