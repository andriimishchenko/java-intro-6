package lesson03;

import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacciNumbers(int n){
        if(n<=0) {
            System.out.println("Please enter a positive number more than 0");
            return;
        }
        int[] fibRow = new int[n];
        fibRow[0] = 0;
        fibRow[1] = 1;
        for (int i = 2; i < n; ++i) fibRow[i] = fibRow[i - 1] + fibRow[i - 2];
        System.out.print("First " + n + " numbers of Fibanacci row -> ");
        for (int i: fibRow) System.out.print(i+ " ");
    }


    public static void main(String[] args) {
        //ввод кол-ва цифр ряда Фибаначчи с клавиатуры
//            Scanner scanner = new Scanner(System.in);
//            int n = scanner.nextInt();
//            printFibonacciNumbers(n);


        //тест условия задания
        printFibonacciNumbers(-1);// -> "Please enter a positive number more than 0";
        printFibonacciNumbers(0);// -> "Please enter a positive number more than 0";
        printFibonacciNumbers(1);// -> 0;
        printFibonacciNumbers(4);// -> 0, 1, 1, 2;
        printFibonacciNumbers(7);//-> 0, 1, 1, 2, 3, 5, 8/
    }
}