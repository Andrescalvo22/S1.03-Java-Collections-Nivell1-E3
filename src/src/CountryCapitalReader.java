package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalReader {
    public static Map<String, String> fromCountries(String fileName) throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] parts = line.split(" ");
                if (parts.length == 2) {
                    String country = parts[0].replace("_", " ");
                    String capital = parts[1].replace("_", " ");
                    map.put(country, capital);
                }
            }
        }
        return map;
    }
}
