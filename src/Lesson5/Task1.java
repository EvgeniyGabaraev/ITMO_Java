package Lesson5;

public class Task1 {
    public static void main(String[] args) {
        String string1 = "Илья Горюнов семь лет отсидел в тюрьме по ложному обвинению в распространении наркотиков";
        String[] strings = string1.split(" ");
        for (String s: strings) {
            System.out.println(s);
        }
        longestWord(strings);
    }

    public static void longestWord (String[] array){
    String word = " ";
        for (String a: array) {
            if (a.length()>word.length()){
                word = a;
            }
        }
        System.err.println(word);
    }
}
