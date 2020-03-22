package huawei;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class XiBaoTest {
    @Test
    void testGetNextStatus() {
        int[][] input = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] expect = new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}};

        int[][] actual = XiBao.getNextStatus(input);
        Arrays.stream(actual).forEach(subArray -> {
            String s = Arrays.stream(subArray).mapToObj(Integer::toString).collect(Collectors.joining(" "));
            System.out.println(s);
        });
        assertArrayEquals(expect, actual);
    }
}