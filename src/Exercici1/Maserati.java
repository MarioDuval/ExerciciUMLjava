package Exercici1;

public class Maserati extends Car{
    private String Designer;
    private String Production;
    private Engine engine;

    public Maserati(String color, int maxSpeed, String designer, String production) {
        super(color, maxSpeed);
        Designer = designer;
        Production = production;
        this.engine = new Engine();
    }

    public void MaseratiStartDemo() {
        System.out.println("Overview: Designer= " + Designer + ", Production years= " + Production);
        CarInfo();
        engine.start();
    }
}
