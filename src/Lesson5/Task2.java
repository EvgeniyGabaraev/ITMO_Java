package Lesson5;

public class Task2 {
    public static void main(String[] args) {
        String string1 = "Потоп";
        System.out.println(string1);
        String string2 = reverseWord(string1);
        if (string2.equalsIgnoreCase(string1)){
            System.out.println("Слово является палиндромом");
        } else {
            System.out.println("Слово не является палиндромом");
        }
    }

    public static String reverseWord (String string){
        char[] chararray = string.toCharArray();
        String result = "";
        for (int i = chararray.length-1; i >= 0 ; i--) {
        result = result + chararray[i];
        }
        System.out.println(result);
        return result;
    }
}
