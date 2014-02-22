/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

import com.livehereandnow.sudoku.util.Sudoku;
import com.livehereandnow.sudoku.util.Group;
import com.livehereandnow.sudoku.util.Groups;

/**
 *
 * @author mark
 */
public class Sudoku9x9Ext extends Sudoku {

    private Group[] possible = new Group[82];
    private Groups[] group=new Groups[82];
    

    public Sudoku9x9Ext() {

        for (int i = 1; i <= 81; i++) {
            Group nine = new Group();
            nine.setMember(1, 1);
            nine.setMember(2, 2);
            nine.setMember(3, 3);
            nine.setMember(4, 4);
            nine.setMember(5, 5);
            nine.setMember(6, 6);
            nine.setMember(7, 7);
            nine.setMember(8, 8);
            nine.setMember(9, 9);

            possible[i] = nine;

            group[i]=new Groups();
            
        }
        
        group[1].setRow(null);
        
        

    }

    public Group getPossible(int id) {
        return possible[id];
    }

    public void setPossible(int id, Group value) {
        this.possible[id] = value;
    }

    /**
     * NOT RIGHT HERE???
     *
     * @param ruleId
     */
    public void doRule(int ruleId) {

        // when value is set, no more possible
        if (ruleId == 1) {
            for (int i = 1; i <= 81; i++) {
                System.out.print(i + "," + this.getMember(i));

                if (this.getMember(i) == 0) {
//                    this.getPossible(i).setMemberAllZero();
//                    System.out.println(" it's 0 ");

                } else {
//                    System.out.println(" it's not o, remove all possible");
                    this.getPossible(i).setMemberAllZero();
//                    this.getPossible(i).setKnownMembers(3, 1);
                }
            }

        }

    }

//    @Override
    public void toPrint() {
        System.out.println("--- super.toPrint()---");
        super.toPrint();

        System.out.println("--- Sudoku9x9Ext.toPrint()---");

        for (int i = 1; i <= 81; i++) {
            System.out.printf("  %2d %d %s %n", i,this.getMember(i), this.getPossible(i).toString());
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Sudoku9x9Ext:\n");
        sb.append(super.toString());
        
        for (int i = 1; i <= 81; i++) {
          sb.append( System.out.format("  %2d %d %s %n", i,this.getMember(i), this.getPossible(i).toString()).toString());
        }
        
                
        return sb.toString();
    }

}
