package bulgakov;

public class MyStringBuilder1 {
    private char[] value;
    private int size;

    public MyStringBuilder1(String s) {
        size = getLength(s);
        value = new char[size];
        for (int i = 0; i < size; i++) {
            value[i] = getCharAt(s, i);
        }
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        char[] newValue = new char[size + s.size];
        for (int i = 0; i < size; i++) {
            newValue[i] = value[i];
        }
        for (int i = 0; i < s.size; i++) {
            newValue[size + i] = s.value[i];
        }
        value = newValue;
        size += s.size;
        return this;
    }

    public MyStringBuilder1 append(int i) {
        boolean isNegative = i < 0;
        if (isNegative) i = -i;

        char[] digits = new char[10];
        int digitCount = 0;
        do {
            digits[digitCount++] = (char) ('0' + (i % 10));
            i /= 10;
        } while (i > 0);

        if (isNegative) {
            digits[digitCount++] = '-';
        }

        char[] reversedDigits = new char[digitCount];
        for (int j = 0; j < digitCount; j++) {
            reversedDigits[j] = digits[digitCount - 1 - j];
        }

        return append(new MyStringBuilder1(toString(reversedDigits, digitCount)));
    }

    public int length() {
        return size;
    }

    public char charAt(int index) {
        return value[index];
    }

    public MyStringBuilder1 toLowerCase() {
        for (int i = 0; i < size; i++) {
            if (value[i] >= 'A' && value[i] <= 'Z') {
                value[i] += 32;
            }
        }
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        char[] sub = new char[end - begin];
        for (int i = begin; i < end; i++) {
            sub[i - begin] = value[i];
        }
        return new MyStringBuilder1(toString(sub, end - begin));
    }

    public String toString() {
        return toString(value, size);
    }

    private static String toString(char[] chars, int length) {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = chars[i];
        }
        return new String(result);
    }

    private static int getLength(String s) {
        int length = 0;
        try {
            while (true) {
                s.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            return length;
        }
    }

    private static char getCharAt(String s, int index) {
        return s.charAt(index);
    }
}