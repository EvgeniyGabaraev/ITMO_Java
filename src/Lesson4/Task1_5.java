package Lesson4;

import java.util.Arrays;

public class Task1_5 {
    public static void main(String[] args) {

        int [] intArray = {3,4,5,6,7};
        System.out.println("array = " + Arrays.toString(intArray));
        boolean check = checkArray(intArray);
        System.out.println(check);
    }

    public static boolean checkArray (int [] array) {
        if (array[0]==3 || array[array.length-1]==3) {
            return true;
        } else {
            return false;
        }
    }
}
