
class Solution {
    public int activitySelection(int[] start, int[] finish) {
        // code here
        class Activity{
            int start;
            int finish;
            Activity(int start,int finish){
                this.start=start;
                this.finish=finish;
            }
        }
        Activity[] Activities= new Activity[start.length];
        for(int i=0;i<start.length;i++){
            Activities[i]= new Activity(start[i],finish[i]);
        }
        Arrays.sort( Activities ,(a,b)->a.finish-b.finish);
        int c=1;
        int lastFinish=0;
        for(int i=1;i<start.length;i++){
            if(Activities[i].start>Activities[lastFinish].finish){
                c++;
                lastFinish=i;
        }   }
        return c;
    }
}
