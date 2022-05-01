public class Die {
    private final int dieLimit;
    private int numberOfRolls = 0;
    private int lastRoll = 0;

    public Die(int dieLimit) {
        this.dieLimit = dieLimit;
    }

    public int rollDie() {
        int rollValue = (lastRoll + 1) + (lastRoll + 2) + (lastRoll + 3);
        numberOfRolls++;
        lastRoll += 3;
        if (numberOfRolls != 1 && numberOfRolls % dieLimit == 1) {
            lastRoll = 0;
        }
        return rollValue;
    }

    public int getNumberOfRolls() {
        return numberOfRolls;
    }
}
