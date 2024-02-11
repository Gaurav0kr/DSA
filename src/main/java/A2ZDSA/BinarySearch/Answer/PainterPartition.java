package A2ZDSA.BinarySearch.Answer;

public class PainterPartition {

    public static int minimumTime(int[] board, int painter)
    {
        int n = board.length;
        int low = board[0];
        int high = 0;
        for(int i=0;i<n;i++)
        {
            low = Math.max(low, board[i]);
            high += board[i];
        }
        for(int i =low;i<=high;i++)
        {
            if(countPainter(board,i)==painter)
                return i;
        }
        return low;
    }
    // Using binary search
    public static int minimumTime_Binary(int[] board, int painter)
    {
        int n = board.length;
        int low = board[0];
        int high = 0;
        for(int i=0;i<n;i++)
        {
            low = Math.max(low, board[i]);
            high += board[i];
        }
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(countPainter(board,mid) >painter)
                low = mid +1;
            else
                high = mid-1;
        }
        return low;
    }
    public static int countPainter(int[] board,int cboard)
    {
        int n = board.length;
        int boardSize =0;
        int painter =1;
        for(int i =0;i<n;i++)
        {
            if( boardSize + board[i] <=cboard)
                boardSize += board[i];
            else
            {
                painter++;
                boardSize = board[i];
            }
        }
        return painter;
    }
    public static void main(String[] args) {
        int[] boards = {10, 20, 30, 40};
        int k = 2;
        int ans = minimumTime(boards, k);
        System.out.println("The answer is: " + ans);
    }
}
