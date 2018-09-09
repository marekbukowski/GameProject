package FrameSettings;

import FrameSettings.Enum.Type;

/**
 * Obstruction extdends class Cell and is used to create a block in a board
 */
public class Obstruction extends Cell {

    @Override
    public boolean Block() {
        return true;
    }

    public Obstruction() {
        super(Type.WALL);
    }
}
