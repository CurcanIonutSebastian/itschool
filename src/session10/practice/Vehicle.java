package session10.practice;

public class Vehicle {

    private String brand;
    private int speed;

    public void accelerate() {

        speed += 5;
    }

    public void brake() {
        speed -= 5;
    }
}

class Car extends Athlete {
}

class Bike extends Athlete {

}
