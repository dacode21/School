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
