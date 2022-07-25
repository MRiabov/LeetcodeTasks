import java.util.ArrayList;
import java.util.Collections;

public class LeetcodeTask {

    public String multiply(String num1, String num2) {
        ArrayList<Integer> digits=new ArrayList<>(num1.length()+num2.length());
        Collections.fill(digits,0);
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=0;i<num1.length();i++)
            for (int j=0,offset=0;j<num2.length();j++,offset=i+j){
                digits.set(offset,digits.get(offset)+Character.getNumericValue(num1.charAt(i))*Character.getNumericValue(num1.charAt(j)));
            }
        int addToNext=0;
        int currentPos=0;
        for (int digit:digits){
            digits.set(currentPos,(digit+addToNext)%10);
            stringBuilder.append((digit+addToNext)%10);
            addToNext=(digit+addToNext)/10;
            currentPos++;
        }


        return stringBuilder.reverse().toString();
    }
}


