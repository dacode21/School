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
