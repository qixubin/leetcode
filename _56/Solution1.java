package _56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by hacker on 7/1/2016.
 */
public class Solution1 {

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if(intervals == null || intervals.size() == 0) return res;
        if(intervals.size()== 1) {
            res.add(intervals.get(0));
            return res;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval i1, Interval i2){
                return i1.start - i2.start;
            }
        });
        int end = intervals.get(0).end, start = intervals.get(0).start;
        for(int i = 1; i < intervals.size(); i++) {
            if(end < intervals.get(i).start) {
                Interval temp = new Interval(start,end);
                res.add(temp);
                start = intervals.get(i).start;
                end = intervals.get(i).end;
            } else {
                end = Math.max(end, intervals.get(i).end);
            }
        }
        res.add(new Interval(start,end));
        return res;
    }
}
