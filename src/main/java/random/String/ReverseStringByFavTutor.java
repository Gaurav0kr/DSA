package random.String;

public class ReverseStringByFavTutor {

    public static void main(String[] args) {

        String stringExample  =  "Fav Tutor Gaurav";
        System.out.println("Original string: "+stringExample);
        int n = stringExample.length(); // length of String
        String reversedString ="";
        char character;
        for(int i=0;i<n;i++){
            //extracts each character
            character= stringExample.charAt(i);
            //concatenates each character in front of the new string                 i.e. reversedString
            reversedString = character+reversedString;
        }
        System.out.println("Reversed string: "+reversedString); //  Printing the reversed String
        //Original string: Fav Tutor Gaurav
        //  Reversed string: varuaG rotuT vaF
    }
}
