package A2ZDSA.RecursionPatterwise;

public class String_to_Integer_atoi {

    public static int convertStringToInt(String str){

        int result =0, sign =1, i=0;
        int n = str.length();
        //check for sign
        while(i<n && (str.charAt(i)=='-' || str.charAt(i)=='+')){
            sign = (str.charAt(i) == '-')?-1:1;
            i++;
        }
        //skip leading white space
        while(i<n && str.charAt(i)==' ')
            i++;

        while(i<n && Character.isDigit(str.charAt(i))){
            int digit =str.charAt(i)-'0';

            // check overflow
            if( result >Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE && digit >7)){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result*10 + digit;
            i++;
        }
        return result*sign;
    }
    // RecursiveWay


        public static void main(String[] args) {
            String str = "   -42";
            int result = myAtoi(str);
            System.out.println("Converted integer: " + result);
        }

        public static int myAtoi(String str) {
            return recursiveAtoi(str.trim(), 0, 0);
        }

        private static int recursiveAtoi(String str, int index, int result) {
            // base case
            if (index == str.length()) {
                return result;
            }

            char currentChar = str.charAt(index);

            // check for white space
            if (currentChar == ' ') {
                return recursiveAtoi(str, index + 1, result);
            }

            // check sign
            int sign = (currentChar == '-') ? -1 : 1;

            // skip leading sign
            int newIndex = (currentChar == '-' || currentChar == '+') ? index + 1 : index;
            int digit = currentChar - '0';

            // check for validity
            if (digit >= 0 && digit <= 9) {
                // check for overflow
                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                // update result
                result = result * 10 + digit * sign;

                // return for next character
                return recursiveAtoi(str, newIndex + 1, result);
            } else {
                // invalid character, stop recursion
                return result;
            }
        }
        // Another way
        public int myAtoi_2(String str) {
            // If str is NULL or str contains non-numeric
            // characters then return 0 as the number is not
            // valid
            if (str == "" || !str.matches("^\\d*$")) {
                return 0;
            }
            int n = str.length();
            // Base case (Only one digit)
            if (n == 1)
            {
                return str.charAt(0) - '0';
            }

            // If more than 1 digits, recur for (n-1),
            // multiply result with 10 and add last digit
            return (10 * myAtoi_2(str.substring(0, n - 1)) +
                    (str.charAt(n - 1) - '0'));
        }
    }