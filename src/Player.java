public class Player {
    private String name;
    private Board board;

    public Player(String playerName, Board board) {
        this.name = playerName;
        this.board = board;
    }

    public void calculatePlayerScore() {
        board.calculateScore();
    }

    public void displayStats(int dieRoll) {
        System.out.println(
                this.name +
                " has " + board.getScore() +
                " points and the die has been rolled a total of " + dieRoll +
                " times; " + board.getScore() + " * " + dieRoll + " = " + board.getScore() * dieRoll
        );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
