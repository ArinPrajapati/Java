class Calc {
    int num1;
    int num2;
    int result;


    Calc(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        result = num1 + num2;
        System.out.println(result);
    }

    Calc(int a) {
        num1 = a;
        num2 = a;
        result = num1 * num2;
        System.out.println(result);
    }


}


public class Main {
    public static void main(String[] args) {
        Calc obj = new Calc(12);

    }
}