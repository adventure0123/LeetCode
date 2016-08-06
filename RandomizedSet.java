import java.util.*;

/**
 * Created by adventure on 16/8/6.
 */
public class RandomizedSet {
    /** Initialize your data structure here. */
    Map<Integer,Node> map;
    List<Node> list;
    public RandomizedSet() {
        map=new HashMap<>();
        list=new LinkedList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else {
            Node node =new Node(val);
            map.put(val,node);
            list.add(node);
            return true;
        }

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val)){
            Node node =map.remove(val);
            list.remove(node);
            return true;
        }else{
            return false;
        }

    }

    /** Get a random element from the set. */
    public int getRandom() {
        int size=list.size();
        Random random=new Random();
        int index=random.nextInt(size);
        return list.get(index).val;
    }
    class  Node{
        int val=0;
        Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet=new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.insert(2);
        System.out.println(randomizedSet.getRandom());
        randomizedSet.remove(2);
        System.out.println(randomizedSet.getRandom());
    }
}
