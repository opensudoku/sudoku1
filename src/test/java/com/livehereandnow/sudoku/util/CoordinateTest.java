/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mark
 */
public class CoordinateTest {

    public CoordinateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getRow method, of class Coordinate.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        Coordinate seq = new Coordinate();
        SudokuGroup sg;

        for (int g = 0; g < 9; g++) {
            sg = seq.getRow(g);

            for (int i = 0; i < 9; i++) {
                //  System.out.print(sg.getMember()[i] + ",");
                System.out.printf("%2d ", sg.getMember()[i]);
            }
            System.out.println();
        }
    }

    /**
     * Test of getCol method, of class Coordinate.
     */
    @Test
    public void testGetCol() {
        System.out.println("getCol");
        Coordinate seq = new Coordinate();
        SudokuGroup sg;

        for (int g = 0; g < 9; g++) {
            sg = seq.getCol(g);

            for (int i = 0; i < 9; i++) {
                //  System.out.print(sg.getMember()[i] + ",");
                System.out.printf("%2d ", sg.getMember()[i]);
            }
            System.out.println();
        }
    }

    /**
     * Test of getBox method, of class Coordinate.
     */
    @Test
    public void testGetBox() {
        System.out.println("getBox");
        Coordinate seq = new Coordinate();
        SudokuGroup sg;

        for (int g = 0; g < 9; g++) {
            sg = seq.getBox(g);

            for (int i = 0; i < 9; i++) {
                //  System.out.print(sg.getMember()[i] + ",");
                System.out.printf("%2d ", sg.getMember()[i]);
            }
            System.out.println();
        }
    }

    public class CoordinateImpl extends Coordinate {
    }

}
