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
public class Coordinate {

    public SudokuGroup getRow(int index) {
        SudokuGroup sg = new SudokuGroup();

        switch (index) {
            case 0:
                sg.setMember(0, 1, 2, 3, 4, 5, 6, 7, 8);
                break;
            case 1:
                sg.setMember(9, 10, 11, 12, 13, 14, 15, 16, 17);
                break;
            case 2:
                sg.setMember(18, 19, 20, 21, 22, 23, 24, 25, 26);
                break;
            case 3:
                sg.setMember(27, 28, 29, 30, 31, 32, 33, 34, 35);
                break;
            case 4:
                sg.setMember(36, 37, 38, 39, 40, 41, 42, 43, 44);
                break;
            case 5:
                sg.setMember(45, 46, 47, 48, 49, 50, 51, 52, 53);
                break;
            case 6:
                sg.setMember(54, 55, 56, 57, 58, 59, 60, 61, 62);
                break;
            case 7:
                sg.setMember(63, 64, 65, 66, 67, 68, 69, 70, 71);
                break;
            case 8:
                sg.setMember(72, 73, 74, 75, 76, 77, 78, 79, 80);
                break;
        }
        return sg;
    }

    public SudokuGroup getCol(int index) {
        SudokuGroup sg = new SudokuGroup();

        switch (index) {
            case 0:
                sg.setMember(0, 9, 18, 27, 36, 45, 54, 63, 72);
                break;
            case 1:
                sg.setMember(1, 10, 19, 28, 37, 46, 55, 64, 73);
                break;
            case 2:
                sg.setMember(2, 11, 20, 29, 38, 47, 56, 65, 74);
                break;
            case 3:
                sg.setMember(3, 12, 21, 30, 39, 48, 57, 66, 75);
                break;
            case 4:
                sg.setMember(4, 13, 22, 31, 40, 49, 58, 67, 76);
                break;
            case 5:
                sg.setMember(5, 14, 23, 32, 41, 50, 59, 68, 77);
                break;
            case 6:
                sg.setMember(6, 15, 24, 33, 42, 51, 60, 69, 78);
                break;
            case 7:
                sg.setMember(7, 16, 25, 34, 43, 52, 61, 70, 79);
                break;
            case 8:
                sg.setMember(8, 17, 26, 35, 44, 53, 62, 71, 80);
                break;
        }
        return sg;
    }

    public SudokuGroup getBox(int index) {
        SudokuGroup sg = new SudokuGroup();

        switch (index) {
            case 0:
                sg.setMember(0, 1, 2, 9, 10, 11, 18, 19, 20);
                break;
            case 1:
                sg.setMember(3, 4, 5, 12, 13, 14, 21, 22, 23);
                break;
            case 2:
                sg.setMember(6, 7, 8, 15, 16, 17, 24, 25, 26);
                break;
            case 3:
                sg.setMember(27, 28, 29, 36, 37, 38, 45, 46, 47);
                break;
            case 4:
                sg.setMember(30, 31, 32, 39, 40, 41, 48, 49, 50);
                break;
            case 5:
                sg.setMember(33, 34, 35, 42, 43, 44, 51, 52, 53);
                break;
            case 6:
                sg.setMember(54, 55, 56, 63, 64, 65, 72, 73, 74);
                break;
            case 7:
                sg.setMember(57, 58, 59, 66, 67, 68, 75, 76, 77);
                break;
            case 8:
                sg.setMember(60, 61, 62, 69, 70, 71, 78, 79, 80);
                break;
        }
        return sg;
    }

}
