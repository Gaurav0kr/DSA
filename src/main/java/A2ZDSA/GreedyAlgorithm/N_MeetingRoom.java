package A2ZDSA.GreedyAlgorithm;

import java.util.*;

class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos){
        this.start = start;
        this.end=end;
        this.pos=pos;
    }
}
class meetingComparator implements Comparator<meeting>{

    public int compare(meeting o1, meeting o2){
        if(o1.end<o2.end)
            return 1;
        else if(o1.end>o2.end)
            return -1;
        else if(o1.pos <o2.pos)
            return -1;
        else return 1;
    }
}
public class N_MeetingRoom {

    static void maxMeeting(int[] start,int[] end, int n){

        ArrayList<meeting> meet = new ArrayList<>();
        for(int i=0;i<start.length;i++)
            meet.add(new meeting(start[i],end[i],i+1));

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet,mc);

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i = 1;i<start.length;i++){
            if(meet.get(i).start>limit) {
                limit = meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }
        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }

    }
    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeeting(start,end,n);
    }
}
