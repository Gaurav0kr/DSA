package A2ZDSA.Array;

import java.util.ArrayList;

public class SetMatrixZero {

    public static int[][] setMatrixZero_Brute(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;

        int[] col = new int[m];
        int[] row = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 0;
            }
        }
        return matrix;
    }
    // Method 2
    public static int[][] setMatrix(int[][] matrix)
    {
        int n = matrix.length, m = matrix[0].length;

    //    int[] col = new int[m]; --> matrix[0][..]
    //    int[] row = new int[n]; --> matrix[..][0]
        int col =1;

        for(int i=0;i<n;i++)
        {
            for(int j =0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    //mark the ith row 0
                    matrix[i][0] =0;
                    //mark the jth col 0
                    if(j !=0)
                    matrix[0][j]=0;
                    else
                        col=0;
                }
            }
        }
        for(int i=1;i<n;i++)
        {
            for(int j =1;j<m;j++)
            {
                if(matrix[i][j] !=0) {
                    // check for col and row
                    if (matrix[0][j] == 0 || matrix[i][0] == 0)
                        matrix[i][j] = 0;
                }
            }
        }
        if(matrix[0][0]==0)
        {
            for(int j =0;j<m;j++)
                matrix[0][j]=0;
        }
        if(col ==0)
        {
            for(int i=0;i<n;i++)
                matrix[i][0]=0;
        }
        return matrix;
    }
}
