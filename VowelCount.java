package week7;

public class VowelCount {
    /* This function counts the number of vowels, consonants, digits, and special characters in a string. */
    static void countCharacterType(String str) {
        // Declare variables for counting vowels, consonants, digits, and special characters
        byte vowelsCount = 0, consonantCount = 0, digitCount = 0, splChars = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelsCount++;
                } else {
                    consonantCount++;
                }
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else {
                splChars++;
            }
        }
        
        System.out.println("The total number of Vowels in the given string: " + vowelsCount);
        System.out.println("The total number of Consonants in the given string: " + consonantCount);
        System.out.println("The total number of Digits in the given string: " + digitCount);
        System.out.println("The total number of Special Characters in the given string: " + splChars);
    }

    public static void main(String[] args) {
        String str = "Habit-2: Begin with an end in your mind.\n Stephen R. Covey author of 7 habits of Effective People, suggests that effective individuals have a clear vision of their desired destination before embarking on any endeavor.";
        countCharacterType(str);
    }
}
