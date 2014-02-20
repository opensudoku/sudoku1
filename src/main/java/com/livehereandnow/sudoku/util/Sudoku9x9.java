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
public class Sudoku9x9 {

    private int[] member;
    private final int[] wikiSample;

    public Sudoku9x9() {
        this.wikiSample = new int[]{0,
            5, 3, 0, 0, 7, 0, 0, 0, 0,
            6, 0, 0, 1, 9, 5, 0, 0, 0,
            0, 9, 8, 0, 0, 0, 0, 6, 0,
            8, 0, 0, 0, 6, 0, 0, 0, 3,
            4, 0, 0, 8, 0, 3, 0, 0, 1,
            7, 0, 0, 0, 2, 0, 0, 0, 6,
            0, 6, 0, 0, 0, 0, 2, 8, 0,
            0, 0, 0, 4, 1, 9, 0, 0, 5,
            0, 0, 0, 0, 8, 0, 0, 7, 9};
        this.member = new int[82]; // 0 to 80, or 1 to 81 ???
    }

    public void setSample() {
        member = wikiSample;
    }

    public int[] getMember() {
        return member;
    }

    public int getMember(int id) {
        return member[id];
    }

//    public void setMember(int[] member) {
//        this.member = member;
//    }
    public void setMember(int id, int val) {
        this.member[id] = val;
    }

    public void toPrint() {
        System.out.println("--- index ---");
        for (int i = 1; i < member.length; i++) {
            System.out.printf("%2d ", i);
            if (i % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println("--- value ---");

        for (int i = 1; i < member.length; i++) {
            if (member[i] == 0) {
        System.out.printf(" . ");
        
            } else {
                System.out.printf("%2d ", member[i]);
            }

            if (i % 9 == 0) {
                System.out.println();
            }
        }
//        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < member.length; i++) {
            sb.append(member[i]).append(" ");
        }
        return "Ten{" + sb.toString() + "}";
    }
}
