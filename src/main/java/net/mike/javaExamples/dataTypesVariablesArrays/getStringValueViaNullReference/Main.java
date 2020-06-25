package net.mike.javaExamples.dataTypesVariablesArrays.getStringValueViaNullReference;

public class Main {

    public static void main(String... args) {
        Main nullReference = null;
        System.out.println(nullReference.getString());
    }

    public static String getString() {
        return "Hallo Word";
    };
}
