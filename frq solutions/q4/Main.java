public Location getNameLoc(int row int col){
  int rowBelow = row + 1;
  int colRight = col + 1;
  if(rowBelow < grid.length && colRight < grid[0].length){
    if(grid[rowBelow][col] < grid[row][colRight]){
      return new Location(rowBelow, col);
    }
    else{
      return newLocation(row, colright);
    }
    else if(rowBlelow < grid.length){
    return new Location(rowBelow, col);
  }
  else{
    return new Location(row,col);
  }
}
public int sumPath(int row, int col){
  int sum = grind[row][col];
  while(row != grid.length -1 && col != grid[0].length-1){
    Location nextGrid = getNextLoc(row,col);
    row = nextGrid.getRow();
    col = nextGrid.getCol();
    sum += grid[row][col];
  }
  return sum;
}

