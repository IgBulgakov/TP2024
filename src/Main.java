public class Main {
    public static void main(String[] args) {
        Stock sber = new Stock("SBER", "ПАО Сбербанк");

        sber.setPreviousClosingPrice(281.50);

        sber.setCurrentPrice(282.87);

        System.out.println("Код: " + sber.getSymbol());
        System.out.println("Имя: " + sber.getName());
        System.out.println("Стоимость акций: " + sber.getCurrentPrice());
        System.out.printf("Процент изменения: %.2f%%", sber.getChangePercent());
    }
}
