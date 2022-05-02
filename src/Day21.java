public class Day21 {
    /**
     *
     * Because of time constraints, I wanted to make this better
     * By adding the players onto the board, and then add number of players on the board instead of creating player objects individually
     * in the main function
     *
     */

    public static void main(String[] args) {
        int rolledValue = 0;
        Player p1 = new Player("Player1", new Board(8, 0));
        Player p2 = new Player("Player2", new Board(7, 0));
        Die die = new Die(100);

        while(true) {
            rolledValue = die.rollDie();
            p1.getBoard().movePositions(rolledValue);
            p1.calculatePlayerScore();

            if(p1.getBoard().getScore() >= 1000) {
                break;
            }

            rolledValue = die.rollDie();
            p2.getBoard().movePositions(rolledValue);
            p2.calculatePlayerScore();
        }

        p2.displayStats(die.getNumberOfRolls());
    }
}
