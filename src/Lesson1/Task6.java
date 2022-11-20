package Lesson1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        int b = console.nextInt();
        if (b%2==1){
            System.out.println("Нечетное");
        }
        else if (b%2==0 && b>100) {
            System.out.println("Выход за пределы диапазона");
        }
        else{
            System.out.println("Четное");
        }
        console.close();
    }
}
