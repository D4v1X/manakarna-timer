package es.david.aion;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by davidsantiago on 15/11/15.
 */
public class CountDown {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = 120;

        class SayHello extends TimerTask {
            public void run() {
                System.out.println(setInterval());
            }
        }

        timer.scheduleAtFixedRate(new SayHello(), delay, period);
    }

    private static final int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }

}
