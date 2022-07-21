import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();

    @Test
    void twoSum() {
        assertEquals(new int[]{0,1},leetcodeTask.twoSum(new int[]{3,3},6));

    }
}