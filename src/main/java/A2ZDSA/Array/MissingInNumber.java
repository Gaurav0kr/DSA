package A2ZDSA.Array;

import java.util.ArrayList;

public class MissingInNumber {

    public static int findMissing(int[] arr,int N)
    {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }
    public static void main(String args[]) {

        int arr[] = {1,3,4,5};
        int N = 5;

        System.out.println("Intersection of arr1 and arr2 is "+findMissing(arr,N));

    }
}
