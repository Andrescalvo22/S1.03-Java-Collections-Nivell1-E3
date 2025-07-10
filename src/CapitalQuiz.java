import java.util.*;

public class CapitalQuiz {

    private final Map<String, String> countryCapitalMap;
    private int score = 0;
    private final Scanner scanner = new Scanner(System.in);
    private final Random random = new Random();

    public CapitalQuiz(Map<String, String> countryCapitalMap) {
        this.countryCapitalMap = countryCapitalMap;
    }

    public int play(String userName) {
        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());

        for (int i = 0; i < 10; i++) {
            String country = countries.get(random.nextInt(countries.size()));
            String capital = countryCapitalMap.get(country);

            System.out.print("[" + (i + 1) + "]" + "What is the Capital for " + country + "?");
            String answer = scanner.nextLine().trim();

            if (answer.equalsIgnoreCase(capital)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("False! The correct capital is: " + capital);
            }
        }
        System.out.println("\n" + userName + " has achieved " + score + " points! ");
        return score;
    }

}
