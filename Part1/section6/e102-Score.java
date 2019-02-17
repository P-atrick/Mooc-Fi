import java.util.ArrayList;

public class Score {
  private ArrayList<Integer> scores;
  private int gradeCount [];
  private int accept;

  public Score() {
    scores = new ArrayList<Integer>();
    gradeCount = new int[6];
  }

  public ArrayList getScores() {
    return scores;
  }

  public int[] getGradeCount() {
    return gradeCount;
  }

  public void addScore(int number) {
    if (number != -1 && number >= 0) {
      scores.add(number);
    }
  }

  public void assignGrades() {
    for (int number : scores) {
      if (number < 30) {
        gradeCount[0]++;
      } else if (number < 35) {
        gradeCount[1]++;
        accept++;
      } else if (number < 40) {
        gradeCount[2]++;
        accept++;
      } else if (number < 45) {
        gradeCount[3]++;
        accept++;
      } else if (number < 50) {
        gradeCount[4]++;
        accept++;
      } else if (number <= 60) {
        gradeCount[5]++;
        accept++;
      }
    }
  }

  public void printStar(int number) {
    for (int i = 0; i < number; i++) {
      System.out.print("*");
    }
  }

  public void printGrades() {
    System.out.println("Grade distribution:");
    for (int i = gradeCount.length - 1; i >= 0; i--) {
      System.out.print(i + ": ");
      printStar(gradeCount[i]);
      System.out.println();
    }
  }

  public double acceptancePercentage() {
    if (scores.size() > 0) {
      return 100 * accept / scores.size();
    }
    return 0;
  }
}
