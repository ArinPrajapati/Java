public class Methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        int x = 3;
        int y = 5;

        //add(x,y);
        int z = add(x, y);
        System.out.println(z);
        hello("name");
    }

    static int add(int x, int y) {
        int z = x + y;
        return 0;
    }

    static void hello(String name) {

        System.out.println("hello " + name);
    }

}
