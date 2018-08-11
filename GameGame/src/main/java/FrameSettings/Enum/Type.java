package FrameSettings.Enum;

public enum Type {

    EMPTY(' '),
    WALL('#'),
    PLAYER('R');

    private char value;

    public char getValue() {
        return value;
    }

    Type(char value) {this.value = value;}

    public static Type TakeType(char value){
        for (Type type : Type.values()){
            if (type.value==value){
                return type;
            }
        }
        return null;
    }
}
