

import java.util.Stack;

public class Number_of_Islands {
	  public int numIslands(char[][] grid) {
		  int row=grid.length;
		  if(row==0){
			  return 0;
		  }
		  int column=grid[0].length;
		  int result=0;
		  Stack<position> stack=new Stack<>();
		  boolean[][] symbol=new boolean[row][column];
		  for(int i=0;i<row;i++){
			  for(int j=0;j<column;j++){
				  if(symbol[i][j]==false&&grid[i][j]=='1'){
					  result++;
					  symbol[i][j]=true;
					  stack.add(new position(i,j));
					  while(!stack.isEmpty()){
						  position temp=stack.pop();
						  int x=temp.x;
						  int y=temp.y;
						  if(x>0&&grid[x-1][y]=='1'&&!symbol[x-1][y]){
							  stack.add(new position(x-1, y));
							  symbol[x-1][y]=true;
						  }
						  if(x<row-1&&grid[x+1][y]=='1'&&!symbol[x+1][y]){
							  stack.add(new position(x+1, y));
							  symbol[x+1][y]=true;
						  }
						  if(y>0&&grid[x][y-1]=='1'&&!symbol[x][y-1]){
							  stack.add(new position(x, y-1));
							  symbol[x][y-1]=true;
						  }
						  if(y<column-1&&grid[x][y+1]=='1'&&!symbol[x][y+1]){
							  stack.add(new position(x, y+1));
							  symbol[x][y+1]=true;
						  }
					  }
				  }
			  }
		  }
		  return result;
	  
	  }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number_of_Islands test=new Number_of_Islands();
		char [][] ch={{'1','0','1'},{'1','0','1'}};
		System.out.println(test.numIslands(ch));
	}
	class position{
		int x;
		int y;
		public position(int x,int y){
			this.x=x;
			this.y=y;
		}
	}

}
