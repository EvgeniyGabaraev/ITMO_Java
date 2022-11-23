package Lesson2;

public class NewCalculator {
    public static void main(String[] args) {
    Calculator calculator1 = new Calculator();
        System.out.println(calculator1.summary(15, 5));
        System.out.println(calculator1.summary(100L,70L));
        System.out.println(calculator1.summary(2.8, 1.2));

        System.out.println(calculator1.substraction(15,5));
        System.out.println(calculator1.substraction(100L,70L));
        System.out.println(calculator1.substraction(2.8,1.2));

        System.out.println(calculator1.multiplication(15,5));
        System.out.println(calculator1.multiplication(100L,70L));
        System.out.println(calculator1.multiplication(2.8,1.2));

        System.out.println(calculator1.division(15,5));
        System.out.println(calculator1.division(100L,70L));
        System.out.println(calculator1.division(2.8,1.2));

    }


}
