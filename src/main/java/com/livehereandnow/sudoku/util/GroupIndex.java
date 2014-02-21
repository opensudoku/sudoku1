//   2/20/2014, got some idea create class Directory ... mark
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

/**
 *
 * @author mark
 */
public class GroupIndex implements Basic {

    public void toPrint() {
        System.out.println(" testing  toPrint --- start");
        System.out.println("=== GROUP_MEMBERS");

        for (int m = 1; m < GROUP_MEMBERS.length; m++) {
            //    int[] x = GROUP_MEMBERS[m];
            System.out.printf(" grp#%2d:", m);
            for (int n = 1; n < GROUP_MEMBERS[m].length; n++) {
                System.out.printf(" %2d", GROUP_MEMBERS[m][n]);
            }
            System.out.println();
        }
        System.out.println("=== CELL_GROUPS");

        for (int m = 1; m < CELL_GROUPS.length; m++) {
            //    int[] x = GROUP_MEMBERS[m];
            System.out.printf(" cell#%2d:", m);
            for (int n = 1; n < CELL_GROUPS[m].length; n++) {
                System.out.printf(" %2d", CELL_GROUPS[m][n]);
            }
            System.out.println();
        }

        System.out.println("testing  toPrint --- end");

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 27; i++) {
            sb.append("grp#").append(i);
        }

        return sb.toString();
    }

}
