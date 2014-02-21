/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

/**
 * Sudoku basic model, for size 9x9 to set Sudoku question to get status, how
 * many cells solved and total possible count in order to be provide possible
 * number count based on simple rule: to eliminate possible number from known
 * value for each cell if value>0 reset this cell possible numbers to none
 * eliminate possible of 3 group's members
 *
 *
 * Sudoku should be just like Point, 2/21/2014 It's 81 cells, each cell can be 0
 * to 9 integer We can setSudoku by String or int[] or per cell or per row,
 * possible per col/box
 *
 * @author mark
 */
public class Sudoku {

    private int[] member;
    //  private final int[] wikiSample;

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
    public Sudoku getSudoku() {
        return this;
    }

    /**
     *
     * @param id, 1 to 81, by Row x Col
     * @return 0 to 9, 0 means empty, 1 to 9 are visible to users
     */
    public int getMember(int id) {
        return member[id];
    }

    public void setMember(int id, int val) {
        this.member[id] = val;
    }

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
        System.out.println();
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
