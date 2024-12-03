package bulgakov;

public class MyStringBuilder1 {
    private StringBuilder builder;

    public MyStringBuilder1(String s) {
        this.builder = new StringBuilder(s);
    }

    public MyStringBuilder1 append(MyStringBuilder1 s) {
        this.builder.append(s.toString());
        return this;
    }

    public MyStringBuilder1 append(int i) {
        this.builder.append(i);
        return this;
    }

    public int length() {
        return builder.length();
    }

    public char charAt(int index) {
        return builder.charAt(index);
    }

    public MyStringBuilder1 toLowerCase() {
        String lower = builder.toString().toLowerCase();
        this.builder = new StringBuilder(lower);
        return this;
    }

    public MyStringBuilder1 substring(int begin, int end) {
        String substr = builder.substring(begin, end);
        return new MyStringBuilder1(substr);
    }

    public String toString() {
        return builder.toString();
    }
}

