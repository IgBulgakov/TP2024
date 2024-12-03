package bulgakov;

public class MyCharacter {
    private char value;

    public MyCharacter(char value) {
        this.value = value;
    }

    public char charValue() {
        return value;
    }

    public int compareTo(MyCharacter anotherCharacter) {
        return this.value - anotherCharacter.value;
    }

    public boolean equals(MyCharacter anotherCharacter) {
        return this.value == anotherCharacter.value;
    }

    public boolean isDigit() {
        return Character.isDigit(this.value);
    }

    public static boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }

    public static boolean isLetterOrDigit(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    public static boolean isLowerCase(char ch) {
        return Character.isLowerCase(ch);
    }

    public static boolean isUpperCase(char ch) {
        return Character.isUpperCase(ch);
    }

    public static char toUpperCase(char ch) {
        return Character.toUpperCase(ch);
    }

    public static char toLowerCase(char ch) {
        return Character.toLowerCase(ch);
    }
}

