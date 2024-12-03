package bulgakov;

public class MyStringBuilder2 {
    private StringBuilder builder;

    public MyStringBuilder2() {
        this.builder = new StringBuilder();
    }

    public MyStringBuilder2(char[] chars) {
        this.builder = new StringBuilder(new String(chars));
    }

    public MyStringBuilder2(String s) {
        this.builder = new StringBuilder(s);
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {
        builder.insert(offset, s.toString());
        return this;
    }

    public MyStringBuilder2 reverse() {
        builder.reverse();
        return this;
    }

    public MyStringBuilder2 substring(int begin) {
        String substr = builder.substring(begin);
        return new MyStringBuilder2(substr);
    }

    public MyStringBuilder2 toUpperCase() {
        String upper = builder.toString().toUpperCase();
        this.builder = new StringBuilder(upper);
        return this;
    }

    public String toString() {
        return builder.toString();
    }
}

