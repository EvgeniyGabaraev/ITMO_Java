package Lesson4;

public class Task1_2 {
    public static void main(String[] args) {
        int a = 1;
        System.out.print("Делится на 3 и на 5: ");
        while (a <= 100) {
            if (((a%3)==0) && ((a%5)==0)) {
                System.out.print(a + ", ");
            }
           a++;
        }

        int b = 1;
        System.out.print("\nДелится на 3: ");
        while (b <= 100) {
            if ((b%3)==0) {
                System.out.print(b + ", ");
            }
            b++;
        }

        int c = 1;
        System.out.print("\nДелится на 5: ");
        while (c <= 100) {
            if ((c%5)==0) {
                System.out.print(c + ", ");
            }
            c++;
        }
    }
}
