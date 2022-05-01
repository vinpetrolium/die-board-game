public class Board {
    private int position;
    private int score;

    public Board(int position, int score) {
        this.position = position;
        this.score = score;
    }

    public void movePositions(int numberOfMoves) {
        if((position + numberOfMoves) > 10) {
            position = (position + numberOfMoves) % 10;
        } else {
            position += numberOfMoves;
        }
    }

    public void calculateScore() {
        score += position;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
