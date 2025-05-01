import java.util.*;

public class Battleship {
    private Player player1;
    private Player player2;

    public Battleship() {
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
    }

    public void run() {
        // Set up ships for both players
        setupShips(player1);
        setupShips(player2);

        // Start the game loop
        while (true) {
            // Player 1's turn
            System.out.println(player1.getName() + "'s turn!");
            makeGuess(player1, player2);
            printBoard(player1, player2);

            // Player 2's turn
            System.out.println(player2.getName() + "'s turn!");
            makeGuess(player2, player1);
            printBoard(player2, player1);
        }
    }

    private void setupShips(Player player) {
        // Assume player has a method to set up ships, like placing them on the board
        // You could ask the user for coordinates or randomly place ships
        System.out.println(player.getName() + ", set up your ships!");
        player.placeShip(new Ship(5), 3, 4, Ship.HORIZONTAL);
        player.placeShip(new Ship(3), 7, 2, Ship.VERTICAL);
    }

    private void makeGuess(Player currentPlayer, Player opponent) {
        int row, col;

        // Ask for guess
        System.out.print("Enter row (0-9): ");
        row = new Scanner(System.in).nextInt();
        System.out.print("Enter column (0-9): ");
        col = new Scanner(System.in).nextInt();

        // Update opponent's board with the guess
        if (opponent.getBoard().isHit(row, col)) {
            System.out.println("Hit!");
        } else {
            System.out.println("Miss.");
        }
    }

    private void printBoard(Player player1, Player player2) {
        // Print both players' boards
        System.out.println(player1.getName() + "'s Board:");
        player1.printBoard();
        System.out.println(player2.getName() + "'s Board:");
        player2.printBoard();
    }
