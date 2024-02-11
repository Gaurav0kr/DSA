package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.HashSet;

public class IntersectionOfTwoLL {

    public static Node findIntersection_brute(Node head1, Node head2)
    {
        while(head2 !=null)
        {
            Node temp = head1;
            while(temp !=null){
                if(temp ==head2)
                    return head2;
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    // Using Hashing
    public static Node findIntersection_UsingHashing(Node headA, Node headB) {
        HashSet<Node> set = new HashSet<>();
        while(headB !=null) {
            set.add(headB);
            headB = headB.next;
        }
        while(headA !=null){
            if(set.contains(headA))
                return headA;

            headA = headA.next;
        }
        return null;
    }
    // Approach 3
    // first find length diff of both list
    // and then start search from there
    public static int findlength(Node headA, Node headB){
        int len1=0,len2 =0;
        while(headA !=null || headB != null)
        {
            if(headA != null) {
                len1++;
                headA = headA.next;
            }
            else if(headB != null){
                len2++;
                headB = headB.next;
            }
        }
        return len1-len2; // if value is negative that means lenghth of list2 is greater
    }
    public static Node findIntersection_UsingLength(Node headA, Node headB){
        int diff= findlength(headA,headB);
        if(diff<0)
            while(diff++ !=0)
                headB = headB.next;
        else while (diff-- !=0)
            headA = headA.next;

        while(headA !=null)
        {
            if(headA == headB)
                return headA;
            headB= headB.next;
            headA=headA.next;
        }
        return headA;
    }
    // Optimal approach
    public static Node findIntersection_Optimal(Node headA, Node headB){

        if(headA ==null || headB == null)
            return null;
        Node a = headA, b = headB;
        while(a != b)
        {
            a = a==null ? headB: a.next;
            b = b==null ? headA: b.next;
        }
        return a;
    }
}
