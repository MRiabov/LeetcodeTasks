public class LeetcodeTask {


    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","aaabbbccc"));
    }
    public static boolean isSubsequence(String s, String t) {
        int pos=0;
        int winCondition=0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i)==s.charAt(pos)){
                winCondition++;
                pos++;
                if (winCondition==s.length()) return true;
            }
        }
        return false;
    }
}

