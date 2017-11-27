package InterviewPrepWork.Week1;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by akshaymathur on 11/25/17.
 */
public class MergeOverlappingIntervals {
    public class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        intervals.sort(new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });
        System.out.println(intervals.toString());
        int i=0;
        while(i+1<intervals.size()){
            Interval current = intervals.get(i);
            Interval next = intervals.get(i+1);
            if(next.start<=current.end){
                current.end = Math.max(next.end,current.end);
                intervals.remove(i+1);
            }
            else i++;
        }
        return intervals;
    }

}
