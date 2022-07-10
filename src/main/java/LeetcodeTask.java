public class LeetcodeTask {


    public static void main(String[] args) {
        System.out.println(isIsomorphic("title","paper"));

    }
    public static boolean isIsomorphic(String s, String t) {

        char[] sToChar=s.toCharArray();
        char[] tToChar=t.toCharArray();
        int[] sChangeState=new int[sToChar.length];
        int[] tChangeState=new int[sToChar.length];
        int sLetterNumber=1;
        int tLetterNumber=1;

        for (int i = 0; i < sToChar.length; i++) {
            for (int j = 0; j < i; j++) {
                if (sToChar[i]==sToChar[j]) {
                    sChangeState[i] = sChangeState[j];
                    break;
                } else sChangeState[i]=sLetterNumber++;
            }
            for (int j = 0; j < i; j++) {
                if (tToChar[i]==tToChar[j]) {
                    tChangeState[i] = tChangeState[j];
                    break;
                } else tChangeState[i]=tLetterNumber++;
            }
        }

        for (int i = 0; i < sToChar.length; i++) {
            if (sChangeState[i]!=tChangeState[i]) return false;
        }
        return true;
    }



}

