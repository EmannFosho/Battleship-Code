import java.util.*;

public class Player {
    private static final int[] SHIP_LENGTHS = {2, 3, 3, 4, 5};
    private Ship[] ships;
    private Grid myGrid;
    private Grid opponentGrid;

    // Constructor
    public Player() {
        ships = new Ship[SHIP_LENGTHS.length];
        for (int i = 0; i < SHIP_LENGTHS.length; i++) {
            ships[i] = new Ship(SHIP_LENGTHS[i]);
        }
        myGrid = new Grid();
        opponentGrid = new Grid();
    }

    // Manually choose ship location for testing
    public void chooseShipLocation(Ship s, int row, int col, int direction) {
        s.setLocation(row, col);
        s.setDirection(direction);
        myGrid.addShip(s);
    }

    // Print player's ships
    public void printMyShips() {
        System.out.println("My Ships:");
        myGrid.printShips();
    }

    // Print where opponent has guessed on our grid
    public void printOpponentGuesses() {
        System.out.println("Opponent Guesses (hits and misses on my ships):");
        myGrid.printStatus();
    }

    // Print where this player has guessed on the opponent's grid
    public void printMyGuesses() {
        System.out.println("My Guesses (hits and misses on opponent):");
        opponentGrid.printStatus();
    }

    // Record a guess from the opponent and return if it was a hit
    public boolean recordOpponentGuess(int row, int col) {
        if (myGrid.hasShip(row, col)) {
            myGrid.markHit(row, col);
            return true;
        } else {
            myGrid.markMiss(row, col);
            return false;
        }
    }

    // Optional: record a guess this player makes on opponent grid
    public void recordMyGuess(int row, int col, boolean wasHit) {
        if (wasHit) {
            opponentGrid.markHit(row, col);
        } else {
            opponentGrid.markMiss(row, col);
        }
    }

    // Optional getters
    public Grid getMyGrid() {
        return myGrid;
    }

    public Grid getOpponentGrid() {
        return opponentGrid;
    }

    public Ship[] getShips() {
        return ships;
    }
}
