package clicker.helpers;

import java.util.Random;

public class Waiters {

    public static void timeout(int min, int max) {
        int time = (new Random().nextInt((max - min) + 1) + min);
        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            // do not check
        }
    }
}
