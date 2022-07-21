import java.util.HashMap;

public class LeetcodeTask {

    public static void main(String[] args) {

    }
//        char[] secretChar = secret.toCharArray();
//        char[] guessChar = guess.toCharArray();

    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < secret.length(); i++)
            if (secret.charAt(i) == guess.charAt(i)) bulls++;
            else {
                secretMap.put(secret.charAt(i), secretMap.get(secret.charAt(i)) + 1);
                guessMap.put(guess.charAt(i), guessMap.get(guess.charAt(i)) + 1);
            }
        for (int i = 0; i < secret.length(); i++) {
            cows+=Math.max(guessMap.getOrDefault(secret.charAt(i),0),secretMap.getOrDefault(secret.charAt(i),0));
            secretMap.put(secret.charAt(i),0);
        }
        return bulls + "A" + cows + "B";
    }
}

