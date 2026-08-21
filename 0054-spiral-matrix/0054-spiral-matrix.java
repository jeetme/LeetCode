import java.util.List;
import java.util.ArrayList;
class Solution {
    int h = 0, v = 0, horStep = 1, verStep = 0;
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int row = matrix.length, column = matrix[0].length;
        int len = row * column;
        boolean[][] visited = new boolean[row][column];
        for(int k = 0; k < len; k++) {
            visited[v][h] = true;
            spiral.add(matrix[v][h]);
            if(!(0 <= v + verStep && v + verStep < row &&
               0 <= h + horStep && h + horStep < column) ||
               visited[v + verStep][h + horStep]) {
                    int temp = horStep;
                    horStep = -verStep;
                    verStep = temp;
            }
            h = h + horStep;
            v = v + verStep;
        }
        return spiral;
    }
}