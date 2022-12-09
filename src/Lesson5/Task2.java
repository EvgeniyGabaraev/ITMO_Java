package Lesson5;

public class Task2 {
    public static void main(String[] args) {
        String string1 = "Потоп";
        System.out.println(string1);
        reverseWord(string1);

    }

    public static void reverseWord (String string){
        char[] chararray = string.toCharArray();
        String result = "";
        for (int i = chararray.length-1; i >= 0 ; i--) {
        result = result + chararray[i];
        }
        System.out.println(result);

        if (string.equalsIgnoreCase(result)){
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }
}
