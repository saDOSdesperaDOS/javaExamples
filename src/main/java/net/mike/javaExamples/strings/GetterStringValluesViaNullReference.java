package net.mike.javaExamples.strings;


public class GetterStringValluesViaNullReference {

    public static void main(String... args) {
        GetterStringValluesViaNullReference nullReference = null;
        System.out.println(nullReference.getString());

    }
    public static String getString() {
        return "Hallo Word";
    };
}
