import java.util.Scanner;

public class whileLoopInJava {
    public static void main(String[] args) {
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.print("enter your name");
            name = scanner.nextLine();

        }
    }
}
