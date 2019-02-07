import java.util.ArrayList;

public class Team {
  private String name;
  private ArrayList<Player> players = new ArrayList<Player>();
  private int maxPlayers;

  public Team(String name) {
    this.name = name;
    this.maxPlayers = 16;
  }

  public String getName() {
    return name;
  }

  public void addPlayer(Player player) {
    if (players.size() < maxPlayers) {
      players.add(player);
    }
  }

  public void printPlayers() {
    for(Player player : players) {
      System.out.println(player);
    }
  }

  public void setMaxSize(int maxSize) {
    maxPlayers = maxSize;
  }

  public int size() {
    return players.size();
  }

  public int goals() {
    int totalGoals = 0;
    for (Player player : players) {
      totalGoals += player.goals();
    }
    return totalGoals;
  }
}
