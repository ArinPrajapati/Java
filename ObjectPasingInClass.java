public class ObjectPasingInClass {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car2 = new Car("Tesla");
        Car car3 = new Car("tata");

        garage.park(car);
        garage.park(car2);
        garage.park(car3);

    }
}

class Garage {
    void park(Car car) {
        System.out.println("the " + car.name + " is parked in the garage");
    }

}

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

}



