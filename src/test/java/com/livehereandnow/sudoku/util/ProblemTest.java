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
public class ProblemTest {

    public ProblemTest() {
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
     * Test of getProblem method, of class Problem.
     */
    @Test
    public void testGetProblem() {
        System.out.println("getProblem");
        Problem problem = new Problem();
        problem.toPrint();
    }

    /**
     * Test of setProblem method, of class Problem.
     */
    @Test
    public void testSetProblem() {
        System.out.println("setProblem");
        int[] problem = {1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9,
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        Problem instance = new Problem();
        instance.setProblem(problem);
        instance.toPrint();
    }

    /**
     * Test of toString method, of class Problem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Problem instance = new Problem();
        String expResult = "";
        String result = instance.toString();
        System.out.println(result);
    }

    /**
     * Test of toPrint method, of class Problem.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Problem instance = new Problem();
        instance.toPrint();
        // TODO review the generated test code and remove the default call to fail.
  //      fail("The test case is a prototype.");
    }

}
