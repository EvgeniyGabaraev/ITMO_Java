package Lesson5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Начальный текст:");
        String text = "This is a test string";
        System.out.println(text);
        System.out.println("Инвертированный текст:");
        reverse(text);
    }
    public static void reverse (String string){
        String[] stringArray = string.split(" ");

        for (int i = 0; i < stringArray.length; i++) {
           StringBuilder builder = new StringBuilder(stringArray[i]);
           stringArray[i] = String.valueOf(builder.reverse());
        }
        String s = "";
        for (int i = 0; i < stringArray.length; i++) {
            s = s + stringArray[i] + " ";
        }
        System.out.print(s);
    }
}
