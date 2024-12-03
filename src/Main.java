package bulgakov;

public class Main {
    public static void main(String[] args) {

        System.out.println("MyString1");
        MyString1 str1 = new MyString1(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println("charAt(1): " + str1.charAt(1));
        System.out.println("length(): " + str1.length());
        System.out.println("substring(1, 4): " + new String(str1.substring(1, 4).toChars()));
        System.out.println("toLowerCase(): " + new String(str1.toLowerCase().toChars()));
        System.out.println("valueOf(123): " + new String(MyString1.valueOf(123).toChars()));
        MyString1 str2 = new MyString1(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println("equals(str2): " + str1.equals(str2));

        System.out.println("\nMyString2");
        MyString2 str3 = new MyString2(new char[] {'W', 'o', 'r', 'l', 'd'});
        System.out.println("substring(3): " + new String(str3.substring(3).toChars()));
        System.out.println("toUpperCase(): " + new String(str3.toUpperCase().toChars()));
        System.out.println("valueOf(true): " + new String(MyString2.valueOf(true).toChars()));

        System.out.println("\nMyCharacter");
        MyCharacter myChar = new MyCharacter('a');
        System.out.println("charValue(): " + myChar.charValue());
        System.out.println("compareTo('b'): " + myChar.compareTo(new MyCharacter('b')));
        System.out.println("equals('a'): " + myChar.equals(new MyCharacter('a')));
        System.out.println("isDigit(): " + myChar.isDigit());
        System.out.println("isDigit('5'): " + MyCharacter.isDigit('5'));
        System.out.println("isLetter('A'): " + MyCharacter.isLetter('A'));
        System.out.println("isLetterOrDigit('#'): " + MyCharacter.isLetterOrDigit('#'));
        System.out.println("isLowerCase('a'): " + MyCharacter.isLowerCase('a'));
        System.out.println("isUpperCase('A'): " + MyCharacter.isUpperCase('A'));
        System.out.println("toUpperCase('b'): " + MyCharacter.toUpperCase('b'));
        System.out.println("toLowerCase('C'): " + MyCharacter.toLowerCase('C'));
    }
}
