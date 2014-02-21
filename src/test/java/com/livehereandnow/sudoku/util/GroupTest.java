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
public class GroupTest {
    
    public GroupTest() {
    }

    /**
     * Test of getId method, of class Group.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Group instance = new Group();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Group.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Group instance = new Group();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class Group.
     */
    @Test
    public void testGetMember_0args() {
        System.out.println("getMember");
        Group instance = new Group();
        int[] expResult = null;
        int[] result = instance.getMember();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class Group.
     */
    @Test
    public void testGetMember_int() {
        System.out.println("getMember");
        int id = 0;
        Group instance = new Group();
        int expResult = 0;
        int result = instance.getMember(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMember method, of class Group.
     */
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        int id = 0;
        int val = 0;
        Group instance = new Group();
        instance.setMember(id, val);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set9Members method, of class Group.
     */
    @Test
    public void testSet9Members() {
        System.out.println("set9Members");
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        Group instance = new Group();
        instance.set9Members(v1, v2, v3, v4, v5, v6, v7, v8, v9);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemberAllZero method, of class Group.
     */
    @Test
    public void testSetMemberAllZero() {
        System.out.println("setMemberAllZero");
        Group instance = new Group();
        instance.setMemberAllZero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMemberDefault1to9 method, of class Group.
     */
    @Test
    public void testSetMemberDefault1to9() {
        System.out.println("setMemberDefault1to9");
        Group instance = new Group();
        instance.setMemberDefault1to9();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toStringGroupNumbers method, of class Group.
     */
    @Test
    public void testToStringGroupNumbers() {
        System.out.println("toStringGroupNumbers");
        Group instance = new Group();
        String expResult = "";
        String result = instance.toStringGroupNumbers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Group.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Group instance = new Group();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
