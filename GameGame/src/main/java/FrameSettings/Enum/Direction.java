package FrameSettings.Enum;

public enum Direction {


    UP('W'),
    DOWN('S'),
    LEFT('A'),
    RIGHT('D');

    private char value;

    public char getValue() {return value; }

    Direction(char value) {
        this.value = value;
    }

    public static Direction GoInDirection(char value){
        for (Direction direction : Direction.values()){
            if (direction.value==value){
                return direction;
            }
        }
        return null;
    }
}
