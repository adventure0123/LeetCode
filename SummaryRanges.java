import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by adventure on 16/6/9.
 */
public class SummaryRanges {

    private TreeSet<Interval> treeSet;
    /** Initialize your data structure here. */
    public SummaryRanges() {
        treeSet=new TreeSet<Interval>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Interval) o1).start-((Interval) o2).start;
            }
        });
    }

    public void addNum(int val) {
        Interval interval=new Interval(val,val);
        Interval floor=treeSet.floor(interval);
        if(floor!=null){
            if(floor.end>=val){
                return;
            }else if(floor.end+1==val){
                treeSet.remove(floor);
                interval.start=floor.start;
            }
        }
        Interval upper=treeSet.higher(interval);
        if(upper!=null){
            if(interval.end+1>=upper.start){
                treeSet.remove(upper);
                interval.end=upper.end;
            }else if(val+1==upper.start){
                upper.start=val;
                return;
            }
        }
        treeSet.add(interval);
    }

    public List<Interval> getIntervals() {
        return Arrays.asList(treeSet.toArray(new Interval[0]));
    }

    class Interval{
        int start=0;
        int end=0;
        public Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
        public String toString(){
            return  "["+start+","+end+"]";
        }
    }

    public static void main(String[] args) {
        SummaryRanges test=new SummaryRanges();
        int [] nums={1};
        for(int i=0;i<nums.length;i++){
            test.addNum(nums[i]);
            System.out.println(test.getIntervals().toString());
        }
    }
}
