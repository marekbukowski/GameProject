package FrameSettings;

import FrameSettings.Enum.Type;

public abstract class Cell {

    protected Type type;

    public Cell(Type type) {
        this.type = type;
    }

    public char getValue() {return type.getValue();}
    public abstract boolean Block();

}
