public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  
  public Location getNextLoc(int row, int col) {
    
    if(row == grid.length-1){
      return new Location(row,col+1);
    }
    else if(col == grid[row].length-1){
      return new Location(row+1,col);
    }
    else{
      int min = grid[row+1][col];
        if(min >= grid[row][col+1]){
            return new Location(row, col+1);
          }
        return new Location(row+1, col);
      }
  } 
  public int sumPath(int row, int col) {
    int sum = grid[row][col];  
      
    while(row != grid.length-1 || col != grid[row].length-1){
       Location nextLoc  = getNextLoc(row, col);
        row = nextLoc.getRow();
        col = nextLoc.getCol();
        sum += grid[row][col];
      }
    
    return sum;
    }
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}

