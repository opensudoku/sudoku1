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
public class Directory implements View {

    private Group[] row = new Group[10];
    private Group[] col = new Group[10];
    private Group[] box = new Group[10];
    private Groups[] groups = new Groups[82];

    {
        for (int i = 1; i <= 9; i++) {
            row[i] = new Group();
            col[i] = new Group();
            box[i] = new Group();
            row[i].setId(i);
            col[i].setId(i);
            box[i].setId(i);
            
        }
        // row
        row[1].set9Members(1, 2, 3, 4, 5, 6, 7, 8, 9);
        row[2].set9Members(10, 11, 12, 13, 14, 15, 16, 17, 18);
        row[3].set9Members(19, 20, 21, 22, 23, 24, 25, 26, 27);
        row[4].set9Members(28, 29, 30, 31, 32, 33, 34, 35, 36);
        row[5].set9Members(37, 38, 39, 40, 41, 42, 43, 44, 45);
        row[6].set9Members(46, 47, 48, 49, 50, 51, 52, 53, 54);
        row[7].set9Members(55, 56, 57, 58, 59, 60, 61, 62, 63);
        row[8].set9Members(64, 65, 66, 67, 68, 69, 70, 71, 72);
        row[9].set9Members(73, 74, 75, 76, 77, 78, 79, 80, 81);

        // col
        col[1].set9Members(1, 10, 19, 28, 37, 46, 55, 64, 73);
        col[2].set9Members(2, 11, 20, 29, 38, 47, 56, 65, 74);
        col[3].set9Members(3, 12, 21, 30, 39, 48, 57, 66, 75);
        col[4].set9Members(4, 13, 22, 31, 40, 49, 58, 67, 76);
        col[5].set9Members(5, 14, 23, 32, 41, 50, 59, 68, 77);
        col[6].set9Members(6, 15, 24, 33, 42, 51, 60, 69, 78);
        col[7].set9Members(7, 16, 25, 34, 43, 52, 61, 70, 79);
        col[8].set9Members(8, 17, 26, 35, 44, 53, 62, 71, 80);
        col[9].set9Members(9, 18, 27, 36, 45, 54, 63, 72, 81);

        // box
        box[1].set9Members(1, 2, 3, 10, 11, 12, 19, 20, 21);
        box[2].set9Members(4, 5, 6, 13, 14, 15, 22, 23, 24);
        box[3].set9Members(7, 8, 9, 16, 17, 18, 25, 26, 27);
        box[4].set9Members(28, 29, 30, 37, 38, 39, 46, 47, 48);
        box[5].set9Members(31, 32, 33, 40, 41, 42, 49, 50, 51);
        box[6].set9Members(34, 35, 36, 43, 44, 45, 52, 53, 54);
        box[7].set9Members(55, 56, 57, 64, 65, 66, 73, 74, 75);
        box[8].set9Members(58, 59, 60, 67, 68, 69, 76, 77, 78);
        box[9].set9Members(61, 62, 63, 70, 71, 72, 79, 80, 81);

        //---------------------------
//        for (int i = 1; i <= 81; i++) {
//            groups[i] = new Groups();
//        }
        // row#1
        groups[1] = getGroups(1, 1, 1);
        groups[2] = getGroups(1, 2, 1);
        groups[3] = getGroups(1, 3, 1);
        groups[4] = getGroups(1, 4, 2);
        groups[5] = getGroups(1, 5, 2);
        groups[6] = getGroups(1, 6, 2);
        groups[7] = getGroups(1, 7, 3);
        groups[8] = getGroups(1, 8, 3);
        groups[9] = getGroups(1, 9, 3);
        // row#2
        groups[10] = getGroups(2, 1, 1);
        groups[11] = getGroups(2, 2, 1);
        groups[12] = getGroups(2, 3, 1);
        groups[13] = getGroups(2, 4, 2);
        groups[14] = getGroups(2, 5, 2);
        groups[15] = getGroups(2, 6, 2);
        groups[16] = getGroups(2, 7, 3);
        groups[17] = getGroups(2, 8, 3);
        groups[18] = getGroups(2, 9, 3);
        // row#3
        groups[19] = getGroups(3, 1, 1);
        groups[20] = getGroups(3, 2, 1);
        groups[21] = getGroups(3, 3, 1);
        groups[22] = getGroups(3, 4, 2);
        groups[23] = getGroups(3, 5, 2);
        groups[24] = getGroups(3, 6, 2);
        groups[25] = getGroups(3, 7, 3);
        groups[26] = getGroups(3, 8, 3);
        groups[27] = getGroups(3, 9, 3);
        // row#4
        groups[28] = getGroups(4, 1, 4);
        groups[29] = getGroups(4, 2, 4);
        groups[30] = getGroups(4, 3, 4);
        groups[31] = getGroups(4, 4, 5);
        groups[32] = getGroups(4, 5, 5);
        groups[33] = getGroups(4, 6, 5);
        groups[34] = getGroups(4, 7, 6);
        groups[35] = getGroups(4, 8, 6);
        groups[36] = getGroups(4, 9, 6);
        // row#5
        groups[37] = getGroups(5, 1, 4);
        groups[38] = getGroups(5, 2, 4);
        groups[39] = getGroups(5, 3, 4);
        groups[40] = getGroups(5, 4, 5);
        groups[41] = getGroups(5, 5, 5);
        groups[42] = getGroups(5, 6, 5);
        groups[43] = getGroups(5, 7, 6);
        groups[44] = getGroups(5, 8, 6);
        groups[45] = getGroups(5, 9, 6);
        // row#6
        groups[46] = getGroups(6, 1, 4);
        groups[47] = getGroups(6, 2, 4);
        groups[48] = getGroups(6, 3, 4);
        groups[49] = getGroups(6, 4, 5);
        groups[50] = getGroups(6, 5, 5);
        groups[51] = getGroups(6, 6, 5);
        groups[52] = getGroups(6, 7, 6);
        groups[53] = getGroups(6, 8, 6);
        groups[54] = getGroups(6, 9, 6);
        // row#7
        groups[55] = getGroups(7, 1, 7);
        groups[56] = getGroups(7, 2, 7);
        groups[57] = getGroups(7, 3, 7);
        groups[58] = getGroups(7, 4, 8);
        groups[59] = getGroups(7, 5, 8);
        groups[60] = getGroups(7, 6, 8);
        groups[61] = getGroups(7, 7, 9);
        groups[62] = getGroups(7, 8, 9);
        groups[63] = getGroups(7, 9, 9);
        // row#8
        groups[64] = getGroups(8, 1, 7);
        groups[65] = getGroups(8, 2, 7);
        groups[66] = getGroups(8, 3, 7);
        groups[67] = getGroups(8, 4, 8);
        groups[68] = getGroups(8, 5, 8);
        groups[69] = getGroups(8, 6, 8);
        groups[70] = getGroups(8, 7, 9);
        groups[71] = getGroups(8, 8, 9);
        groups[72] = getGroups(8, 9, 9);
        // row#9
        groups[73] = getGroups(9, 1, 7);
        groups[74] = getGroups(9, 2, 7);
        groups[75] = getGroups(9, 3, 7);
        groups[76] = getGroups(9, 4, 8);
        groups[77] = getGroups(9, 5, 8);
        groups[78] = getGroups(9, 6, 8);
        groups[79] = getGroups(9, 7, 9);
        groups[80] = getGroups(9, 8, 9);
        groups[81] = getGroups(9, 9, 9);

        //  System.out.print("debug ..."+groups[1].getRow().toStringGroupNumbers());
    }

    private Groups getGroups(int rowId, int colId, int boxId) {
        return new Groups(row[rowId], col[colId], box[boxId]);
    }

    public Groups getGroupsByCellNumber(int num) {
        return groups[num];
    }

    public Group getRowGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public Group getColGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Group getBoxGroup(int grpId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Groups getThree(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append("row#").append(i).append(" ").append(row[i].toString());
        }
        for (int i = 1; i <= 9; i++) {
            sb.append("col#").append(i).append(" ").append(col[i].toString());
        }
        for (int i = 1; i <= 9; i++) {
            sb.append("box#").append(i).append(" ").append(box[i].toString());
        }

        for (int i = 1; i <= 81; i++) {
            sb.append("cell#").append(i).append(" ").append(groups[i].toString());
        }

        return sb.toString();
    }

}
