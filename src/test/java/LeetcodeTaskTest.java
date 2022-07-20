import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();




    @Test
    void findAnagrams() {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(6);
        assertEquals(result, leetcodeTask.findAnagrams("cbaebabacd","abc"));
    }
}