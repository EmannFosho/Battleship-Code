import java.util.*;

public class Player {
    private String name;
    private Grid board;

    public Player(String name) {
        this.name = name;
        this.board = new Grid();
    }

    public String getName() {
        return name;
    }

    public Grid getBoard() {
        return board;
    }

    public void placeShip(Ship ship, int row, int col, int direction) {
        ship.setLocation(row, col);
        ship.setDirection(direction);
        board.placeShip(ship);
    }

    public void printBoard() {
        board.printBoard();
    }
}
