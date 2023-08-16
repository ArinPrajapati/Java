import java.util.ArrayList;

public class ArrayListJava {
    public static void main(String[] args) {
        // ArrayList = a resizable array .
        // element can be added and removed after compilation phase  store reference data types

        ArrayList<String> food  = new ArrayList<String>();

        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");

        food.set(0,"watermelon");

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));

        }
    }
}
