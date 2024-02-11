package A2ZDSA.StackANDqueue;

public class ImplementationOfStack {
    int size =1000;
    int[] arr = new int[size];
    int top =-1;

    void push(int x){
        top++;
        arr[top] = x;
    }
    int pop(){
        int x= arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
}
