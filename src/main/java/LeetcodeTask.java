import java.util.ArrayList;
import java.util.List;

public class LeetcodeTask {

    public static void main(String[] args) {

    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int matchingLetterCount = 0;
        char[] pChar = p.toCharArray();

        for (int i = 0; i < s.length() - p.length(); i++) {
            for (int k = 0; k < p.length(); k++) {
                boolean letterMatches = false;
                for (int l = 0; l < p.length(); l++) {
                    if (s.charAt(i + k) == pChar[l]) {
                        pChar[l] = '\u0000';
                        matchingLetterCount++;
                        letterMatches = true;
                        break;
                    }
                }
                if (!letterMatches) break;
            }
            if (matchingLetterCount == p.length()) result.add(i);
            matchingLetterCount = 0;
            pChar = p.toCharArray();
        }

        return result;
    }
}

//        if (letter==s.charAt(i)){
//                    p
//                    s.getChars(i+1,i+pChar.length-1,sChar,0);
//                    //if set of letters equals...

//for (int i = 0; i < s.length(); i++) {
//        for (int j = 0; j < p.length(); j++) {
//            if (s.charAt(i)==pChar[j]){
//                if (matchingLetterCount==0) currentAnagram=i;
//                matchingLetterCount++;
//                pChar[j]='\u0000';
//                break;
//            }
//
//        }
//        if (matchingLetterCount==p.length()){
//            result.add(currentAnagram);
//            matchingLetterCount=0;
//            pChar=p.toCharArray();
//        } else if (i==currentAnagram+p.length()) {
//            pChar=p.toCharArray();
//            matchingLetterCount=0;
//        }
//    }
//        return result;
//}

