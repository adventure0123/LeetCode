

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {

	public boolean containsNearbyDuplicate(int[] nums, int k) {
		int length=nums.length;
		if(length==0){
			return false;
		}
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<length;i++){
			if(map.containsKey(nums[i])){
				int temp=map.get(nums[i]);
				if(i-temp<=k){
					return true;
				}
			}else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
