package Lesson6.Task5;

public class Name extends Age{
    public String name;

    public void info() {
        System.out.println("Введите имя:");
        name = console.nextLine();
        System.out.println(name);
    }
}
