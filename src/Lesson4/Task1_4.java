package Lesson4;

import java.util.Scanner;

public class Task1_4 {
    public static void main(String[] args) {
        boolean max = isTrue();
        System.err.println(max);
    }
    public static boolean isTrue () {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();
        System.out.println("Введите третье число: ");
        int c = console.nextInt();

        if ((a<b)&&(b<c)) {
            return true;
        } else {
            return false;
        }

    }
}
