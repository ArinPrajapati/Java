public class inheritanceInJava {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires
        //               the attributes and methods of another
Car1 car = new Car1();
Bike bike = new Bike();

bike.stop();
car.go();

        System.out.println(car.speed);
        System.out.println(car.wheels);

    }
}

class Vehicle {
    double speed;

    void go() {
        System.out.println("this vehicle is moving");

    }

    void stop() {
        System.out.println("this is vehicle is stopped");
    }


}

class Car1 extends Vehicle {
    int wheels =4;
    int doors =4;


}

class Bike extends Vehicle {
 int wheels = 3;
 int pedals = 2;
}



