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
public interface BasicRule {
    boolean isSudoku9x9 (Problem problem );
    boolean isSudoku9x9 (String problem );
    
}
