package A2ZDSA.StackANDqueue;

public class Implement_Stack_using_LL {

    private class StackNode{
        int data;
        StackNode next;
        StackNode(int d){
            data = d;
            next = null;
        }
    }
    StackNode top;
    int size;
    Implement_Stack_using_LL(){
        this.top = null;
        this.size =0;
    }
    public void stackPush(int x){
        StackNode element = new StackNode(x);
        element.next = top;
        top= element;
        System.out.println("Element pushed");
        size++;
    }
    public int stackPop(){
        if(top==null) return -1;
        int topData = top.data;
        StackNode temp = top;
        top = top.next;
        return topData;
    }
    public int stackSize() {
        return size;
    }
    public boolean stackEmpty(){
        return top == null;
    }
    public void printStack(){
        StackNode current = top;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
