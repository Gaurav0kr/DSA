package A2ZDSA.GreedyAlgorithm;

import java.util.Arrays;

public class Candy {

    public static int candyDistribution(int[] ratings) {

        int n = ratings.length;
        int totalCandies=0;
        //Create an array to store distribution
        int[] distribution = new int[n];
        Arrays.fill(distribution,1);

        // Increase the number of candies of rightNode if rightindex has higherRatings
        for(int i=0;i<n-1;i++){
            if(ratings[i+1] > ratings[i])
                distribution[i+1] = distribution[i]+1;
        }

        // Increase the number of candies of LeftNode if leftindex has higherRatings
        for(int i=n-1;i>0;i--){
            if(ratings[i-1] > ratings[i]) {
                if(distribution[i-1]<= distribution[i])
                distribution[i - 1] = distribution[i] + 1;
            }
        }
        // count the number ofTotal candies
        for(int i=0;i<n;i++)
            totalCandies += distribution[i];
        return totalCandies;
    }
    public static void main(String[] args)
    {
        int[] candies ={1,2,2};
        System.out.println("Answer is "+candyDistribution(candies));
    }
}
