import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LeetCodeTaskTest {
    LeetCodeTask leetcodeTask = new LeetCodeTask();

    @Test
    void searchMatrix() {
        assertEquals(-1,leetcodeTask.search(new int[]{4,5,6,7,0,1,2},3));
    }
}