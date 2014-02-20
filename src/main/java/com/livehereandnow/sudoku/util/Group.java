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
public class Group {
private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    protected final int[] member; // 0 to 9

    public Group() {
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

    public void set9Members(int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        this.member[1] = v1;
        this.member[2] = v2;
        this.member[3] = v3;
        this.member[4] = v4;
        this.member[5] = v5;
        this.member[6] = v6;
        this.member[7] = v7;
        this.member[8] = v8;
        this.member[9] = v9;

    }

    public void setMemberAllZero() {
        for (int i = 0; i < member.length; i++) {
            member[i] = 0;
        }
    }

    public void setMemberDefault1to9() {
        for (int i = 0; i < member.length; i++) {
            member[i] = i;
        }

    }

    public String toStringGroupNumbers() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(member[i]).append(",");

        }

        return "group{" + sb.toString() + "}";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < member.length; i++) {
            sb.append(member[i]);
            if (i < member.length - 1) {
                sb.append(',');
            }
        }
        return "Group{" + sb.toString() + "}\n";
    }
}
