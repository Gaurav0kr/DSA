package A2ZDSA.StackANDqueue;

import java.util.Stack;
class MinStack2 {
    Stack<Long> st = new Stack<Long>();
    Long min;
    public MinStack2() {
        min = Long.MAX_VALUE;
    }

    public void push(int value) {
       long val = Long.valueOf(value);
       if(st.isEmpty()){
           min = val;
           st.push(val);
       }else{
           if(val<min){
               st.push(2*val -min);
               min = val;
           }
           else
           {
               st.push(val);
           }
       }
    }
    public void pop() {
        if(st.isEmpty())
            return;
        long val = st.pop();
        if(val <min)
            min = 2*min -val;
    }
    public int top() {
        Long val = st.peek();
        if(val<min) {
            return min.intValue();
        }
        return val.intValue();
    }

    public int getMin() {
        return min.intValue();
    }
}
