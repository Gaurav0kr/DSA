package A2ZDSA.LinkList.MediumProblemOnLL;

import java.util.ArrayList;

public class SortLL {
    public Node sortList_Brute(Node head) {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp !=null)
        {
            list.add(temp.data);
            temp = temp.next;
        }
        sortArr(list);
        temp = head; int i=0;
        while(temp !=null)
        {
            temp.data = list.get(i);
            i = i+1;
            temp = temp.next;
        }
        return head;
    }
    public void sortArr(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i=0;i<=n-1;i++)
        {
            int j =i;
            while(j>0 && arr.get(j-1)>arr.get(j))
            {
                int temp = arr.get(j-1);
                arr.set(j - 1, arr.get(j));
                arr.set(j, temp);
                j--;
            }
        }
    }
    //**************Optimal way*************
    public Node sortList(Node head) {

        if(head ==null || head.next == null)
            return head;
        Node middle = findMiddle(head);

        Node rightNode = middle.next;
        middle.next = null;
        Node leftNode = head;
        Node sortedFirstHalf = sortList(leftNode);
        Node sortedSecondHalf = sortList(rightNode);
        return mergeTwo(sortedFirstHalf,sortedSecondHalf);
    }
    public Node mergeTwo(Node list1, Node list2)
    {
        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while(list1 != null && list2 !=null){
            if(list1.data < list2.data) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            }
            else{
                temp.next = list2;
                temp=list2;
                list2 = list2.next;
            }
        }
        if(list1 != null)
            temp.next=list1;
        else
            temp.next=list2;
        return dummyNode.next;
    }
    public Node findMiddle(Node head)
    {
        if(head ==null)
            return null;
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next !=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
