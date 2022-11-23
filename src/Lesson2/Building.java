package Lesson2;

public class Building {
    public String location;
    public String material;
    public int numberoffloors;
    public long hight;

    public Building() {
        this.location = "неизвестно";
        this.material = "неизвестно";
        this.numberoffloors = 0;
    }

    public Building(String location, String material, int numberoffloors) {
        this.location = location;
        this.material = material;
        this.numberoffloors = numberoffloors;
    }

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", material='" + material + '\'' +
                ", numberoffloors=" + numberoffloors +
                '}';
    }

    public long getHight() {
        return hight;
    }

    public void setHight(long hight) {
        this.hight = hight;
    }
}
