import java.util.Scanner;

public class Battleship extends ConsoleProgram {
    private Player player1;
    private Player player2;

    public void run() {
        player1 = new Player("Player 1");
        player2 = new Player("Computer");

        // Setup ships for both players
        setupPlayerShips(player1);
        setupComputerShips(player2);

        // Game loop
        while (!isGameOver()) {
            // Player 1's turn
            System.out.println(player1.getName() + "'s turn!");
            makeGuess(player1, player2);
            printBoards();

            // Check if Player 1 won
            if (player2.getBoard().allShipsSunk()) {
                System.out.println(player1.getName() + " wins!");
                break;
            }

            // Computer's turn
            System.out.println(player2.getName() + "'s turn!");
            makeGuess(player2, player1);
            printBoards();

            // Check if Player 2 won
            if (player1.getBoard().allShipsSunk()) {
                System.out.println(player2.getName() + " wins!");
                break;
            }
        }
    }

    private void setupPlayerShips(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(player.getName() + ", place your ships!");
        // Let the player place ships (Manually input row, col, and direction)
        for (int i = 0; i < 3; i++) { // Example: player places 3 ships
            System.out.print("Enter row for ship " + (i+1) + ": ");
            int row = scanner.nextInt();
            System.out.print("Enter column for ship " + (i+1) + ": ");
            int col = scanner.nextInt();
            System.out.print("Enter direction for ship " + (i+1) + " (0 for horizontal, 1 for vertical): ");
            int direction = scanner.nextInt();
            player.placeShip(new Ship(3), row, col, direction); // Example: ship size = 3
        }
    }

    private void setupComputerShips(Player player) {
        // The computer places ships randomly
        for (int i = 0; i < 3; i++) { // Example: computer places 3 ships
            int row = Randomizer.nextInt(10);
            int col = Randomizer.nextInt(10);
            int direction = Randomizer.nextInt(2); // 0 = horizontal, 1 = vertical
            player.placeShip(new Ship(3), row, col, direction); // Example: ship size = 3
        }
    }

    private void makeGuess(Player currentPlayer, Player opponent) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        if (currentPlayer.getName().equals("Computer")) {
            row = Randomizer.nextInt(10);
            col = Randomizer.nextInt(10);
        } else {
            System.out.print("Enter row to guess: ");
            row = scanner.nextInt();
            System.out.print("Enter column to guess: ");
            col = scanner.nextInt();
        }

        // Handle guess
        if (opponent.getBoard().isHit(row, col)) {
            System.out.println("Hit!");
        } else {
            System.out.println("Miss.");
        }
    }

    private void printBoards() {
        player1.printBoard();
        player2.printBoard();
    }

    private boolean isGameOver() {
        return player1.getBoard().allShipsSunk() || player2.getBoard().allShipsSunk();
    }
}
