/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.livehereandnow.sudoku.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author mark
 */
public class SudokuTest {
    
    public SudokuTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    /**
     * Test of getNewlyAdded method, of class Sudoku.
     */
    @Test
    public void testGetNewlyAdded() {
        System.out.println("doing here...");
              String str = ""
                + "5, 3, 0, 0, 7, 0, 0, 0, 0,"
                + "6, 0, 0, 1, 9, 5, 0, 0, 0,"
                + "0, 9, 8, 0, 0, 0, 0, 6, 0,"
                + "8, 0, 0, 0, 6, 0, 0, 0, 3,"
                + "4, 0, 0, 8, 0, 3, 0, 0, 1,"
                + "7, 0, 0, 0, 2, 0, 0, 0, 6,"
                + "0, 6, 0, 0, 0, 0, 2, 8, 0,"
                + "0, 0, 0, 4, 1, 9, 0, 0, 5,"
                + "0, 0, 0, 0, 8, 0, 0, 7, 9,";
        Sudoku instance = new Sudoku(str);
       
        instance.show();
    }

 
    
}
