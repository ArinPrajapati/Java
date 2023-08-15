import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        //nested loop  = a loop inside a loop

        Scanner scanner = new Scanner(System.in);
        int row;
        int col;
        String symbol ;

        System.out.println("enter the number of row's : " );
        row = scanner.nextInt();
        System.out.println("enter the number of col's : ");
        col = scanner.nextInt();
        System.out.println("enter the symbol to use");
        symbol= scanner.next();

        for (int i = 0; i < row ; i++) {
            System.out.println(); //
            for (int j = 0; j < col ; j++) {
                System.out.print(symbol);

            }
        }


    }
}
