/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opensudoku.util;

/**
 * Provides basic coordinate to identify Sudoku's cells and groups.
 *
 * @author mark
 */
public interface Coordinate {
    // for status
    
    int THIS_SUDOKU_IS_SOLVED=0;
    int THIS_SUDOKU_IS_BROKEN=1;
    int THIS_SUDOKU_IS_UNKNOWN=2;
    int ANSWER_COUNT_IS_0=0;
    int ANSWER_COUNT_IS_1=1;
    int ANSWER_COUNT_IS_2=2;
    int ANSWER_COUNT_IS_3_OR_MORE=3;
    
    
    
    /**
     * There are total 27 groups, 9 for rows, 9 for columns and 9 for boxes.
     * Each group contains 9 cells. All index for application programming is 1
     * base.
     */
    int[][] GROUP_MEMBERS = {null,
        {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        {0, 10, 11, 12, 13, 14, 15, 16, 17, 18},
        {0, 19, 20, 21, 22, 23, 24, 25, 26, 27},
        {0, 28, 29, 30, 31, 32, 33, 34, 35, 36},
        {0, 37, 38, 39, 40, 41, 42, 43, 44, 45},
        {0, 46, 47, 48, 49, 50, 51, 52, 53, 54},
        {0, 55, 56, 57, 58, 59, 60, 61, 62, 63},
        {0, 64, 65, 66, 67, 68, 69, 70, 71, 72},
        {0, 73, 74, 75, 76, 77, 78, 79, 80, 81},
        {0, 1, 10, 19, 28, 37, 46, 55, 64, 73},
        {0, 2, 11, 20, 29, 38, 47, 56, 65, 74},
        {0, 3, 12, 21, 30, 39, 48, 57, 66, 75},
        {0, 4, 13, 22, 31, 40, 49, 58, 67, 76},
        {0, 5, 14, 23, 32, 41, 50, 59, 68, 77},
        {0, 6, 15, 24, 33, 42, 51, 60, 69, 78},
        {0, 7, 16, 25, 34, 43, 52, 61, 70, 79},
        {0, 8, 17, 26, 35, 44, 53, 62, 71, 80},
        {0, 9, 18, 27, 36, 45, 54, 63, 72, 81},
        {0, 1, 2, 3, 10, 11, 12, 19, 20, 21},
        {0, 4, 5, 6, 13, 14, 15, 22, 23, 24},
        {0, 7, 8, 9, 16, 17, 18, 25, 26, 27},
        {0, 28, 29, 30, 37, 38, 39, 46, 47, 48},
        {0, 31, 32, 33, 40, 41, 42, 49, 50, 51},
        {0, 34, 35, 36, 43, 44, 45, 52, 53, 54},
        {0, 55, 56, 57, 64, 65, 66, 73, 74, 75},
        {0, 58, 59, 60, 67, 68, 69, 76, 77, 78},
        {0, 61, 62, 63, 70, 71, 72, 79, 80, 81}

    };

    /**
     * for any given cell,there are 3 groups involved: row, col and box.
     */
    int[][] CELL_GROUPS = {null,
        {0, 1, 10, 19},
        {0, 1, 11, 19},
        {0, 1, 12, 19},
        {0, 1, 13, 20},
        {0, 1, 14, 20},
        {0, 1, 15, 20},
        {0, 1, 16, 21},
        {0, 1, 17, 21},
        {0, 1, 18, 21},
        {0, 2, 10, 19},
        {0, 2, 11, 19},
        {0, 2, 12, 19},
        {0, 2, 13, 20},
        {0, 2, 14, 20},
        {0, 2, 15, 20},
        {0, 2, 16, 21},
        {0, 2, 17, 21},
        {0, 2, 18, 21},
        {0, 3, 10, 19},
        {0, 3, 11, 19},
        {0, 3, 12, 19},
        {0, 3, 13, 20},
        {0, 3, 14, 20},
        {0, 3, 15, 20},
        {0, 3, 16, 21},
        {0, 3, 17, 21},
        {0, 3, 18, 21},
        {0, 4, 10, 22},
        {0, 4, 11, 22},
        {0, 4, 12, 22},
        {0, 4, 13, 23},
        {0, 4, 14, 23},
        {0, 4, 15, 23},
        {0, 4, 16, 24},
        {0, 4, 17, 24},
        {0, 4, 18, 24},
        {0, 5, 10, 22},
        {0, 5, 11, 22},
        {0, 5, 12, 22},
        {0, 5, 13, 23},
        {0, 5, 14, 23},
        {0, 5, 15, 23},
        {0, 5, 16, 24},
        {0, 5, 17, 24},
        {0, 5, 18, 24},
        {0, 6, 10, 22},
        {0, 6, 11, 22},
        {0, 6, 12, 22},
        {0, 6, 13, 23},
        {0, 6, 14, 23},
        {0, 6, 15, 23},
        {0, 6, 16, 24},
        {0, 6, 17, 24},
        {0, 6, 18, 24},
        {0, 7, 10, 25},
        {0, 7, 11, 25},
        {0, 7, 12, 25},
        {0, 7, 13, 26},
        {0, 7, 14, 26},
        {0, 7, 15, 26},
        {0, 7, 16, 27},
        {0, 7, 17, 27},
        {0, 7, 18, 27},
        {0, 8, 10, 25},
        {0, 8, 11, 25},
        {0, 8, 12, 25},
        {0, 8, 13, 26},
        {0, 8, 14, 26},
        {0, 8, 15, 26},
        {0, 8, 16, 27},
        {0, 8, 17, 27},
        {0, 8, 18, 27},
        {0, 9, 10, 25},
        {0, 9, 11, 25},
        {0, 9, 12, 25},
        {0, 9, 13, 26},
        {0, 9, 14, 26},
        {0, 9, 15, 26},
        {0, 9, 16, 27},
        {0, 9, 17, 27},
        {0, 9, 18, 27}};

}
