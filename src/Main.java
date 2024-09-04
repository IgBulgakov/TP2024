import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        long[] timeValuesInSeconds = {
                10000L,
                100000L,
                1000000L,
                10000000L,
                100000000L,
                1000000000L,
                10000000000L,
                100000000000L
        };

        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));

        for (long timeInSeconds : timeValuesInSeconds) {
            long timeInMillis = timeInSeconds * 1000;

            Date date = new Date(timeInMillis);

            String formattedDate = dateFormat.format(date);

            System.out.println("Время: " + timeInSeconds + " секунд -> Дата: " + formattedDate);
        }
    }
}