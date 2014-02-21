/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

/**
 * Sudoku is a basic model, size 9x9, to hold 81 values.
 *
 * For application developer, the index of cell is base 1.
 *
 * @version 1.0
 * @since Sudoku 1.0
 * @author mark
 */
public class Sudoku {

    /**
     * no need to let application developer to access
     */
    private int[] member;
    //  private final int[] wikiSample;

    /**
     * Constructs and initializes a Sudoku with all 0 in 81 cells. Index for
     * application developer is 1 to 81, 0 is not in use
     */
    public Sudoku() {
//        this.wikiSample = new int[]{0,
//            5, 3, 0, 0, 7, 0, 0, 0, 0,
//            6, 0, 0, 1, 9, 5, 0, 0, 0,
//            0, 9, 8, 0, 0, 0, 0, 6, 0,
//            8, 0, 0, 0, 6, 0, 0, 0, 3,
//            4, 0, 0, 8, 0, 3, 0, 0, 1,
//            7, 0, 0, 0, 2, 0, 0, 0, 6,
//            0, 6, 0, 0, 0, 0, 2, 8, 0,
//            0, 0, 0, 4, 1, 9, 0, 0, 5,
//            0, 0, 0, 0, 8, 0, 0, 7, 9};
        this.member = new int[82]; // 0 to 80, or 1 to 81 ???
    }

//    public void setSample(int i) {
//        member = wikiSample;
//    }
    /**
     * Returns current Sudoku instance
     *
     * @return this Sudoku
     */
    public Sudoku getSudoku() {
        return this;
    }

 
    
    /**
     * Returns cell value by given index
     *
     * @param id cell id, from 1 to 81
     * @return cell value
     */
    public int getMember(int id) {
        return member[id];
    }
    
    /**
     * Returns the count of cells with values 1 to 9
     * 
     * @return 
     */
    public int getKnownValueCount(){
        int cnt=0;
        for (int i = 1; i <=81; i++) {
            if (member[i]>0){
                cnt++;
            }
        }
        
        return cnt;
    }

    /**
     * Sets cell value by index
     *
     * @param id cell id, from 1 to 81
     * @param val cell value, from 0 to 9, 0 is for empty
     */
    public void setMember(int id, int val) {
        this.member[id] = val;
    }

    /**
     * Sets one row value with 9 cell values
     *
     * @param rowId row number, from 1 to 9
     * @param v1 #1 cell value, from 0 to 9
     * @param v2 #2 cell value, from 0 to 9
     * @param v3 #3 cell value, from 0 to 9
     * @param v4 #4 cell value, from 0 to 9
     * @param v5 #5 cell value, from 0 to 9
     * @param v6 #6 cell value, from 0 to 9
     * @param v7 #7 cell value, from 0 to 9
     * @param v8 #8 cell value, from 0 to 9
     * @param v9 #9 cell value, from 0 to 9
     */
    public void setMemberByRow(int rowId, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        int k = (rowId - 1) * 9;
        this.member[k + 1] = v1;
        this.member[k + 2] = v2;
        this.member[k + 3] = v3;
        this.member[k + 4] = v4;
        this.member[k + 5] = v5;
        this.member[k + 6] = v6;
        this.member[k + 7] = v7;
        this.member[k + 8] = v8;
        this.member[k + 9] = v9;
    }

    public void debug() {
        System.out.println("--- index ---");
        for (int i = 1; i < member.length; i++) {
            System.out.printf("%2d ", i);
            if (i % 9 == 0) {
                System.out.println();
            }
        }

    }

    public void toPrint() {
        System.out.println(" --- Sudoku 9x9 ---");

        for (int i = 1; i < member.length; i++) {
            if (member[i] == 0) {
                System.out.printf(" .");

            } else {
                System.out.printf(" %d", member[i]);
            }

            if (i % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println("Count of cells with value 1 to 9: "+this.getKnownValueCount());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < member.length; i++) {
            sb.append(member[i]);
        }
        return sb.toString();
    }
}
