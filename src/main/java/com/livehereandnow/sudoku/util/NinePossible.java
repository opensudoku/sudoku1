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
public class NinePossible extends Ten{
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
         
        for (int i = 0; i < member.length; i++) {
            if (member[i]!=0){
                sb.append(i);
            }
//            sb.append("(").append(i).append(")");
//            sb.append(member[i]).append(" ");
        
        
        }
         
        return "possible{" + sb.toString()+"}";
    }
}
