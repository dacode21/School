public class Feeder {
  private int currentFood;
  private int numBirds;
  private int numDays;
public Feeder(int food, int birds, int days){
  currentFood = food;
  numBirds = birds;
  numDays = days;
}

  public void simulateOneDay(int numBirds){
    double chances = (int) Math.round((Math.random()*100));
    if (chances > 5){
      int birdsConsuming = (int) (Math.random()*41 +10);
      int eatenFood = birdsConsuming * numBirds;
      currentFood = currentFood-eatenFood;
      if (currentFood < 0){
        currentFood =0;
      }
    } else {
      currentFood = 0;
    }

  }
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
