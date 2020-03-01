package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    public void testTwoSum() {
        assertArrayEquals(new int[]{1, 2}, new TwoSum().twoSum(new int[]{1, 2, 3}, 5));
        assertArrayEquals(new int[]{0, 1}, new TwoSum().twoSum(new int[]{1, 2}, 3));
    }
}