public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 40);
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + rect1.getWidth());
        System.out.println("Высота: " + rect1.getHeight());
        System.out.println("Площадь: " + rect1.getArea());
        System.out.println("Периметр: " + rect1.getPerimeter());

        System.out.println("\nПрямоугольник 2:");
        System.out.println("Ширина: " + rect2.getWidth());
        System.out.println("Высота: " + rect2.getHeight());
        System.out.println("Площадь: " + rect2.getArea());
        System.out.println("Периметр: " + rect2.getPerimeter());
    }
}
