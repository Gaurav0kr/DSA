package A2ZDSA.String.Medium;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) return "";
        StringBuilder result = new StringBuilder();

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        int i =0;
        //iterate until the number becomes zero, NO NEED to go until the last element in roman array
        while (num >0) {
            while ( num >= values[i]) {
                num -= values[i];
                result.append(roman[i]);
            }
            i++;
        }

        return result.toString();
    }
    // Use Binary Search
    public String intToRoman_using_Binary(int num) {
        int[] numerals = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romans = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        StringBuilder ans = new StringBuilder();
        int div = numerals.length - 1;
        while(num!=0){
            div = greatestDivisor(numerals,0,div,num);
            ans.append(romans[div]);
            num -=  numerals[div];
        }
        return ans.toString();
    }
    private int greatestDivisor(int[] nums,int i,int j,int target){
        while(i<=j){
            int mid = i + (j-i)/2;
            if(target < nums[mid])
                j = mid - 1;
            else i = mid + 1;
        }
        return i - 1;
    }

}
