package bulgakov;

public class MyStringBuilder2 {
    private char[] value;
    private int size;

    public MyStringBuilder2() {
        value = new char[0];
        size = 0;
    }

    public MyStringBuilder2(char[] chars) {
        size = getLength(chars);
        value = new char[size];
        for (int i = 0; i < size; i++) {
            value[i] = chars[i];
        }
    }

    public MyStringBuilder2(String s) {
        size = getLength(s);
        value = new char[size];
        for (int i = 0; i < size; i++) {
            value[i] = getCharAt(s, i);
        }
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        char[] newValue = new char[size + s.size];
        for (int i = 0; i < offset; i++) {
            newValue[i] = value[i];
        }
        for (int i = 0; i < s.size; i++) {
            newValue[offset + i] = s.value[i];
        }
        for (int i = offset; i < size; i++) {
            newValue[i + s.size] = value[i];
        }
        value = newValue;
        size += s.size;
        return this;
    }

    public MyStringBuilder2 reverse() {
        char[] reversed = new char[size];
        for (int i = 0; i < size; i++) {
            reversed[i] = value[size - 1 - i];
        }
        value = reversed;
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        char[] sub = new char[size - begin];
        for (int i = begin; i < size; i++) {
            sub[i - begin] = value[i];
        }
        return new MyStringBuilder2(toString(sub, size - begin));
    }

    public MyStringBuilder2 toUpperCase() {
        for (int i = 0; i < size; i++) {
            if (value[i] >= 'a' && value[i] <= 'z') {
                value[i] -= 32;
            }
        }
        return this;
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

    private static int getLength(char[] chars) {
        int length = 0;
        try {
            while (true) {
                char c = chars[length];
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