import java.sql.Array;
import java.util.*;

public class Arraylist2Djava {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> foodList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> sweetsList = new ArrayList();
        sweetsList.add("ice cream");
        sweetsList.add("milk");
        sweetsList.add("coco");

        ArrayList<String> drinkList = new ArrayList();
        drinkList.add("soda");
        drinkList.add("soft Drink");

        foodList.add(bakeryList);
        foodList.add(drinkList);
        foodList.add(sweetsList);

        int a[] = {1, 2, 4, 5, 6};


//        System.out.println(foodList);
//        System.out.println(foodList.get(0));

        int w[][] = {
                {3, 234, 34, 52, 32}, {2, 23, 32, 425, 546,}, {234, 325, 42, 23423, 2342, 3, 234, 5, 5,}
        };
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(" " + w[i][j]);
//            }
//            System.out.println();
//        }
        for (int k[] : w) {
            for (int l : k
            ) {
                System.out.print(" " +l);
            }
            System.out.println();
        }
    }


}
