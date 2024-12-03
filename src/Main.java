package bulgakov;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        String[] result1 = StringUtils.split("ab#12#453", "#");
        System.out.println(Arrays.toString(result1));

        String[] result2 = StringUtils.split("a?b?gf#e", "[?#]");
        System.out.println(Arrays.toString(result2));

        System.out.println("\nЗадание 2:");
        MyStringBuilder1 msb1 = new MyStringBuilder1("Hello");
        MyStringBuilder1 msb2 = new MyStringBuilder1(" World!");
        System.out.println(msb1.append(msb2).toString());
        System.out.println(msb1.append(123).toString());
        System.out.println(msb1.toLowerCase().toString());
        System.out.println(msb1.substring(2, 8).toString());

        System.out.println("\nЗадание 3:");
        MyStringBuilder2 msb3 = new MyStringBuilder2("abcdef");
        MyStringBuilder2 msb4 = new MyStringBuilder2("12345");
        System.out.println(msb3.insert(3, msb4).toString());
        System.out.println(msb3.reverse().toString());
        System.out.println(msb3.substring(2).toString());
        System.out.println(msb3.toUpperCase().toString());
    }
}
