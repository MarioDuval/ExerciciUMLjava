package Exercici1;

public class Seat extends Car{
    private String Distributor;
    private Engine engine;

    public Seat(String color, int maxSpeed, String distributor) {
        super(color, maxSpeed);
        Distributor = distributor;
        this.engine = new Engine();
    }

    public void SeatStopDemo() {
        System.out.println("Overview: Distribuitor= " + Distributor);
        CarInfo();
        engine.stop();
    }
}
