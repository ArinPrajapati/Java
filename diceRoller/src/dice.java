import java.util.Random;

public class dice {
    Random random;

    dice() {
        random = new Random();
        int number = 0;
        roll();

    }

    void roll() {
        int number = random.nextInt(6) + 1;
        System.out.println(number);
    }


}
