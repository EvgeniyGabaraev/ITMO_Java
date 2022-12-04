package Lesson4;

import java.util.Arrays;

public class Task2_3 {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 3, 5, 6, 7, 10};
        System.out.println(Arrays.toString(myArray));
        changePlace(myArray);
    }

    public static void changePlace (int [] array){
        int a = array[0];
        int b = array[array.length-1];
        array[0] = b;
        array[array.length-1] = a;
        System.out.println(Arrays.toString(array));

    }
}
