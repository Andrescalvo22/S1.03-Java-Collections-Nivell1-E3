package src;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Map<String, String> data = CountryCapitalReader.fromCountries("src/countries/countries.txt");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Username: ");
            String username = scanner.nextLine();

            CapitalQuiz game = new CapitalQuiz(data);
            int score = game.play(username);

            ScoreManager scoreManager = new ScoreManager();
            scoreManager.saveScore("classification.txt", username, score);

        } catch (IOException e) {
            System.err.println("Error loading Data: " + e.getMessage());
        }
    }
}
