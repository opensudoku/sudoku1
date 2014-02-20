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
    public Group getRowGroup(int grpId);
    public Group getColGroup(int grpId);
    public Group getBoxGroup(int grpId);
    
    /**
     * 
     * @param id, cell index between 1 and 81
     * @return 
     */
    public Groups getThree(int id);
}
