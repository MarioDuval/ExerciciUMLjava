package Exercici1;

public class Car {
    private String color;
    private int maxSpeed;


    public Car(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void CarInfo() {
        System.out.println("Car info: Car color= " + this.color + "Max speed =" + this.maxSpeed);
    }
}
