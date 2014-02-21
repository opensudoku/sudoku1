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
     * Test of toPrint method, of class SudokuSolver.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Sudoku s = new Sudoku();

        int grp1 = 12;
        int grp2 = 10;
        int grp3 = 19;
      SudokuSolver instance;
        
        instance =new SudokuSolver(s);
        for (int m = 1; m <= 9; m++) {
            s.setMembersByGroup(m, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            s.toPrint();
            assertTrue(instance.isGroupGood(m));
        }
        instance =new SudokuSolver(s);
        for (int m = 10; m <= 18; m++) {
            s.setMembersByGroup(m, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            s.toPrint();
            assertTrue(instance.isGroupGood(m));
        }
        instance =new SudokuSolver(s);
        for (int m = 19; m <= 27; m++) {
            s.setMembersByGroup(m, 1, 2, 3, 4, 5, 6, 7, 8, 9);
            s.toPrint();
            assertTrue(instance.isGroupGood(m));
        }
        
        
        
//        s.setMembersByGroup(grp2, 0, 2, 3, 4, 5, 6, 7, 8, 9);
//        s.setMembersByGroup(grp3, 1, 0, 3, 4, 5, 0, 7, 0, 0);

//        assertFalse(instance.isGroupGood(grp2));
//        assertFalse(instance.isGroupGood(grp3));
    }
}
