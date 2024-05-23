public class Scoreboard {
  private String team1;
  private String team2;
  private int score1;
  private int score2;
  private int active;
  public Scoreboard(String t1, String t2) {
    team1 = t1;
    team2 = t2;
    score1 = 0;
    score2 = 0;
    active = 2;
  }
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
  public String getScore() {
    if (active % 2 == 0) {
      return score1 + "-" + score2 + "-" + team1;
    } else {
      return score1 + "-" + score2 + "-" + team2;
    }
  }
}
