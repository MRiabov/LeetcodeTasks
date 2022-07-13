import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class LeetcodeTask {
    public static void main(String[] args) {
    }

    public int longestPalindrome(String s) {
        HashMap <Character,Integer> hashMap = new HashMap<>();
        boolean uneven;
        s.chars()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .map(e->e.getValue())
                .
    }


}


