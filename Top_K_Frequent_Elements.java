import java.util.*;

/**
 * Created by adventure on 16/5/7.
 */
public class Top_K_Frequent_Elements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int length=nums.length;
        List<Integer> result=new ArrayList<>();
        if(length==0){
            return  result;
        }
        for(int i=0;i<length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else {
                map.put(nums[i],1);
            }
        }
        int min=Integer.MIN_VALUE;
        PriorityQueue<Node> queue=new PriorityQueue<>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Node)o1).getTimes()-((Node)o2).getTimes();
            }
        });
        for(Integer num:map.keySet()){
           if(queue.size()<k){
               queue.add(new Node(num,map.get(num)));
           }else {
               int temp=queue.peek().getTimes();
               if(map.get(num)>temp){
                   queue.poll();
                   queue.add(new Node(num,map.get(num)));
               }
           }
        }
        while(!queue.isEmpty()){
            result.add(queue.poll().getValue());
        }
        return result;
    }

    class Node{
        public void setValue(int value) {
            this.value = value;
        }

        int value;

        public int getValue() {
            return value;
        }

        public int getTimes() {
            return times;
        }

        public void setTimes(int times) {
            this.times = times;
        }

        int times;
        public Node(int value,int times){
            this.value=value;
            this.times=times;
        }
    }

    public static void main(String[] args) {
        Top_K_Frequent_Elements test=new Top_K_Frequent_Elements();
        int[] nums={1,1,2,3,4,5,3,4};
        System.out.println(test.topKFrequent(nums,3));
    }
}
