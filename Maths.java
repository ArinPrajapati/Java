import java.util.Scanner;

public class Maths {
    public static void main(String[] args) {
      // find the hypotenuse
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of x:  "  );
        x = scanner.nextDouble();
        System.out.println("enter value of y: ");
        y= scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("the hypotenuse when x = "+ x + " and y = " + y+ " is " + z);
        scanner.close();
    }

}
