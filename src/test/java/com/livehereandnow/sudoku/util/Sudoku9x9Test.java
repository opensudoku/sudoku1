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
public class Sudoku9x9Test {
    
    public Sudoku9x9Test() {
    }

    /**
     * Test of getMember method, of class Sudoku9x9.
     */
   

    /**
     * Test of toPrint method, of class Sudoku9x9.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sudoku9x9 instance = new Sudoku9x9();
        instance.toPrint();
        instance.setSample();
        instance.toPrint();
        
    }

    /**
     * Test of toString method, of class Sudoku9x9.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sudoku9x9 instance = new Sudoku9x9();
        String expResult = "";
        String result = instance.toString();
   
    }
    
}
