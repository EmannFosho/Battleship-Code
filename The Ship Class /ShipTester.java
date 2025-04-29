public class ShipTester extends ConsoleProgram {
    public void run() {
        // Create a ship of length 3
        Ship ship1 = new Ship(3);
        System.out.println("Testing Ship 1 (length 3)");

        // Test initial state
        System.out.println("Initial state: " + ship1);
        System.out.println("Is location set? " + ship1.isLocationSet()); // Expected: false
        System.out.println("Is direction set? " + ship1.isDirectionSet()); // Expected: false

        // Set location to (2,3)
        ship1.setLocation(2, 3);
        System.out.println("After setting location: " + ship1);
        System.out.println("Is location set? " + ship1.isLocationSet()); // Expected: true

        // Set direction to horizontal
        ship1.setDirection(Ship.HORIZONTAL);
        System.out.println("After setting direction: " + ship1);
        System.out.println("Is direction set? " + ship1.isDirectionSet()); // Expected: true

        // Test getters
        System.out.println("Row: " + ship1.getRow()); // Expected: 2
        System.out.println("Col: " + ship1.getCol()); // Expected: 3
        System.out.println("Length: " + ship1.getLength()); // Expected: 3
        System.out.println("Direction: " + ship1.getDirection()); // Expected: 0 (HORIZONTAL)

        System.out.println("\n---------------------------------\n");

        // Create another ship of length 4
        Ship ship2 = new Ship(4);
        System.out.println("Testing Ship 2 (length 4)");

        // Set location to (5,1) and direction to vertical
        ship2.setLocation(5, 1);
        ship2.setDirection(Ship.VERTICAL);
        System.out.println("After setting location and direction: " + ship2);

        // Test getters
        System.out.println("Row: " + ship2.getRow()); // Expected: 5
        System.out.println("Col: " + ship2.getCol()); // Expected: 1
        System.out.println("Length: " + ship2.getLength()); // Expected: 4
        System.out.println("Direction: " + ship2.getDirection()); // Expected: 1 (VERTICAL)
    }
}
