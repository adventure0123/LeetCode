import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by adventure on 16/4/20.
 */

public class Reconstruct_Itinerary {
    public List<String> findItinerary(String[][] tickets) {
        Map<String,String> map=new HashMap<>();
        int length=tickets.length;
        for(int i=0;i<length;i++){
            if(map.containsKey(tickets[i][0])){
                String temp=map.get(tickets[i][0]);
                if(tickets[i][1].compareTo(temp)<0){
                    map.put(tickets[i][0],tickets[i][1]);
                }
            }else{
                map.put(tickets[i][0],tickets[i][1]);
            }
        }
        List<String> result=new LinkedList<>();
        String dest=map.get("JFK");
        result.add("JFK");
        result.remove(dest);
        result.add(dest);
        int times=1;
        while (times<length){
            times++;
            dest=map.get(dest);
            //result.remove(dest);
            if(dest==null){
                break;
            }
            result.add(dest);
        }
        return result;

    }


    public static void main(String[] args) {
        Reconstruct_Itinerary test=new Reconstruct_Itinerary();
        String[][] tickets={{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
        System.out.println(test.findItinerary(tickets));
    }
}
