public class methodOverridingInJava {
    public static void main(String[] args) {
        // method overriding = Declaring a methods in subclass
        //                    which is already present class.
        //                    done so that a child class can give its own implementation

        Dog dog = new Dog();
        animal Animal = new animal();
        dog.speak();

    }
}

class animal {
    void speak() {
        System.out.println("this animal is speaking  ");
    }
}

class Dog extends animal {
    @Override
    void speak() {

        System.out.println("this animal is speaking " + "woof!! woof!");

    }


}