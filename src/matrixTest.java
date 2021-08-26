import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class matrixTest {
    public matrixTest() {
    }

    @Test
    public void test() {
        int[][] arr1 = new int[][]{{1, 2}, {3, 4}};
        matrix matr1 = new matrix(arr1, 2, 2);
        int[][] arr2 = new int[][]{{0, 0}, {1, 1}};
        matrix matr2 = new matrix(arr2, 2, 2);
        matr1 = matr1.add(matr2);
        int[][] exp_arr = new int[][]{{1, 2}, {4, 5}};
        int[][] act_arr = new int[][]{{0, 0}, {0, 0}};

        for(int i = 0; i < matr1.getN(); ++i) {
            for(int j = 0; j < matr1.getM(); ++j) {
                act_arr[i][j] = matr1.getArrij(i, j);
            }
        }

        Assertions.assertArrayEquals(exp_arr, act_arr);
        int[][] arr3 = new int[][]{{1, 2}, {3, 4}};
        matrix matr3 = new matrix(arr3, 2, 2);
        int[][] arr4 = new int[][]{{0, 0}, {1, 1}};
        matrix matr4 = new matrix(arr4, 2, 2);
        matr3 = matr3.mult(matr4);
        int[][] exp_arr1 = new int[][]{{2, 2}, {4, 4}};
        int[][] act_arr1 = new int[][]{{0, 0}, {0, 0}};

        for(int i = 0; i < matr3.getN(); ++i) {
            for(int j = 0; j < matr3.getM(); ++j) {
                act_arr1[i][j] = matr3.getArrij(i, j);
            }
        }

        Assertions.assertArrayEquals(exp_arr1, act_arr1);
    }
}
