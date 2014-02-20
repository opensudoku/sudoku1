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
public class Sudoku9x9Ext extends Sudoku9x9{
    private Ten[] possible=new Ten[82];

    public Sudoku9x9Ext() {
        Ten ten=new Ten();
        ten.setMember(1, 1);
        ten.setMember(2, 2);
        ten.setMember(3, 3);
        ten.setMember(4, 4);
        ten.setMember(5, 5);
        ten.setMember(6, 6);
        ten.setMember(7, 7);
        ten.setMember(8, 8);
        ten.setMember(9, 9);
        
        for (int i=1;i<=81;i++){
           possible[i]=ten;
           
        }
        
    }

    
    public Ten[] getPossible() {
        return possible;
    }

    public void setPossible(int id, Ten value) {
        this.possible[id] = value;
    }
    
    public void toPrint(){
        System.out.println("--- super.toPrint()---");
        super.toPrint();
        
        System.out.println("--- Sudoku9x9Ext.toPrint()---");
        
        for (int i=1;i<=81;i++){
            System.out.printf("  %2d %s    %n", i,possible[i].toString());
        }
        
    }
    
}
