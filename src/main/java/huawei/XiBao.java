package huawei;

import java.util.ArrayList;

public class XiBao {
    public static int[][] getNextStatus(int[][] currentStatus) {
        int rows = currentStatus.length;
        int[][] result = new int[rows][];
        for (int i = 0; i < rows; i++) {
            int columns = currentStatus[i].length;
            result[i] = new int[columns];
            for (int j = 0; j < columns; j++) {
                ArrayList<Integer> status = new ArrayList<>();
                if (i - 1 >= 0 && j - 1 >= 0) {
                    status.add(currentStatus[i - 1][j - 1]);
                }
                if (j - 1 >= 0) {
                    status.add(currentStatus[i][j - 1]);
                }
                if (i + 1 < rows && j - 1 >= 0) {
                    status.add(currentStatus[i + 1][j - 1]);
                }
                if (i - 1 >= 0) {
                    status.add(currentStatus[i - 1][j]);
                }
                if (i + 1 < rows) {
                    status.add(currentStatus[i + 1][j]);
                }
                if (i - 1 >= 0 && j + 1 < columns) {
                    status.add(currentStatus[i - 1][j + 1]);
                }
                if (j + 1 < columns) {
                    status.add(currentStatus[i][j + 1]);
                }
                if (i + 1 <rows && j + 1 < columns) {
                    status.add(currentStatus[i + 1][j + 1]);
                }

                long live = status.stream().filter(item -> item == 1).count();
                if (currentStatus[i][j] == 1 && live < 2) {
                    result[i][j] = 0;
                } else if (currentStatus[i][j] == 1 && (live == 2 || live == 3)) {
                    result[i][j] = 1;
                } else if (currentStatus[i][j] == 1 && live > 3) {
                    result[i][j] = 0;
                }
                if (currentStatus[i][j] == 0 && live == 3) {
                    result[i][j] = 1;
                }
            }
        }
        return result;
    }
}
