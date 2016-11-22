/**
 * Created by adventure on 16/11/22.
 */
public class Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        if(grid==null){
            return 0;
        }
        int row=grid.length;
        int column=grid[0].length;
        int result=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(grid[i][j]==1){
                    result+=getPerimeter(grid,i,j);
                }
            }
        }
        return result;
    }
    private int getPerimeter(int[][] grid,int i,int j){
        int result=0;
        result+=i-1>=0?1-grid[i-1][j]:1;
        result+=j-1>=0?1-grid[i][j-1]:1;
        result+=i+1<grid.length?1-grid[i+1][j]:1;
        result+=j+1<grid[0].length?1-grid[i][j+1]:1;
        return  result;
    }
}
