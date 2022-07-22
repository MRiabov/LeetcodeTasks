import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class LeetcodeTask {

    public static void main(String[] args) {

    }
//        char[] secretChar = secret.toCharArray();
//        char[] guessChar = guess.toCharArray();

    public String decodeString(String s) {
        StringBuilder stringBuilder = new StringBuilder()//needs to be used in midResult
        String midResult;//internal result, stated every while loop
        boolean nextLayer = true; //is
        int amountOfRepeat;
        while (nextLayer) {
            nextLayer = false;
            boolean lookup = false;
            for (int i = 0; i <; i++) {
                if (!lookup) {
                    if (s.charAt(i) == '[') {
                        amountOfRepeat = s.charAt(i - 1);
                        lookup = true;
                    }
                } else

            }
            for (int i = 0; i < amountOfRepeat; i++) {
                stringBuilder.append()
            }

        }
    }
}

