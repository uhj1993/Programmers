package level1.두정수사이의합;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void solution() {
        int a = 5;
        int b = 2;
        long test;
        long answer = 14;

        Solution sol = new Solution();
        test = sol.solution(a, b);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void solution1() {
        int a = 2;
        int b = 5;
        long test;
        long answer = 14;

        Solution sol = new Solution();
        test = sol.solution(a, b);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }

    @Test
    public void solution2() {
        int a = 2;
        int b = 2;
        long test;
        long answer = 2;

        Solution sol = new Solution();
        test = sol.solution(a, b);

        Assert.assertThat(answer, CoreMatchers.is(test));
    }
}