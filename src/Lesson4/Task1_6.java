package Lesson4;

import java.util.Arrays;

public class Task1_6 {
    public static void main(String[] args) {

        int [] intArray = {5,4,3,6,7};
        System.out.println("array = " + Arrays.toString(intArray));
        boolean check = checkArray(intArray);
        System.out.println(check);


    }

    public static boolean checkArray (int [] array) {
        for (int a : array) {
            if (a==1 || a==3) {
                return true;
            }
        }
        return false;
    }
}
