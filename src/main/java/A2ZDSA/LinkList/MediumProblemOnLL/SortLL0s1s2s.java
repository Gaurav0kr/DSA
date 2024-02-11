package A2ZDSA.LinkList.MediumProblemOnLL;

public class SortLL0s1s2s {

    public static Node sortll(Node head)
    {
        Node temp = head;
        int count0=0, count1=0,count2=0;
        while(temp !=null)
        {
            if(temp.data==0) count0++;
            else if(temp.data==1) count1++;
            else count2++;
            temp = temp.next;
        }

        temp = head;
        while(temp !=null)
        {
            if(count0 !=0){
                temp.data=0;
                count0--;
            }
            else if(count1 !=0){
                temp.data=1;
                count1--;
            }
            else{
                temp.data=2;
                count2--;
            }
            temp= temp.next;
        }
        return head;
    }
    public static Node sortLL_Optimal(Node head){

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);

        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp= head;

        while(temp !=null){
            if(temp.data ==0){
                zero.next=temp;
                zero = zero.next;
            } else if (temp.data==1) {
                one.next = temp;
                one = one.next;
            }else {
                two.next=temp;
                two = two.next;
            }
            temp = temp.next;
        }

        zero.next = (oneHead.next !=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next;
        two.next=null;

        Node newHead = zeroHead.next;
        return newHead;
    }
}
