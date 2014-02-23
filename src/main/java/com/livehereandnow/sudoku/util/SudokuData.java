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
public class SudokuData implements Cloneable {

    private int[] data = new int[82];

    @Override
    protected SudokuData clone() throws CloneNotSupportedException {
        SudokuData sd = new SudokuData();
        sd.data = data.clone();
        return sd;
    }

    public void setData(int id, int val) {
        this.data[id] = val;
    }

    public SudokuData() {

    }

    public SudokuData(String s) {
//        System.out.println("xxxxxxxxxxxxxxxxxxxxinput is " + s);
        int cnt = 0;

        for (int k = 0; k < s.length(); k++) {

            //   System.out.println(" this one is "+s.charAt(k));
            if ((s.charAt(k) >= '0') && (s.charAt(k) <= '9')) {
//                System.out.printf(" ... get %s\n",  s.charAt(k));
                data[++cnt] = s.charAt(k) - '0'; // '0' is base
                if (cnt == 81) {
                    return;
                }
            }

        }

    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 81; i++) {
            sb.append(data[i]);
            if ((i % 9 == 0) && (i < 81)) {
                sb.append("_");
            }
        }
        return sb.toString();
    }
}
