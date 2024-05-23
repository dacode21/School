  public void recordPlay(int points) {
    if (points == 0) {
      active++;
    } else {
      if (active % 2 == 0) {
        score1 += points;
      } else {
        score2 += points;
      }
    }
  }
