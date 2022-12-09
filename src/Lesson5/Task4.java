package Lesson5;

public class Task4 {
    public static void main(String[] args) {
        String string1 = "Вы помните, Вы все конечно помните";
        String string2 = "помните";
        System.out.println(count(string1,string2));


    }
    public static int count (String string1, String string2){
        return ((string1.length() - string1.replace(string2,"").length())/string2.length());
    }
}
