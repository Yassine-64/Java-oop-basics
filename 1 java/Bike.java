public class Bike {
    private int speed;
    private String color;
    private String model;

    public Bike(String color, String model) {
        this.speed = 0;
        this.color = color;
        this.model = model;
    }

    public void accelerate() {
        speed += 10;
        System.out.println("Bike is accelerating. Current speed: " + speed + "km/h");
    }

    public void brake() {
        speed -= 5;
        System.out.println("Applying brakes. Current speed: " + speed + "km/h");
    }

    public void information() {
        System.out.println("Bike information: Model: " + model + ", Color: " + color + ", Speed: " + speed + "km/h");
    }
}


