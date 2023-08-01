import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        String inputPath = "/H:\\Wiki Dumps\\en Wikipedia 2023-07-20\\enwiki-20230720-pages-articles-multistream.xml";
        String outputPath = "/H:/out.txt";
        File file = new File(outputPath);
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        int fileSize = 1395344461;
        int counter = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputPath))) {
            String lastLine = br.readLine();
            do {
                counter++;
                System.out.println("Read line number " + counter);
                bw.write(lastLine);
                bw.newLine();
                lastLine = br.readLine();
            } while (lastLine != null);
        }
        bw.close();

    }
}