import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        LineReader lr = new LineReader();

        long startTime = System.nanoTime();
        ArrayList<String> strings = lr.readLines("/H:\\Wiki Dumps\\en Wikipedia 2023-07-20\\enwiki-20230720-pages-articles-multistream.xml", 10000000);

        long stopTime = System.nanoTime();

        long timeDiff = stopTime - startTime;

        System.out.println("It took " + timeDiff / 1000000 + " milliseconds");

        System.out.println("Hello world!");
    }
}