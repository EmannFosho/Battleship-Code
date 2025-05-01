public class Ship {
    private int row;
    private int col;
    private int length;
    private int direction;

    public static final int UNSET = -1;
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    public Ship(int length) {
        this.length = length;
        row = UNSET;
        col = UNSET;
        direction = UNSET;
    }

    public void setLocation(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getLength() {
        return length;
    }

    public int getDirection() {
        return direction;
    }
}
