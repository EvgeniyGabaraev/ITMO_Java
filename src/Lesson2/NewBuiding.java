package Lesson2;

public class NewBuiding {
    public static void main(String[] args) {
        Building building1 = new Building();
        Building building2 = new Building("США", "Железобетон", 100);

        building2.setHight(1050L);
        System.out.println(building1);
        System.out.println(building2);
        System.out.println(building2.getHight());
    }
}
