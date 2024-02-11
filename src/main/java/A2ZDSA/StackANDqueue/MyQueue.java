package A2ZDSA.StackANDqueue;

import java.util.Stack;

public class MyQueue {

    MyQueue(){

    }
    Stack <Integer> input = new Stack<>();
    Stack <Integer> output = new Stack<>();

    public  void push(int x){
        input.push(x);
    }
    public int pop(){
        if(output.isEmpty())
            while(input.isEmpty()==false){
                output.push(input.peek());
                input.pop();
            }
        int x = output.peek();
        output.pop();
        return x;
    }
    public int peek(){
        if(output.isEmpty())
            while(input.isEmpty()==false){
                output.push(input.peek());
                output.peek();
            }
        int x = output.peek();
        return x;
    }
    public int size(){
        return output.size() + input.size();
    }
}
