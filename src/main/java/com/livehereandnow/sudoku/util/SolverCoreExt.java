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
public class SolverCoreExt {
    private SolverCore sc;

    public SolverCoreExt() throws CloneNotSupportedException {
        Sudoku question=new Sudoku();        
        
        sc=new SolverCore(question);
    }

//
//    public SolverCoreExt(SolverCore sc) {
//        this.sc = sc;
//    }

    static void show(String str){
        System.out.println(str);
    }
    public SolverCore getSolverCore() {
        return sc;
    }

    
    public void run(){
        sc.run();
        sc.show();
        show(" ...after SolverCore's run");
    }
    
    public void show(){
       // sc.run();
        show(" ...DOING show");
    }
}
