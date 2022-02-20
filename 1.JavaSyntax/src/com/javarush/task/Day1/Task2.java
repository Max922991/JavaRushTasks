package com.javarush.task.Day1;

public class Task2 {
    public static void main(String[] args) {
        int value = 779338776;
        System.out.println(prov(value));

    }
    public static int prov(int i){
        if(i == 0) return 0;

       if(i % 10 == 7) {
           return 1 + prov(i / 10);
       }else {
           return prov(i / 10);
       }
    }
}
