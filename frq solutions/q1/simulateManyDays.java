  public int simulateManyDays(int numBirds, int numDays){
    int count = 0;
    while (currentFood > 0 && numDays > 0){
      count++;
      simulateOneDay(numBirds);
      numDays--;
    }
    return count;
  }
}
