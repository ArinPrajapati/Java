import java.sql.Array;
import java.util.*;

public class Arraylist2Djava {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> foodList = new ArrayList();

        ArrayList<String> bakeryList  = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("bread");
        bakeryList.add("donuts");

        ArrayList<String> sweetsList  = new ArrayList();
        sweetsList.add("ice cream");
        sweetsList.add("milk");
        sweetsList.add("coco");

        ArrayList<String> drinkList  = new ArrayList();
        drinkList.add("soda");
        drinkList.add("soft Drink");

        foodList.add(bakeryList);
        foodList.add(drinkList);
        foodList.add(sweetsList);


//        System.out.println(foodList);
//        System.out.println(foodList.get(0));

        System.out.println(foodList.get(1).get(0)); //soda
    }


}
