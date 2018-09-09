package FrameSettings.Enum;

/**
 * Shows what to choose on keyboard to move on playboard
 */
public enum Direction {


    UP('W'),
    DOWN('S'),
    LEFT('A'),
    RIGHT('D');

    private char value;

    public char getValue() {
        return value;
    }

    Direction(char value) {
        this.value = value;
    }

    /**
     * Method is used to know if char is selected
     *
     * @param value the value of choosen char
     * @return if char is picked up returns choosen direction
     */
    public static Direction GoInDirection(char value) {
        for (Direction direction : Direction.values()) {
            if (direction.value == value) {
                return direction;
            }
        }
        return null;
    }
}
