package bulgakov;

import java.util.Random;

public class MyRandom {
    private Random random;

    public MyRandom() {
        random = new Random(1000);
    }

    public void generateNumbers() {
        for (int i = 0; i < 50; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();
    }
}