package bulgakov;

import java.util.Calendar;

public class MyGregorianCalendar {
    private Calendar calendar;

    public MyGregorianCalendar() {
        calendar = Calendar.getInstance();
    }

    public void showCurrentDate() {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Текущая дата: " + day + "/" + month + "/" + year);
    }

    public void setTimeInMillis(long timeInMillis) {
        calendar.setTimeInMillis(timeInMillis);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Дата для " + timeInMillis + ": " + day + "/" + month + "/" + year);
    }
}