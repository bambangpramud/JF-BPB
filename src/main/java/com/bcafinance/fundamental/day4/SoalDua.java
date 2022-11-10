/*
@Author Bambang a.k.a. Bambang
calon menantu idaman
created with Eclipse intellij 2022.2.3
Created on 11/10/20222:36 PM
Last Modified on 11/10/20222:36 PM
Version 1.0
*/


package com.bcafinance.fundamental.day4;

import java.util.Scanner;

public class SoalDua {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Input Data Integer :    ");
        int keyword = scn.nextInt();

        int[] val= {66,77,80,84,88,99,100};
        int low = 0;
        int high = val.length-1;
        int med = 0;
        boolean status = false;

       while (low<=high){
           med=(low+high)/2;
           if (keyword==val[med]){
               System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
               status=true;
               break;
           } else if (keyword>val[med]){
               low = med+1;
           } else {
               high = med-1;
           }

       }
       if (status==false){
           System.out.println(keyword + " NOT FOUND!");
       }
//
//        for (int i = 0; i < val.length; i++)   {
//            med = (high - low)/2;
//            if (val[i] == keyword)  {
//                System.out.println(keyword+" FOUNDED in position "+(med+1)+" and INDEX "+med);
//               status=true;
//               break;
//            }
//            else if (val[med] > keyword)  {
//                high = med - 1;
//            }
//            else    {
//                low = med + 1;
//            }
//        }
//        if (status==false){
//           System.out.println(keyword + " NOT FOUND!");
//       }
    }
}
