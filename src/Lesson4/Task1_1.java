package Lesson4;

public class Task1_1 {
    public static void main (String[] args) {
        int a = 1;
        while (a <= 99) {
            if ((a % 2) == 0) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }
    }
}
