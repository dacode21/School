public String getScore() {
    if (active % 2 == 0) {
      return score1 + "-" + score2 + "-" + team1;
    } else {
      return score1 + "-" + score2 + "-" + team2;
    }
  }
}
