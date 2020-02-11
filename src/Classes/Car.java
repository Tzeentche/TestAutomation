package Classes;

public class Car {

    int height;
    int width;
    int lenght;
    int weight;
    int maxWeight;
    String color;
    int speed;
    int maxSpeed;

    public void addWeight(int weight) {

        this.weight += weight;
    }

    public void drive(int speed) {

        if(weight <= maxWeight) {

            this.speed = speed;

        } else {

            System.out.println("Cannot drive!");
        }
    }
}
