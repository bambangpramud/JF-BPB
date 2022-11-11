/*
@Author bambang a.k.a. Bambang
calon menantu idaman
created with Eclipse intellij 2022.2.3
Created on 11/10/2022 2:03 PM
Last Modified on 11/10/2022 2:23 PM
Version 1.0
*/


package com.bcafinance.fundamental.day4;

import java.util.Scanner;

public class SoalSatu {

    public static void main(String[] args) {
        int[] intArr = {3,8,5,2,1,9,10};

        Scanner scn = new Scanner(System.in);
        System.out.print("input data Integer :     " );
        int intB = scn.nextInt();
        boolean isFound = isFoundProcess(intArr,intB);





    }

    static boolean isFoundProcess(int[] intArr,int intA){
        for (int i = 0; i <intArr.length ; i++) {
            if (intA == intArr[i]){
                System.out.println("angka "+intA + " sudah ditemukan , pada index ke "+i);
                return true;
            }
        }
        System.out.println("angka "+intA + " yang anda cari tidak ditemukan");
    return false;
    }
}
