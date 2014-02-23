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
public class SudokuDataTest {
    static void show(String str){
        System.out.println(str);
    }
    public SudokuDataTest() {
    }

    /**
     * Test of clone method, of class SudokuData.
     */
    @Test
    public void testClone() throws Exception {
        SudokuData sd1=new SudokuData("12345");
        SudokuData sd2=new SudokuData();
        sd2=sd1.clone();
        show(sd1.toString());
        show(sd2.toString());
        sd2.setData(1, 9);
        show(sd1.toString());
        show(sd2.toString());
        
        
    }

    /**
     * Test of getData method, of class SudokuData.
     */
    @Test
    public void testGetData() {
    }

    /**
     * Test of setData method, of class SudokuData.
     */
    @Test
    public void testSetData() {
    }

    /**
     * Test of toString method, of class SudokuData.
     */
    @Test
    public void testToString() {
    }
    
}
