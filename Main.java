
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*       System.out.println("hello world"); for print .print
//        System.out.println("hello Bye");  for print on it own line .println
//         \n can be also used in in printing on new line
//        System.out.print("hello line\n");
//        System.out.println("\t i love pizza");
//        System.out.println("\"it is coated\"");
//        String name2 = "bro";
//        System.out.println(name2); */
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your name");
        String name = scanner.nextLine();
        System.out.println("How old are you");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("what is your favorite food ");
        String food = scanner.nextLine();
        System.out.println("hello " + name);
        System.out.println("age "+age);
        System.out.println("you like " + food);




    }
}
