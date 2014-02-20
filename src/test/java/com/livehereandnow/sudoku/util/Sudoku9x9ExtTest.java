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
        
        Ten ten=new Ten();
        ten.setMemberAllZero();
        instance.setPossible(1, ten);
        instance.toPrint();
        ten.toPrintMemo();
        
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
