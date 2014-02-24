/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.sudoku.util;

//import static com.livehereandnow.sudoku.app.SolverCoreExtDev.show;
import java.util.Scanner;

/**
 *
 * @author mark
 */
public class Main {

    static void show(String str) {
        System.out.println(str);
    }

    public static void main(String[] arg) throws CloneNotSupportedException {
        String str = null;
//        Core solves following in one shot, not a good example for this needs
//        str = "530070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";//SolverCore done

        //broken case
//        str = "535070000_600195000_098000060_800060003_400803001_700020006_060000280_000419005_000080079";//SolverCore done
//        Core has no finding at first try, easily confused
//        str = "000902007006003900200067048900070060805010709060030002710620004002300100600701000";//SolverCore no first move
//   
//        Core has some finding but not complete, better sample
        str = "009036040008070310007000060000000050090642030070000000020000400081090600040580900";

       // Sudoku s = new Sudoku(str);
        Solver solver = new Solver();
        show("");
        show(" *====================================*");
        show(" *    Welcome to Taijimark's Sudoku   *");
        show(" *====================================*");
        show("");

//        s.show();
        Scanner scan = new Scanner(System.in);
        //   scan.nextLine();

        while (true) {
            System.out.print(" cmd:");
            String cmd = scan.nextLine();
            switch(cmd){
                case "sample":{
                    show(" ans:sample question, as follows");
                    solver.getCore().getQuestion().setData(str);
                    solver.getCore().getQuestion().show();
                    break;
                }
                case "run":{
                    show(" ans:run result, as follows");                    
                    solver.run();
                    solver.getCore().getAnswer().show();
                }
            }
            
            
        }
    }
}
