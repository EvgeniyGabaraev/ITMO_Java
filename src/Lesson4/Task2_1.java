package Lesson4;

public class Task2_1 {
    public static void main(String[] args) {
        int[] myArray = {1, 3, 5, 6, 7, 6};
        boolean isOk = false;

        for (int i = 0; i < myArray.length-1; i++) {
            if (myArray[i] > myArray[i+1]){
                isOk = false;
                break;
            } else {
                isOk = true;
            }
        }
        if (isOk == true){
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }


}
