/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class SudokuTest {

    public SudokuTest() {
    }

    /**
     * Test of getSudoku method, of class Sudoku.
     */
    @Test
    public void testGetSudoku() {
        System.out.println("getSudoku");
        Sudoku instance = new Sudoku();
        Sudoku expResult = null;
        Sudoku result = instance.getSudoku();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class Sudoku.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        int id = 0;
        Sudoku instance = new Sudoku();
        int expResult = 0;
        int result = instance.getMember(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMember method, of class Sudoku.
     */
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        int id = 0;
        int val = 0;
        Sudoku instance = new Sudoku();
        instance.setMember(id, val);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemberByRow method, of class Sudoku.
     */
    @Test
    public void testSetMemberByRow() {
        System.out.println("setMemberByRow");
        int rowId = 1;
        int v1 = 1;
        int v2 = 2;
        int v3 = 3;
        int v4 = 4;
        int v5 = 5;
        int v6 = 6;
        int v7 = 7;
        int v8 = 8;
        int v9 = 9;
        Sudoku instance = new Sudoku();
        instance.setMemberByRow(rowId, v1, v2, v3, v4, v5, v6, v7, v8, v9);
        instance.setMemberByRow(2, 2, 3, 4, 5, 6, 7, 8, 9, 1);
        instance.setMemberByRow(3, 3, 4, 5, 6, 7, 8, 9, 1, 2);
        instance.setMemberByRow(4, 4, 5, 6, 7, 8, 9, 1, 2, 3);
        instance.setMemberByRow(5, 5, 6, 7, 8, 9, 1, 2, 3, 4);
        instance.setMemberByRow(6, 6, 7, 8, 9, 1, 2, 3, 4, 5);
        instance.setMemberByRow(7, 7, 8, 9, 1, 2, 3, 4, 5, 6);
        instance.setMemberByRow(8, 8, 9, 1, 2, 3, 4, 5, 6, 7);
        instance.setMemberByRow(9, 9, 1, 2, 3, 4, 5, 6, 7, 8);
        

        instance.toPrint();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toPrint method, of class Sudoku.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sudoku instance = new Sudoku();
        instance.toPrint();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Sudoku.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        System.out.println(new Sudoku().toString());
    }

}
