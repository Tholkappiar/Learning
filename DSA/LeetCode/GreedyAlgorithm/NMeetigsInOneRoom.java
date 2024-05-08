
class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        List<Meeting> meetList = new ArrayList<>();
        
        for(int i=0;i<start.length;i++){
            Meeting meet = new Meeting(start[i],end[i],i+1);
            meetList.add(meet);
        }
        
        MeetingComparator meetCom = new MeetingComparator();
        
        Collections.sort(meetList, meetCom);
        
        int count = 0;
        int time = 0;
        for(int i=0;i<meetList.size();i++){
            if(time < meetList.get(i).start) {
                count++;
                time = meetList.get(i).end;
            }
        }
        // for(int i=0;i<meetList.size();i++){
        //     System.out.println(meetList.get(i));
        // }
        
        return count;
    }
}

class Meeting {
    public int start;
    public int end;
    public int pos;
    Meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
    @Override
    public String toString() {
        return ("start -> " + start + " end -> " + end);
    }
}

class MeetingComparator implements Comparator<Meeting> {
    // logic for the sorting based on the ending value
    @Override
    public int compare(Meeting first,Meeting second)  {
        if(first.end > second.end)
            return 1;
        else if(first.end < second.end)
            return -1;
        else 
            return 1;
    }
}
