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
public class GroupIndexTest {

    /**
     * Test of toPrint method, of class GroupIndex.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sudoku s = new Sudoku();
        s.setMemberByRow(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        s.setMemberByRow(2, 1, 2, 3, 0, 5, 6, 1, 8, 0);
        s.toPrint();
        GroupIndex instance = new GroupIndex(s);
        assertTrue(instance.isGroupGood(1));
        assertFalse(instance.isGroupGood(2));
    }
}
