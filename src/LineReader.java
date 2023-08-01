import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

public class LineReader {

    public ArrayList<String> readLines(String path, int offset) {
        ArrayList<String> output = new ArrayList<>();
        File file = new File(path);

        try (BufferedReader br = Files.newBufferedReader(file.toPath())) {
            for (int i = 0; i < offset; i++) {
                br.readLine();
            }

            for(int j = 0 ; j < 10000000; j++) {
                output.add(br.readLine());
                if(output.get(j) == null) {
                    output.remove(j);
                    return output;
                }
            }

            return output;


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
