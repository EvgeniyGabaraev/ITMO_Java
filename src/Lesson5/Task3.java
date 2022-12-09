package Lesson5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String string1 = "бяка Анна бяка купила бяка автомобиль бяка";
        String string2 = "бяка";
        String string3 = "[вырезано цензурой]";
        System.out.println(string1);

        replaceWord(string1, string2, string3);
    }

    public static void replaceWord (String string1, String string2, String string3){
        String[] newArray = string1.split(" ");
        String s1 = "";
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i].equalsIgnoreCase(string2)) {
                s1 = s1 + " " + string3;
            } else {
                s1 = s1 + " " + newArray[i];
            }
        }
        System.out.println(s1);
    }
}
