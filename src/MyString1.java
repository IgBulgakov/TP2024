package bulgakov;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];
        }
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Индекс за пределами границ");
        }
        return chars[index];
    }

    public int length() {
        int count = 0;
        for (char c : chars) {
            count++;
        }
        return count;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Недопустимый диапазон");
        }
        char[] subChars = new char[end - begin];
        for (int i = begin; i < end; i++) {
            subChars[i - begin] = chars[i];
        }
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                lowerChars[i] = (char) (chars[i] + ('a' - 'A'));
            } else {
                lowerChars[i] = chars[i];
            }
        }
        return new MyString1(lowerChars);
    }

    public static MyString1 valueOf(int i) {
        boolean isNegative = i < 0;
        if (isNegative) {
            i = -i;
        }
        char[] temp = new char[11];
        int count = 0;
        do {
            temp[count++] = (char) ('0' + i % 10);
            i /= 10;
        } while (i > 0);
        if (isNegative) {
            temp[count++] = '-';
        }
        char[] result = new char[count];
        for (int j = 0; j < count; j++) {
            result[j] = temp[count - j - 1];
        }
        return new MyString1(result);
    }

    public char[] toChars() {
        char[] copy = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            copy[i] = chars[i];
        }
        return copy;
    }

    public boolean equals(MyString1 obj) {
        if (obj == null || obj.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != obj.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}