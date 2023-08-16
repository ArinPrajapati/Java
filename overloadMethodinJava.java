public class overloadMethodinJava {
    // overload methods = methods that share the same name but have different parameter
    //     methods name + parameters = methods signature;

    public static void main(String[] args) {
   int w = add(4,5 , 5 ,10);
        System.out.println(w);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b * c / a - b;
    }

    static int add(int a, int b, int c, int d) {
        return (a + b * b + d * c);
    }
}
