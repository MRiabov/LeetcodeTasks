import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetcodeTask {
    private static final int badVersion=(int)(Math.random()*100);
    private static int callsToAPI=0;
    public static void main(String[] args) {
        System.out.println(firstBadVersion(100));
    }

    private static boolean isBadVersion(int n){
        System.out.println("Calls to API: "+ ++callsToAPI);
        return n >= badVersion;
    }
    public static int firstBadVersion(int n) {
        int highestGood=0;
        int lowestBad=n;
        while (!(isBadVersion(lowestBad)&&!isBadVersion(lowestBad-1))){
            int mid=highestGood+(lowestBad-highestGood)/2;
            if (!isBadVersion(mid)) {
                highestGood=mid;
                mid=highestGood+(lowestBad-highestGood)/2;
                while (!isBadVersion(mid)) {
                    highestGood=mid;
                    mid=highestGood+(lowestBad-highestGood)/2;
                }
            }
            lowestBad=mid;
        }
        return lowestBad;
    }
}


