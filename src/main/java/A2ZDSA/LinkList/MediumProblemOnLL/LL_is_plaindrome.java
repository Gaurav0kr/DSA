package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.ArrayList;
import java.util.Stack;

public class LL_is_plaindrome {

    public static boolean isPalindrome(Node head) {

        ArrayList<Integer> arr = new ArrayList<>();
        while(head !=null)
        {
            arr.add(head.data);
            head = head.next;
        }
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i) != arr.get(arr.size()-i-1))
                return false;
        }
        return true;
    }
    // using stack
    public static boolean isPalindrome_UsingStack(Node head) {
        Stack<Integer> st = new Stack<>();
        Node temp = head;
        while(temp !=null)
        {
            st.push(temp.data);
            temp = temp.next;
        }

        while(head !=null)
        {
            if(head.data != st.pop())
                return false;
            head = head.next;
        }
        return true;
    }
    // optimal solution
/*    private static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;
        while(fast.next !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }*/
    private static Node reverseList(Node head) {
        Node pre = null;
        Node next = null;
        while(head !=null){
            next=head.next;
            head.next=pre;
            pre = head;
            head = next;
        }
        return pre;
    }
    public static boolean isPalindrome_Optimal(Node head){
        if(head == null || head.next==null)
            return true;
        Node slow = head;
        Node fast = head;

        while(fast.next !=null && fast.next.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the right half
        slow.next = reverseList(slow.next);
        //Move slow to the right half
        slow = slow.next;
        //check for the left half
        while(slow !=null){
            if(head.data != slow.data)
                return false;
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
