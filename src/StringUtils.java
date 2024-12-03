package bulgakov;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    public static String[] split(String s, String regex) {
        ArrayList<String> parts = new ArrayList<>();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int lastIndex = 0;

        while (matcher.find()) {
            if (lastIndex != matcher.start()) {
                parts.add(s.substring(lastIndex, matcher.start()));
            }
            parts.add(matcher.group());
            lastIndex = matcher.end();
        }

        if (lastIndex < s.length()) {
            parts.add(s.substring(lastIndex));
        }

        return parts.toArray(new String[0]);
    }
}

