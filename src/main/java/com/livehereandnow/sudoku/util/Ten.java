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

    public void setMemberAllZero() {
        for (int i=0;i<member.length;i++){
            member[i]=0;
        }
        
        
    }

    public void toPrint() {
        for (int i = 0; i < member.length; i++) {
            System.out.printf("(%d)%d ", i, member[i]);
        }
        System.out.println();
    }
    public void toPrintMemo() {
        String memo=" on class Sudoku9x9Ext\n"
                +" design Ten to keep possible value of each single cell\n"
                +" (1): 1 menas 1 is possible, 0 menas 1 is not possible\n"
                +" (2): 1 menas 2 is possible, 0 menas 2 is not possible\n"
                +" (3): 1 menas 3 is possible, 0 menas 3 is not possible\n"
                +" (4): 1 menas 4 is possible, 0 menas 4 is not possible\n"
                +" (5): 1 menas 5 is possible, 0 menas 5 is not possible\n"
                +" (6): 1 menas 6 is possible, 0 menas 6 is not possible\n"
                +" (7): 1 menas 7 is possible, 0 menas 7 is not possible\n"
                +" (8): 1 menas 8 is possible, 0 menas 8 is not possible\n"
                +" (9): 1 menas 9 is possible, 0 menas 9 is not possible\n"
                ;
                
        
        System.out.println(memo);
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < member.length; i++) {
            sb.append("(").append(i).append(")");
            sb.append(member[i]).append(" ");
        
        
        }
        return "Ten{" + sb.toString()+"}";
    }
}
