public class MethodChallenge {
    public static void main(String[] args) {
        String player = "Tim";

        displayHighScorePosition(player,calHighScorePos(1500));
        displayHighScorePosition(player,calHighScorePos(1000));
        displayHighScorePosition(player,calHighScorePos(500));
        displayHighScorePosition(player,calHighScorePos(100));
        displayHighScorePosition(player,calHighScorePos(25));
    }

    public static void displayHighScorePosition(String player,int currentPos){
        System.out.println(player + " managed to get into position " + currentPos + " on the high score list");
    }

    public static int calHighScorePos(int currentScore) {
        int position = 4;

        if (currentScore >= 1000) position = 1;
        if (currentScore >= 500) position = 2;
        if (currentScore >= 100) position = 3;

        return position;
    }
}
