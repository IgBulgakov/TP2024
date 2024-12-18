package bulgakov;

public class MyString2 {
    private char[] chars;

    public MyString2(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public MyString2 substring(int begin) {
        if (begin < 0 || begin > chars.length) {
            throw new IndexOutOfBoundsException("Неверный начальный индекс");
        }
        char[] subChars = new char[chars.length - begin];
        for (int i = begin; i < chars.length; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString2(subChars);
    }

    public MyString2 toUpperCase() {
        char[] upperChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                upperChars[i] = (char) (chars[i] - ('a' - 'A'));
            } else {
                upperChars[i] = chars[i];
            }
        }
        return new MyString2(upperChars);
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public static MyString2 valueOf(boolean b) {
        char[] result = b ? new char[]{'t', 'r', 'u', 'e'} : new char[]{'f', 'a', 'l', 's', 'e'};
        return new MyString2(result);
    }
}