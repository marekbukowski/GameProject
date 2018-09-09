package FrameSettings;

import FrameSettings.Enum.Type;

/**
 * Creates cell
 */
public abstract class Cell {

    protected Type type;

    public Cell(Type type) {
        this.type = type;
    }

    public char getValue() {
        return type.getValue();
    }

    /**
     * Method used to check if block appears
     *
     * @return true if exists false otherwise
     */
    public abstract boolean Block();

}
