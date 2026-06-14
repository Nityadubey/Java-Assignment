import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class StudyTimer {

    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();

        for (int i = 10; i >= 1; i--) {
            int count = i;
            scheduler.schedule(() -> System.out.println(count), 10 - count, TimeUnit.SECONDS);
        }

        scheduler.schedule(() -> {
            System.out.println("Study Time");
            scheduler.shutdown();
        }, 10, TimeUnit.SECONDS);
    }
}