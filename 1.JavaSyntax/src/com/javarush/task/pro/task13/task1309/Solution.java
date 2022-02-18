package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("dsads", 12.4);
        grades.put("dsass", 12.4);
        grades.put("dsasfs", 12.4);
        grades.put("dsadgf", 12.4);
        grades.put("dsaddd", 12.4);

    }
}
