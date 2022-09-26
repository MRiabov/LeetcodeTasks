import java.util.*;

public class LeetCodeTask {

    Map<Integer, Integer> status;

    int UNTOUCHED = 1;
    int CURRENT = 2;
    int PASSED = 3;
    int min = 0;

    //gather every entry to a map<int stop, from which is this accessible>
    //
    //

    public int numBusesToDestination(int[][] routes, int source, int target) {
        Map<Integer, List<Integer>> toStop = new HashMap<>();
        for (int[] route : routes)
            for (int stop : route) {
                if (!status.containsKey(stop)) {
                    status.put(stop, UNTOUCHED);
                    for (int thisStop : route)
                        if (thisStop!=stop) toStop.get(stop)

                }
            }
    }

    private Integer createOrder(int number, List<Integer> prerequisites) {


    }
}


