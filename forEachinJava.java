import java.util.ArrayList;

public class forEachinJava {
    public static void main(String[] args) {
        //for -each  - traversing technique to interate through the elements in an array /collection
        //              less steps ,more readable
        //              less flexible


//        String[] animals = {"cat","dog","rat","fish"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("fish");
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");


        for (String i: animals
             ) {
            System.out.println(i);
        }
    }
}
