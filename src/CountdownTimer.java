import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimer {
    public static void countdown(int response) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = response;

            @Override
            public void run() {
                System.out.println(count);
                count--;
                if (count == 0){
                    System.out.println("CountDown complete");
                    timer.cancel();
                }

            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
