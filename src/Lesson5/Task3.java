package Lesson5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String string1 = "бяка Анна бяка купила бяка автомобиль бяка";
        String string2 = string1.replace("бяка", "[вырезано цензурой]");
        System.out.println(string1);
        System.out.println(string2);
        replaceWord(string1);
    }

    public static void replaceWord (String string){
        String[] newArray = string.split(" ");
        String s1 = "";
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].equalsIgnoreCase("бяка")) {
                s1 = s1 + " " + "[вырезано цензурой]";
            } else {
                s1 = s1 + " " + newArray[i];
            }
        }
        System.out.println(s1);
    }
}
