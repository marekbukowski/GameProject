package FrameSettings.Enum;

/**
 * Shows which kind of chars are on board
 */
public enum Type {

    EMPTY(' '),
    WALL('#'),
    PLAYER('R');

    private char value;

    public char getValue() {
        return value;
    }

    Type(char value) {
        this.value = value;
    }

    /**
     * Method is used to know if on board is empty space to move player, wall or our player
     *
     * @param value value of type on board
     * @return type
     */
    public static Type TakeType(char value) {
        for (Type type : Type.values()) {
            if (type.value == value) {
                return type;
            }
        }
        return null;
    }
}
