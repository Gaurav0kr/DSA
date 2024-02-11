package A2ZDSA.BinarySearch.BSon2DArray;

public class Search_a_2D_Matrix_II {

    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;
        int row =0, col = m-1;
        // traverse from top right corner
        while( row<n && col >=0)
        {
            if (matrix[row][col]==target)
                return true;
            else if(matrix[row][col]<target)
                row++;
            else
                col--;
        }
        return false;
    }
}
