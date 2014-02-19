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
public class Possible {

    private int[][] possible = new int[81][10];

    public int[] getPossible(int id) {
        return possible[id];
    }

    public void setPossible(int id, int[] val) {
        this.possible[id] = val;
    }

    public void init() {
        for (int id = 0; id < 81; id++) {
            // System.out.printf("%2d ", id);

            for (int i = 0; i < 10; i++) {
                possible[id][i] = i;
            }

        }
    }
    public void removeValueByGroup(int val, int grpId){
        
    }
    
    public void toPrint() {
        for (int id = 0; id < 81; id++) {
            System.out.printf("%2d ", id);

            for (int i = 0; i < 10; i++) {
                System.out.printf("%d", possible[id][i]);

            }
            System.out.printf("\n");

        }
    }
}
