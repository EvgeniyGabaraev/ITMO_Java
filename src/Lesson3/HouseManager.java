package Lesson3;

public class HouseManager {
    public static void main(String[] args) {
        House house1 = new House();
        house1.setName("Дом советов");
        house1.setNumberOfFloors(25);
        house1.setYear(1990);
        House house2 = new House();
        house2.setName("Дом профсоюзов");
        house2.setNumberOfFloors(18);
        house2.setYear(1980);
        System.out.println(house1);
        System.out.println(house2);
        System.out.println(house1.age(house1,2022));
        System.out.println(house2.age(house2,2022));
    }
}
