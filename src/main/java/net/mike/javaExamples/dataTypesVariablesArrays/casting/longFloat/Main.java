package net.mike.javaExamples.dataTypesVariablesArrays.casting.longFloat;

public class Main {
    public static void main(String... args) {
        float f = 3;// 32 bits
        long l = 234;// 64 bits
        f = l;//хотя сужающее приведение нужно делать явно, но из-за того что диапазон float > long,
              // поэтому l приводится к float неявно, несмотря на то, что размер у long==64 bit, а у float==32
    }
}
