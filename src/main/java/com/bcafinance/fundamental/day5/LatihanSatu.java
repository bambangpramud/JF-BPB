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
        String vocal = "aiueo";
        String konsonan = "bcdefghjklmnpqrstvwxyz";

        Random rn = new Random();


        int intOrder = 5;
        int intLength = 10;
        int rnFirst =0;

        for (int i = 0; i < intOrder; i++) {
            if (i==0){
                 rnFirst = rn.nextInt(2);
                if (rnFirst==0){
                    System.out.print(vocal.charAt(rn.nextInt(5)));
                }else {
                    System.out.print(konsonan.charAt(rn.nextInt(21)));
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
