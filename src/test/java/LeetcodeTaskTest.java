import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeetcodeTaskTest {
    LeetcodeTask leetcodeTask = new LeetcodeTask();
    @Test
    void OneIslandEqualsOne() {
        assertEquals(1,leetcodeTask.numIslands(new char[][] {{1},{1}}));
    }


}