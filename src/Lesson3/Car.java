package Lesson3;

public class Car {
    public String colour;
    public String brand;
    public int weight;

    public Car (String colour){
        this.colour = colour;
    }

    public Car (String colour, int weight){
        this.colour = colour;
        this.weight = weight;
    }

    public Car (){

    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", weight=" + weight +
                '}';
    }
}
