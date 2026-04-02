import java.io.*;
import java.util.*;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String filename = args.length > 0 ? args[0] : "input.txt";
        Map<String, Integer> freq = new TreeMap<>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            for (String word : line.toLowerCase().split("\\W+")) {
                if (!word.isEmpty())
                    freq.merge(word, 1, Integer::sum);
            }
        }
        br.close();
        freq.forEach((w, c) -> System.out.println(w + " : " + c));
    }
}
