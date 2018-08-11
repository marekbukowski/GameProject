package FrameSettings;

import FrameSettings.Enum.Type;

public class Obstruction extends Cell {

    @Override
    public boolean Block() {
        return true;
    }
    public Obstruction() {super(Type.WALL);}
}
