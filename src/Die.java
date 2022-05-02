public class Die {
    private final int dieLimit;
    private int numberOfRolls = 0;
    private int lastRoll = 1;

    public Die(int dieLimit) {
        this.dieLimit = dieLimit;
    }

    public int rollDie() {
        int a, b, c;
        a = getDieNextNumber();
        b = getDieNextNumber();
        c = getDieNextNumber();
//        System.out.print("Player rolls - " + a + " + " + b + " + " + c + " ");
        return a + b + c;
    }

    private int getDieNextNumber() {
        numberOfRolls++;
        if(lastRoll > 100) {
            lastRoll = 1;
            return lastRoll++;
        }
        return lastRoll++;
    }

    public int getNumberOfRolls() {
        return numberOfRolls;
    }
}
