package A2ZDSA.Array;

public class RotateImageBy90 {

    public static int[][] rotate(int[][] matrix)
    {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        return rotated;
    }
    // Optimal without using extra space

    public static int[][] rotate2(int[][] matrix)
    {
        int n = matrix.length;
        for(int i=0;i<matrix.length/2;i++){
            for(int j =i;j<n-i-1;j++){
                int temp =matrix[i][j];
                matrix[i][j] = matrix[n-j-1][i];
                matrix[n-j-1][i] = matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1] = matrix[j][n-i-1];
                matrix[j][n-i-1] = temp;
            }
        }
        return matrix;
    }
}
