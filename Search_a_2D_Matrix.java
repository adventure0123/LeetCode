

public class Search_a_2D_Matrix {

	public boolean searchMatrix(int[][] matrix, int target) {
		int row=matrix.length;
		if(row==0){
			return false;
		}
		int column=matrix[0].length;
		int start=0;
		int end=row-1;
		int mid=0;
		while(start<=end){
			mid=(start+end)>>1;
			if(matrix[mid][0]==target){
				return true;
			}else if(matrix[mid][0]>target){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		int index=end;
		if(index==-1){
			return false;
		}
		start=0;
		end=column-1;
		//System.out.println(index);
		while(start<=end){
			mid=(start+end)>>1;
			if(matrix[index][mid]==target){
				return true;
			}else if(matrix[index][mid]>target){
				end=mid-1;
			}else{
				start=mid+1;
			}
		}
		return false;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search_a_2D_Matrix test=new Search_a_2D_Matrix();
		int[][] A={ {1,2,3},
				};
		System.out.println(test.searchMatrix(A, -12));
	}

}
