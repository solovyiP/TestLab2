package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер задачи:");
        int position = scan.nextInt();
        switch (position) {
            case 1:
                if (position == 1) {
                    task1();
                } else {
                    error();
                }
                break;
            case 2:
                if (position == 2) {
                    task2();
                } else {
                    error();
                }
                break;
        }
    }

    public static void error(){
        System.out.println("Задание отсутствует");
    }
    public static void task1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год в формате yyyy:");
        int year = in.nextInt();
        String stroka = "Количество дней в году " + year(year);
        System.out.println(stroka);
    }
    public static int year(int year){
        if (year % 400 ==0){
           return 366;
        } else if ((year % 4 == 0) && (year % 100 != 0))
        {
            return  366;
        }
        else {
            return  365;
        }
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        while (true){
            System.out.println("Введите год в формате \"yyyy\"");
            int year = scanner.nextInt();
            System.out.println("Введите предпологаемое количество дней в этом году");
            int days = scanner.nextInt();
            if (isLeapYear(year) && days==366){
                score++;
            }
            else if(!isLeapYear(year) && days==365){
                score++;
            }
            else {
                if(isLeapYear(year)){
                    System.out.println("Неправильно! В этом году 366 дней!");
                }
                else {
                    System.out.println("Неправильно! В этом году 365 дней!");
                }
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }
    public static boolean isLeapYear(int year){
        if (year % 4 == 0){
            return true;
        }
        else {
            return  false;
        }
    }

}