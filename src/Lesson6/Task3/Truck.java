package Lesson6.Task3;

public class Truck extends Car{
    public int wheels;
    public int maxWeight;

    public Truck (int w, String m, char c, float s, int wheels, int maxWeight){
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
        System.out.println(wheels);
    }

    @Override
    public void outPut() {
        super.outPut();
        System.out.println("Количество колес " + wheels + ", максимальный вес " + maxWeight + " кг.");
    }
}
