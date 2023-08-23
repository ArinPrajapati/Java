public class Main {
    public static void main(String[] args) {
//        overloaded constructors  = multiple constructors within a class with the same name
//                                     but have different parameters
//                                 name+ parameters = signature

        pizza Pizza = new pizza("thick crust ", "tomato", "mozzarella", "pepperoni");
        System.out.println("here is are the ingredients of your pizza : ");
        System.out.println(Pizza.bread);
        System.out.println(Pizza.sauce);
        System.out.println(Pizza.topping);
        System.out.println(Pizza.cheese);

        pizza Pizza2 = new pizza("thick crust ", "tomato", "mozzarella");
        System.out.println("here is are the ingredients of your pain pizza : ");
        System.out.println(Pizza2.bread);
        System.out.println(Pizza2.sauce);

        System.out.println(Pizza2.cheese);

    }
}