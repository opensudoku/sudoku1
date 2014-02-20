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
public class TenTest {
    


    /**
     * Test of toPrint method, of class Ten.
     */
    @Test
    public void testToPrint() {
        System.out.println("toPrint");
        Ten instance = new Ten();
        
        
        instance.toPrint();
//        instance.setMember(0, 0);
        instance.setMember(1, 1);
        instance.setMember(2, 2);
        instance.setMember(3, 3);
        instance.toPrint();
        
        int []x={5,4,3};
     //   instance.setMember(x);
        instance.toPrint();
        
        
    }

    /**
     * Test of toString method, of class Ten.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ten instance = new Ten();
        String expResult = "";
        String result = instance.toString();
        System.out.println(result);
    }
    
}
