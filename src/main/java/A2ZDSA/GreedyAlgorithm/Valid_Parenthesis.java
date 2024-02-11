package A2ZDSA.GreedyAlgorithm;

import java.util.Stack;

public class Valid_Parenthesis {

    public static boolean checkValidString(String s){

        int openCount =0;
        for(char c: s.toCharArray())
        {
            if(c=='(')
                openCount++;
            else if(c==')')
                openCount--;
            if(openCount<0)
                return false;
        }
        return openCount==0;
    }

    public static boolean checkValid(String s){

        Stack<Integer> parenStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(') parenStack.push(i);
            else if (c==')') {
                if(!parenStack.isEmpty())
                    parenStack.pop();
               else if(!starStack.isEmpty())
                    starStack.pop();
                else return false;
            }
            else starStack.push(i);
        }
        while(!parenStack.isEmpty()){
            if(starStack.isEmpty())
                return false;
            if(starStack.peek()<parenStack.peek())
                return false;
            parenStack.pop();
            starStack.pop();
        }
        return true;
    }

    public static boolean checkValid_usingGreedy(String s) {
        int leftMin=0, leftMax=0;
        for(int i=0;i<s.length();i++){
            char val = s.charAt(i);
            if(val== '('){
                leftMin++;
                leftMax++;
            } else if (val== ')') {
                leftMax = leftMax-1;
                leftMin = leftMin-1;
            }else{
                leftMin = leftMin-1;
                leftMax = leftMax +1;
            }
            if(leftMin <0){
                leftMin=0;
            }
            if(leftMax<0)
                return false;
        }
        return leftMin==0;
    }
    public static void main(String[] args){
        String s="()*)";
        System.out.println("The answer is = "+checkValid_usingGreedy(s));
    }
}
