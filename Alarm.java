import java.time.LocalTime;

public class AlarmClock {

    public static void main(String[] args) throws InterruptedException {

        // Set Alarm Time
        int alarmHour = 7;
        int alarmMinute = 30;

        System.out.println("Alarm set for " + alarmHour + ":" + alarmMinute);

        while (true) {

            LocalTime currentTime = LocalTime.now();

            int currentHour = currentTime.getHour();
            int currentMinute = currentTime.getMinute();
            int currentSecond = currentTime.getSecond();

            System.out.println("Current Time: "
                    + currentHour + ":"
                    + currentMinute + ":"
                    + currentSecond);

            // Check Alarm
            if (currentHour == alarmHour && currentMinute == alarmMinute) {
                System.out.println("⏰ Wake Up! Alarm Ringing!");
                break;
            }

            // Wait for 1 second
            Thread.sleep(1000);
        }
    }
}
