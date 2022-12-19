package Lesson6.Task5;

import java.util.Scanner;

public class Age {
    Scanner console = new Scanner(System.in);
    public int age;

    public void info() {
        System.out.println("Введите возраст:");
        age = console.nextInt();
        System.out.println(age);
    }
}
