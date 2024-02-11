package A2ZDSA.BinarySearch.BSon2DArray;

public class Search_a_2DMatrix {
    public static boolean binarySearchOnrows(int[] row, int target)
    {
        int n = row.length;
        int low =0, high = n-1;
        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if(row[mid]==target)
                return true;
            else if (row[mid]<target)
                low = mid +1;
                else
                    high = mid-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;
        boolean ans = false;
        for(int i=0;i<n;i++)
        {
            int low =0, high = m-1;
            if(matrix[0][i]<=target && target <= matrix[0][m-1])
            {
                ans = binarySearchOnrows(matrix[i], target);
            }
        }
        return false;
    }
    // Optimal solution
    public boolean searchMatrix_Optimal(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;
        int low = 0, high = (n*m)-1;
        while(low<=high)
        {
            int mid = (low + high)/2;
            int row = mid/m, col = mid%m;
            if(matrix[row][col]==target)
                return true;
            else if(matrix[row][col]<target)
                low = mid+1;
            else
                high = mid-1;
        }
        return false;
    }
    }
