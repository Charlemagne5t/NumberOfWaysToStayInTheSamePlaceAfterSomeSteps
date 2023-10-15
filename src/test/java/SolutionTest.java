import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numWaysTest1() {
        int steps = 3;
        int arrLen = 2;
        int expected = 4;
        int actual = new Solution().numWays(steps, arrLen);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numWaysTest2() {
        int steps = 2;
        int arrLen = 4;
        int expected = 2;
        int actual = new Solution().numWays(steps, arrLen);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numWaysTest3() {
        int steps = 4;
        int arrLen = 2;
        int expected = 8;
        int actual = new Solution().numWays(steps, arrLen);

        Assert.assertEquals(expected, actual);
    }
}
