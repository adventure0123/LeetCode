

public class First_Bad_Version {
	  public int firstBadVersion(int n) {
	        if(isBadVersion(1)){
	            return 1;
	        }
	        return find(1,n);
	        
	    }
	    public int find(int start,int end){
	        if(end-start<=1){
	            return isBadVersion(start)?start:end;
	        }
	        int mid=start+(end-start)/2;
	        if(!isBadVersion(mid)){
	            return find(mid+1,end);
	        }else{
	            return find(start,mid);
	        }
	    }
	    private boolean isBadVersion(int mid) {
			// TODO Auto-generated method stub
	    	if(mid>= 1702766719){
	    		return true;
	    	}
	    	return false;
		}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First_Bad_Version testBad_Version=new First_Bad_Version();
		System.out.println(testBad_Version.firstBadVersion(2126753390));
	}

}
