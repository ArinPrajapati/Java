public class ArrayOfObjectsJava {
    public static void main(String[] args) {
        Food food1 = new Food("apple");
        Food food2 = new Food("pineapple");
        Food food3 = new Food("orange");
        Food[] refrigerator = {food1, food2, food3};
        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println(refrigerator[i].name);
        }
    }
}

class Food {
    String name;
    Food(String name) {
        this.name = name;
    }
}