import org.w3c.dom.ls.LSOutput;

public class JavaArray {
    //    array - used to store multiple value  in a single varible
    public static void main(String[] args) {
    /*   String[] bike = {"bike1","bike2","bike3"};
    String[] cars = new String[6];
    cars[0] = "newCar";
    cars[1] = "2newCar";
    cars[2] = "tesla";

    for (int i = 0; i < cars.length; i++) {
        System.out.println(cars[i]);
    }
*/

        // 2d array = array of arrays;

        String[][] cars = new String[3][3];
        cars[0][0] = "carom";
        cars[0][1] = "corvette";
        cars[0][2] = "Ford Mustang";
        cars[1][0] = "Honda Civic";
        cars[1][1] = "Chevrolet Corvette";
        cars[1][2] = "BMW 3 Series";
        cars[2][0] = "Mercedes-Benz E-Class";
        cars[2][1] = "Volkswagen Golf";
        cars[2][2] = "Audi A4";

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j]+" ");
            }
        }


//        or

        String[][] bikeNames = {
                {"Honda", "CBR 1000RR"},
                {"Yamaha", "YZF R6"},
                {"Kawasaki", "Ninja ZX-10R"},
                {"Suzuki", "GSX-R750"},
                {"Ducati", "Panigale V4"},
                {"Harley-Davidson", "Sportster Iron 883"},
                {"BMW", "S1000RR"},
                {"Triumph", "Street Triple"},
                {"KTM", "Duke 390"},
                {"Aprilia", "RSV4"}
        };
        for (String[] bike : bikeNames) {
            System.out.println("Brand: " + bike[0] + ", Model: " + bike[1]);
        }
    }


}
