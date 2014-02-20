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
public interface View {
    /**
     * 
     * @param grpId, Row Group ID, between 1 and 9
     * @return 
     */
    public Nine getRowGroup(int grpId);
    public Nine getColGroup(int grpId);
    public Nine getBoxGroup(int grpId);
    
    /**
     * 
     * @param id, cell index between 1 and 81
     * @return 
     */
    public Three getThree(int id);
}
