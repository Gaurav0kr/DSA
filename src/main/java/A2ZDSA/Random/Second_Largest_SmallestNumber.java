package A2ZDSA.Random;

public class Second_Largest_SmallestNumber {

    public static int findSecondLargest(int[] nums){

        int largest= Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num: nums){
            if(num>largest){
                secondLargest = largest;
                largest=num;
            } else if (num>secondLargest && num!=largest)
                secondLargest=num;
        }
        return secondLargest;
    }
    public static int findSecondSmallest(int[] nums){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num: nums){
            if(num<smallest){
                secondSmallest = smallest;
                smallest=num;
            } else if (num<secondSmallest && num != smallest)
                secondSmallest=num;
        }
        return secondSmallest;
    }

    // In single Pass
    static class Pair4{
        int secondLargest;
        int secondSmallest;
        Pair4(int secondLargest,int secondSmallest){
            this.secondLargest=secondLargest;
            this.secondSmallest=secondSmallest;
        }
    }

    public static Pair4 findNumber(int[] nums){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int num : nums){
            if(num>largest){
                secondLargest = largest;
                largest= num;
            } else if (num>secondLargest && num!= largest)
                secondLargest=num;

            if(num<smallest){
                secondSmallest = smallest;
                smallest= num;
            } else if (num<secondSmallest && num!= smallest)
                secondSmallest=num;
        }
        return new Pair4(secondLargest,secondSmallest);
    }
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 7, 3, 9, 4, 6};

        int secondLargest = findSecondLargest(numbers);
        int secondSmallest = findSecondSmallest(numbers);

        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
System.out.println("**************************");
        Pair4 result = findNumber(numbers);

        System.out.println("Second Largest: " + result.secondLargest);
        System.out.println("Second Smallest: " + result.secondSmallest);

    }
}

