/*
@Author Bambang a.k.a. Bambang
calon menantu idaman
created with Eclipse intellij 2022.2.3
Created on 11/11/2022  1:41 PM
Last Modified on 11/11/20221:41 PM
Version 1.0
*/


package com.bcafinance.fundamental.ujian1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoalSatu {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int intNumber =0;
        int intTotal =0;
        boolean isAgain =true;

        try {
            while (isAgain){
                System.out.print("Masukkan Anggka Sepuasnya :  ");
                intNumber = scn.nextInt();

                intTotal+=intNumber;

            }
        }catch (InputMismatchException e){
            System.out.print("jumlah :  "+intTotal);
        }


    }
}
