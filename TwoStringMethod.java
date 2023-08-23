public class TwoStringMethod {
    public static void main(String[] args) {
        // toString() = special method that all objects inherit ,
//                      that returns a string that "textually  represents " and object .
//                       can ber used both implicitly and explicitly

        Cars car = new Cars();
     
//        System.out.println(car.toString());
        System.out.println(car);

    }
}

class Cars {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;


    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}



