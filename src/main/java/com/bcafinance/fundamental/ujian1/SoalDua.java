/*
@Author Bambang a.k.a. Bambang
calon menantu idaman
created with Eclipse intellij 2022.2.3
Created on 11/11/2022  1:53 PM
Last Modified on 11/11/20221:53 PM
Version 1.0
*/


package com.bcafinance.fundamental.ujian1;

import java.util.Random;

public class SoalDua {

    public static void main(String[] args) {
        Random rn = new Random();
        String strVocal = "aiueo";
        String strConsonant = "bcdfghjklmnpqrstvwxyz";

        int intOrder = 7;
        int intLength = 12;

        int intRandom= rn.nextInt(2);

        for (int i = 0; i < 7; i++) {
            if (i==0){
                if (intRandom==0){
                    System.out.print(Character.toUpperCase(strVocal.charAt(rn.nextInt(5))));
                    intRandom=1;
                }else {
                    System.out.print(Character.toUpperCase(strConsonant.charAt(rn.nextInt(21))));
                    intRandom=0;
                }
            }else {
                if (intRandom==0){
                    System.out.print(strVocal.charAt(rn.nextInt(5)));
                    intRandom=1;
                }else {
                    System.out.print(strConsonant.charAt(rn.nextInt(21)));
                    intRandom=0;
                }
            }
        }

        intRandom= rn.nextInt(2);
        for (int i = 0; i < intLength-intOrder; i++) {

            if (intRandom==0){
                System.out.print(strVocal.charAt(rn.nextInt(5)));
                intRandom=1;
            }else {
                System.out.print(strConsonant.charAt(rn.nextInt(21)));
                intRandom=0;
            }
        }
    }
}
