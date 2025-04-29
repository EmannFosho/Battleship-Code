public class GridTester extends ConsoleProgram {
    public void run() {
        Grid myGrid = new Grid();

        myGrid.setShip(1, 1, true);
        myGrid.setShip(2, 1, true);
        myGrid.setShip(4, 0, true);
        myGrid.setShip(4, 1, true);
        myGrid.setShip(4, 2, true);

        myGrid.markMiss(2, 3);
        myGrid.markMiss(3, 1);
        myGrid.markHit(4, 1);
        myGrid.markHit(5, 1);
        myGrid.markHit(6, 1);
        myGrid.markMiss(7, 1);

        System.out.println("=== Grid Status ===");
        myGrid.printStatus();

        System.out.println("\n=== Ship Locations ===");
        myGrid.printShips();
    }
}
