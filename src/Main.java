package bulgakov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1:");
        MyRandom myRandom = new MyRandom();
        myRandom.generateNumbers();

        System.out.println("\nЗадание №2:");
        MyGregorianCalendar myCalendar = new MyGregorianCalendar();
        myCalendar.showCurrentDate();
        myCalendar.setTimeInMillis(1234567898765L);

        System.out.println("\nЗадание №3:");
        StopWatch stopwatch = new StopWatch();
        int[] array = new int[100000];
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100000);
        }
        stopwatch.start();
        selectionSort(array);
        stopwatch.stop();
        System.out.println("Время выполнения сортировки: " + stopwatch.getElapsedTime() + " миллисекунд");
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}