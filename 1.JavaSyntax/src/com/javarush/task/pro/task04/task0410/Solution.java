package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min1 = scanner.nextInt();
        int min2 = scanner.nextInt();

        if(min2 < min1){
            int tmp = min1;
            min1 = min2;
            min2 = tmp;
        }
        while (scanner.hasNextInt()){
            int a1 = scanner.nextInt();
            if(min1 == min2 && a1 > min1){
                min2 = a1;
            } else if (a1 < min1) {
                min2 = min1;
                min1 = a1;
            } else if (a1 > min1 && a1 < min2) {
                min2 = a1;
            }
        }
        System.out.println(min2);
    }
}