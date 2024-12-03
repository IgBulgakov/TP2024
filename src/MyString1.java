package bulgakov;

public class MyString1 {
    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString1 substring(int begin, int end) {
        if (begin < 0 || end > chars.length || begin > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }
        char[] subChars = new char[end - begin];
        System.arraycopy(chars, begin, subChars, 0, end - begin);
        return new MyString1(subChars);
    }

    public MyString1 toLowerCase() {
        char[] lowerChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            lowerChars[i] = Character.toLowerCase(chars[i]);
        }
        return new MyString1(lowerChars);
    }

    public static MyString1 valueOf(int i) {
        return new MyString1(String.valueOf(i).toCharArray());
    }

    public char[] toChars() {
        char[] result = new char[chars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        return result;
    }

    public boolean equals(MyString1 obj) {
        if (obj == null || this.chars.length != obj.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (this.chars[i] != obj.chars[i]) {
                return false;
            }
        }
        return true;
    }
}

