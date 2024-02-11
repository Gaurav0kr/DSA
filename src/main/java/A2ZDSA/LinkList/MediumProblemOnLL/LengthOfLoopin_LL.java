package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.HashMap;

public class LengthOfLoopin_LL {

    public int LengthOfLoop(Node head) {

        HashMap<Node, Integer> map = new HashMap<>();
        Node temp = head;
        int timer=1;
        int value =0;
        while(temp !=null)
        {
            if(map.containsKey(temp)) {
                value = map.get(temp);
                return value-timer;
            }
            map.put(temp, timer);
            timer++;
            temp = temp.next;
        }
        return 0;
    }
    private static int findLength(Node slow,Node fast)
    {
        int count =1;
        fast = fast.next;
        while(slow !=fast)
        {
            count++;
            fast = fast.next;
        }
        return count;
    }
    public int lengthOfloop_Optimal(Node head) {

        Node slow = head;
        Node fast = head;

        while(fast !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast)
                return findLength(slow,fast);
        }
        return 0;
    }
}
