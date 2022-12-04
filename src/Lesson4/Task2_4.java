package Lesson4;

public class Task2_4 {
    public static void main(String[] args) {
        int[] myArray = {2, 3, 3, 3, 2, 10};
        uniqueNumber(myArray);
    }

    public static void uniqueNumber(int[] array){
        for (int i = 0; i < array.length; i++) {
            boolean isTrue = true;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j] && i!=j){
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                System.out.println(array[i]);
                break;
            }
        }

    }
}
