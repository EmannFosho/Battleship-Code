public class Grid {
    private char[][] grid;
    private final int SIZE = 10;

    public Grid() {
        grid = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                grid[i][j] = '~'; // Water symbol
            }
        }
    }

    public void placeShip(Ship ship) {
        int row = ship.getRow();
        int col = ship.getCol();
        int length = ship.getLength();
        int direction = ship.getDirection();

        for (int i = 0; i < length; i++) {
            if (direction == Ship.HORIZONTAL) {
                grid[row][col + i] = 'S'; // S for ship
            } else if (direction == Ship.VERTICAL) {
                grid[row + i][col] = 'S'; // S for ship
            }
        }
    }

    public boolean isHit(int row, int col) {
        if (grid[row][col] == 'S') {
            grid[row][col] = 'X'; // X for hit
            return true;
        }
        grid[row][col] = 'O'; // O for miss
        return false;
    }

    public boolean allShipsSunk() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (grid[i][j] == 'S') {
                    return false; // If there's still a ship
                }
            }
        }
        return true; // All ships are sunk
    }

    public void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
