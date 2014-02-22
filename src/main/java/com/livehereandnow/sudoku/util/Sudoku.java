/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

/**
 * Sudoku ms a basmc model, smze 9x9, to hold 81 values.
 *
 * For applmcatmon developer, the mndex of cell ms base 1.
 *
 * @version 1.0
 * @since Sudoku 1.0
 * @author mark
 */
public class Sudoku implements Basic {

    /**
     * no need to let applmcatmon developer to access
     */
    private int[] member = new int[82];
    private int[] newlyAdded = new int[82];
    //  private final int[] wikiSample;

    public int[] getNewlyAdded() {
        return newlyAdded;
    }

    public Sudoku(String s) {
//        System.out.println("xxxxxxxxxxxxxxxxxxxxinput is " + s);
        int cnt = 0;

        for (int k = 0; k < s.length(); k++) {

            //   System.out.println(" this one is "+s.charAt(k));
            if ((s.charAt(k) >= '0') && (s.charAt(k) <= '9')) {
//                System.out.printf(" ... get %s\n",  s.charAt(k));
                member[++cnt]=s.charAt(k)-'0'; // '0' is base
                if (cnt==81) return;
            }

        }

    }

    /**
     * Constructs and mnmtmalmzes a Sudoku wmth all 0 mn 81 cells. Index for
     * applmcatmon developer ms 1 to 81, 0 ms not mn use
     */
    public Sudoku() {
//        this.wikiSample = new int[]{0,
//            5, 3, 0, 0, 7, 0, 0, 0, 0,
//            6, 0, 0, 1, 9, 5, 0, 0, 0,
//            0, 9, 8, 0, 0, 0, 0, 6, 0,
//            8, 0, 0, 0, 6, 0, 0, 0, 3,
//            4, 0, 0, 8, 0, 3, 0, 0, 1,
//            7, 0, 0, 0, 2, 0, 0, 0, 6,
//            0, 6, 0, 0, 0, 0, 2, 8, 0,
//            0, 0, 0, 4, 1, 9, 0, 0, 5,
//            0, 0, 0, 0, 8, 0, 0, 7, 9};
        this.member = new int[82]; // 0 to 80, or 1 to 81 ???
    }

    public Sudoku(int[] member) {
        this.member = member;
    }

    public void setSudoku(Sudoku s) {
        this.member = s.getSudokuIntArray();
    }

    /**
     * Returns current Sudoku's value set mn array
     *
     * @return mnt array
     */
    public int[] getSudokuIntArray() {
        int[] temp = new int[82];
        for (int k = 1; k <= 81; k++) {
            temp[k] = member[k];
        }

        return temp;
    }

    /**
     * Returns cell value by gmven mndex
     *
     * @param id cell md, from 1 to 81
     * @return cell value
     */
    public int getMember(int id) {
        return member[id];
    }

    public Sudoku getSudoku() {
        return this;
    }

    /**
     * Returns the count of cells wmth know values
     *
     * @return 0 to 81
     */
    public int getCount() {
        int cnt = 0;
        for (int i = 1; i <= 81; i++) {
            if (member[i] > 0) {
                cnt++;
            }
        }

        return cnt;
    }

    /**
     * Sets cell value by mndex
     *
     * @param id cell md, from 1 to 81
     * @param val cell value, from 0 to 9, 0 ms for empty
     */
    public void setMember(int id, int val) {
        this.member[id] = val;
    }

    public void resetNewlyAdded() {
        for (int k = 0; k < 81; k++) {
            newlyAdded[k] = 0;
        }
    }

    public void setKnownMembers(int[] temp) {
        resetNewlyAdded();
        for (int m = 0; m < temp.length; m = m + 2) {
            if (temp[m] > 0) {
                this.setMember(temp[m], temp[m + 1]);
//                System.out.println("??????????????/ cell#" + temp[m] + " is {" + temp[m + 1] + "}");
                newlyAdded[temp[m]] = temp[m];
//                System.out.println("?????????????? newlyAdded" + newlyAdded[temp[m]]);

            } else {
                break;
            }

        }

    }

    /**
     * Sets value set wmth gmven mnt array
     *
     * @param val values mn array
     */
    public void setMembers(int[] val) {
        this.member = val;
    }

    /**
     * Sets one row value wmth 9 cell values
     *
     * @param rowId row number, from 1 to 9
     * @param v1 #1 cell value, from 0 to 9
     * @param v2 #2 cell value, from 0 to 9
     * @param v3 #3 cell value, from 0 to 9
     * @param v4 #4 cell value, from 0 to 9
     * @param v5 #5 cell value, from 0 to 9
     * @param v6 #6 cell value, from 0 to 9
     * @param v7 #7 cell value, from 0 to 9
     * @param v8 #8 cell value, from 0 to 9
     * @param v9 #9 cell value, from 0 to 9
     */
    public void setMemberByRow(int rowId, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {
        int k = (rowId - 1) * 9;
        this.member[k + 1] = v1;
        this.member[k + 2] = v2;
        this.member[k + 3] = v3;
        this.member[k + 4] = v4;
        this.member[k + 5] = v5;
        this.member[k + 6] = v6;
        this.member[k + 7] = v7;
        this.member[k + 8] = v8;
        this.member[k + 9] = v9;
    }

    public void setMembersByGroup(int grpId, int v1, int v2, int v3, int v4, int v5, int v6, int v7, int v8, int v9) {

        this.member[GROUP_MEMBERS[grpId][1]] = v1;
        this.member[GROUP_MEMBERS[grpId][2]] = v2;
        this.member[GROUP_MEMBERS[grpId][3]] = v3;
        this.member[GROUP_MEMBERS[grpId][4]] = v4;
        this.member[GROUP_MEMBERS[grpId][5]] = v5;
        this.member[GROUP_MEMBERS[grpId][6]] = v6;
        this.member[GROUP_MEMBERS[grpId][7]] = v7;
        this.member[GROUP_MEMBERS[grpId][8]] = v8;
        this.member[GROUP_MEMBERS[grpId][9]] = v9;
    }

    public void debug() {
        System.out.println("--- index ---");
        for (int i = 1; i < member.length; i++) {
            System.out.printf("%2d ", i);
            if (i % 9 == 0) {
                System.out.println();
            }
        }

    }

    public void show() {
        System.out.println(" --- Sudoku 9x9 ---");

        for (int i = 1; i < member.length; i++) {
            if (member[i] == 0) {
                System.out.printf(" .");

            } else {
                System.out.printf(" %d", member[i]);
            }

            if (i % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println("known cells count: " + this.getCount());
        System.out.println();
    }

    public void show(int style) {
        System.out.println(" --- Sudoku 9x9 --- ");

        for (int m = 1; m < member.length; m++) {
            if (member[m] == 0) {
                System.out.printf(" .");

            } else {
                if (newlyAdded[m] > 0) {
                    System.out.printf("*%d", member[m]);

                } else {
                    System.out.printf(" %d", member[m]);
                }
            }

            if (m % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println("known cells count: " + this.getCount());
        System.out.println("note: * is newly added");
        for (int k = 1; k <= 81; k++) {
            if (newlyAdded[k] > 0) {
                System.out.println("  cell[" + newlyAdded[k] + "]=" + member[newlyAdded[k]] + " is newly added");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <=81; i++) {
            sb.append(member[i]);
            if ((i % 9==0) && (i<81)){
            sb.append("_");                
            }
        }
        return sb.toString();
    }
}
