import java.util.List;
import java.util.ArrayList;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Spiral_Matrix sm = new Spiral_Matrix();
        List<Integer> result = sm.spiralOrder(matrix);
        System.out.println(result);
        }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> solution = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                solution.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                solution.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    solution.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    solution.add(matrix[i][left]);
                }
                left ++;
            }
        }
        return solution;
    }
}
