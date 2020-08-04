public class TennisGame2 {
    private int player1Point;
    private int player2Point;

    private final String player1Name;
    private final String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String[] textScores = {"Love", "Fifteen", "Thirty", "Forty"};

        // Winner
        if (player1Point >= 4 && player2Point >= 0 && (player1Point - player2Point) >= 2) {
            return "Win for " + player1Name;
        }
        if (player2Point >= 4 && player1Point >= 0 && (player2Point - player1Point) >= 2) {
            return "Win for " + player2Name;
        }

        // Advantage
        if (player1Point > player2Point && player2Point >= 3) {
            return "Advantage " + player1Name;
        }
        if (player2Point > player1Point && player1Point >= 3) {
            return "Advantage " + player2Name;
        }

        // Deuce
        boolean isDeuce = player1Point == player2Point && player1Point >= 3;
        if (isDeuce) {
            return "Deuce";
        }

        // เสมอกัน
        boolean คะแนนเท่ากันแต่ยังไม่ถึงขั้นdeuce = player1Point == player2Point && player1Point < 3;
        if (คะแนนเท่ากันแต่ยังไม่ถึงขั้นdeuce) {
            return textScores[player1Point] + "-All";
        }

        // Normal cases
        return textScores[player1Point] + "-" + textScores[player2Point];
    }

    public void p1Score() {
        player1Point++;
    }

    public void p2Score() {
        player2Point++;
    }

    public void wonPoint(String player) {
//        if (player.equals("player1")) // 1 => NullPointerException (NPE)
        if ("player1".equals(player)) { // 2 => Null Safety
            p1Score();
        } else {
            p2Score();
        }
    }
}