package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = console.nextInt();
        int[] newArray = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
           newArray[i] = console.nextInt();
        }
        System.out.println(Arrays.toString(newArray));
    }



}
