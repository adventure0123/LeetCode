/**
 * Created by adventure on 16/4/17.
 */

import java.util.*;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {

    private List<Integer> list;
    private  Iterator<Integer> it;
    public NestedIterator(List<NestedInteger> nestedList) {
        list=new LinkedList<>();
        flatten(nestedList);
        it=list.iterator();

    }

    private void flatten(List<NestedInteger> nestedList){
        for(NestedInteger it:nestedList){
            if(it.isInteger()){
                list.add(it.getInteger());
            }else{
                flatten(it.getList());
            }
        }


    }

    @Override
    public Integer next() {
        return it.next();
    }

    @Override
    public boolean hasNext() {
        return it.hasNext();
    }


}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */