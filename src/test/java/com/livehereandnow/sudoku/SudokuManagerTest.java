/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku;

import com.livehereandnow.sudoku.util.Sudoku;
import com.livehereandnow.sudoku.util.Directory;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class SudokuManagerTest {

    public SudokuManagerTest() {
    }

    /**
     * Test of isGoodSudoku method, of class SudokuManager.
     */
    @Test
    public void testIsGoodSudoku() {
        System.out.println("doing...isGoodSudoku, from SudokuManager's viewpoint");
        Sudoku s = new Sudoku();
        s.setMemberByRow(1, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        SudokuManager sm = new SudokuManager();
        sm.setMembers(s.getSudokuIntArray());
        sm.toPrint();
        Directory dir=new Directory();
        dir.setSudokuMemberSet(s.getSudokuIntArray());
        
        dir.getRowGroup(1);

    }

}

