/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.sudoku.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class Sudoku9x9ExtTest {
    
    public Sudoku9x9ExtTest() {
    }

    /**
     * Test of toPrint method, of class Sudoku9x9Ext.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sudoku9x9Ext instance = new Sudoku9x9Ext();
        instance.setSample();
        instance.toPrint();
        
//        Ten ten=new Ten();
//        ten.setMemberAllZero();
//        instance.setPossible(1, ten);
//     instance.getPossible(1).setMemberAllZero();
//       instance.getPossible(2).setMemberAllZero();
//       instance.getPossible(3).setMemberAllZero();
//       
        System.out.println("member 1");
       
        System.out.println("instance.getMember(1)="+instance.getMember(1));
        System.out.println("instance.getPossible(1)="+instance.getPossible(1));
        instance.getPossible(1).setMember1to9();
        System.out.println("after setMember1to9, instance.getPossible(1)="+instance.getPossible(1));
        
        
          instance.doRule(1);
          instance.toPrint();
          
//        System.out.println(instance.toString());
          
          
    //    new Ten().toPrintMemo();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
