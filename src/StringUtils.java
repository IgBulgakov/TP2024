package bulgakov;

public class StringUtils {
    public static String[] split(String s, String regex) {
        int count = 0;
        for (int i = 0; i < getLength(s); i++) {
            if (isMatch(getCharAt(s, i), regex)) {
                count++;
            }
        }

        String[] result = new String[count * 2 + 1];
        int resultIndex = 0;
        char[] current = new char[getLength(s)];
        int currentLength = 0;

        for (int i = 0; i < getLength(s); i++) {
            char c = getCharAt(s, i);
            if (isMatch(c, regex)) {

                result[resultIndex++] = toString(current, currentLength);
                currentLength = 0;

                result[resultIndex++] = toString(new char[] { c }, 1);
            } else {
                current[currentLength++] = c;
            }
        }

        result[resultIndex] = toString(current, currentLength);

        return result;
    }


    private static boolean isMatch(char c, String regex) {
        for (int i = 0; i < getLength(regex); i++) {
            if (c == getCharAt(regex, i)) {
                return true;
            }
        }
        return false;
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


    private static String toString(char[] chars, int length) {
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = chars[i];
        }
        return new String(result);
    }
}