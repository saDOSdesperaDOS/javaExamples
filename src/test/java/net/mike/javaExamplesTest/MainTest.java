package net.mike.javaExamplesTest;

import net.mike.javaExamples.strings.StringsReverser;

public class MainTest {
    public static void main(String... args) {
        StringsReverser reverser = new StringsReverser();
        String str = "abcdefg";
        /*char[] charArr = reverser.reverse(str);
        for (char c: charArr) {
            System.out.print(c);
        }*/

        System.out.println(reverser.reverse(str));


    }
}
