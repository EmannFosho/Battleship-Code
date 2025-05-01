public class PlayerTester extends ConsoleProgram {
    public void run() {
        Player p = new Player();
        Ship s1 = p.getShips()[0]; // length 2 ship
        p.chooseShipLocation(s1, 1, 1, Ship.VERTICAL); // place at B2 going down
        p.printMyShips();
        p.recordOpponentGuess(1, 1); // guess B2
        p.recordOpponentGuess(5, 5); // guess F6 (miss)
        p.printOpponentGuesses();
    }
}
