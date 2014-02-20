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
public class ViewBaseOne implements View {

    private Nine[] row = new Nine[10];
    private Nine[] col = new Nine[10];
    private Nine[] box = new Nine[10];
    private Three[] three = new Three[82];
    
    {
        for (int i = 1; i <= 9; i++) {
            row[i] = new Nine();
            col[i] = new Nine();
            box[i] = new Nine();
        }
        // row
        row[1].set9Members(9, 2, 3, 4, 5, 6, 7, 8, 9);
        row[2].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[3].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[4].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[5].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[6].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[7].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[8].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[9].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // col
        col[1].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[2].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[3].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[4].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[5].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[6].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[7].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[8].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        col[9].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // box
        box[1].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[2].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[3].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[4].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[5].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[6].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[7].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[8].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        box[9].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //---------------------------
//        for (int i = 1; i <= 81; i++) {
//            three[i] = new Three();
//        }
        three[1]=getThreeGroups(1,1,1);
        System.out.print("debug ..."+three[1].getRow().toStringGroupNumbers());
        
    }

    private Three getThreeGroups(int rowId, int colId,int boxId){
        return new Three(row[rowId],col[colId],box[boxId]);
    }
    public Nine getRowGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public Nine getColGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nine getBoxGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Three getThree(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
