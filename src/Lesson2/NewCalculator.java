package Lesson2;

public class NewCalculator {
    public static void main(String[] args) {
    Calculator calculator1 = new Calculator();
        System.out.println(calculator1.summary(15, 5));
        System.out.println(calculator1.summary(100000L,70000L));
        System.out.println(calculator1.summary(2.8d, 1.2d));

        System.out.println(calculator1.substraction(15,5));
        System.out.println(calculator1.substraction(100000L,70000L));
        System.out.println(calculator1.substraction(2.8d,1.2d));

        System.out.println(calculator1.multiplication(15,5));
        System.out.println(calculator1.multiplication(100000L,70000L));
        System.out.println(calculator1.multiplication(2.8d,1.2d));

        System.out.println(calculator1.division(15,5));
        System.out.println(calculator1.division(100000L,70000L));
        System.out.println(calculator1.division(2.8d,1.2d));

    }


}
