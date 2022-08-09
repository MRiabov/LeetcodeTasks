import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();

    @Test
    void searchMatrix() {
        assertTrue(leetcodeTask.searchMatrix(new int[][]{{1,3}},3));
    }
}