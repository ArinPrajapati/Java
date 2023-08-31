public class asbtractKeywordInJava {
    // abstract = abstract classes cannot be instantiated , but they can have a subclass
    //            abstract methods are declared without an implementation

    //    Vehicles vehicles = new Vehicles();


    public static void main(String[] args) {
        Cares car = new Cares();
        System.out.println(car.go());
    }

}


class Cares extends Vehicles {

    @Override
    boolean go() {
        System.out.println("the driver is diving the car ");
        return false;
    }
}


abstract class Vehicles {

    abstract boolean go();


}


