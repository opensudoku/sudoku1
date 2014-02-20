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
public class Ten {

    private final int[] member; // 0 to 9

    public Ten() {
        this.member = new int[10];
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
        for (int i = 0; i < member.length; i++) {
            System.out.printf("(%d)%d ", i, member[i]);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < member.length; i++) {
            sb.append(member[i]).append(" ");
        }
        return "Ten{" + sb.toString()+"}";
    }
}
