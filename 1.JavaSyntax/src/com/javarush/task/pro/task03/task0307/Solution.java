package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int s1 = scanner.nextInt();

       if(s1 < 20 || s1 > 60)
        System.out.println("можно не работать");
    }
}
