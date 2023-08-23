public class pizza {
    static String bread;
    static String sauce;
    static String cheese;
    static String topping;

    pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = topping;

    }

    pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }

    pizza(String bread, String sauce) {
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
    }


}
