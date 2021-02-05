package net.mike.javaExamples.strings;

public class StringsReverser {
    public String reverse(String str) {
        char tempChar = 0;
        int j = str.length() -1;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < j; i++) {
            tempChar = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = tempChar;
            j--;
        }
        str = new String(charArray);
        return str;
    }
}
