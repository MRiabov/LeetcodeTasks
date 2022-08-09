import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();

    @Test
    void searchMatrix() {
        assertEquals(-1,leetcodeTask.search(new int[]{4,5,6,7,0,1,2},3));
    }
}