package PS003;
public class Bowler {

    private String name;
    private int wickets;
    private int matches;
    private int balls_bowled;
    private int runs_conceded;

    public Bowler() {
        name = "Unknown";
        wickets = 0;
        matches = 0;
        balls_bowled = 0;
        runs_conceded = 0;
    }

    public Bowler(String name, int wickets, int matches, int balls_bowled, int runs_conceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }

    public void computeBowlingAverage() {
        if (wickets > 0) {
            double bowlingAverage = (double) runs_conceded / wickets;
            System.out.println("Bowling Average of " + name + ": " + bowlingAverage);
        } else {
            System.out.println("Bowling Average of " + name + ": 0.0 (No wickets taken)");
        }
    }
    public static void main(String[] args) {
        Bowler bowler1 = new Bowler(); 
        bowler1.computeBowlingAverage(); 
        Bowler bowler2 = new Bowler("James Anderson", 600, 170, 10000, 3500);
        bowler2.computeBowlingAverage(); 
    }
}
