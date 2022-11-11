/*
@Author Bambang a.k.a. Bambang
calon menantu idaman
created with Eclipse intellij 2022.2.3
Created on 11/11/2022  9:32 AM
Last Modified on 11/11/20229:32 AM
Version 1.0
*/


package com.bcafinance.fundamental.day5;

import java.util.Random;

public class LatihanSatu {

    public static void main(String[] args) {




        int intOrder = 6;
        int intLength = 15;
        randomVoKon(intOrder,intLength);


    }

    public static void randomVoKon(int intOrder ,int intLength){
        String vocal = "aiueo";
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        int rnFirst =0;


        Random rn = new Random();

        for (int i = 0; i < intOrder; i++) {
            if (i==0){
                rnFirst = rn.nextInt(2);
                if (rnFirst==0){
                    System.out.print(Character.toUpperCase(vocal.charAt(rn.nextInt(5))));
                }else {
                    System.out.print(Character.toUpperCase(konsonan.charAt(rn.nextInt(21))));
                }
            } else if (i%2==1){
                if (rnFirst==0){
                    System.out.print(konsonan.charAt(rn.nextInt(21)));
                }else {
                    System.out.print(vocal.charAt(rn.nextInt(5)));
                }
            }else if (i%2==0){
                if (rnFirst==0){
                    System.out.print(vocal.charAt(rn.nextInt(5)));
                }else {
                    System.out.print(konsonan.charAt(rn.nextInt(21)));
                }
            }

        }
        System.out.print("  ");
        for (int i = 0; i < intLength-intOrder; i++) {
            rnFirst = rn.nextInt(2);
            if (rnFirst==0){
                System.out.print(vocal.charAt(rn.nextInt(5)));
            }else {
                System.out.print(konsonan.charAt(rn.nextInt(21)));
            }
        }
    }
}
