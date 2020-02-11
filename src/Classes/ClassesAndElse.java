package Classes;

public class ClassesAndElse {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Black";
        car1.lenght = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(100);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2= new Car();
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(120);
        car3.drive(150);
    }
}
