public class LocationTester extends ConsoleProgram {
    public void run() {
        // Test 1: Create a location and check its initial state
        Location loc1 = new Location();
        println("=== Location 1: Initial State ===");
        println("toString: " + loc1);
        println("Has ship: " + loc1.hasShip());
        println("Is unguessed: " + loc1.isUnguessed());
        println("Is hit: " + loc1.checkHit());
        println("Is miss: " + loc1.checkMiss());

        // Test 2: Set a ship at this location and mark it as a hit
        loc1.setShip(true);
        loc1.markHit();
        println("\n=== Location 1: After Setting Ship and Marking Hit ===");
        println("toString: " + loc1);
        println("Has ship: " + loc1.hasShip());
        println("Is unguessed: " + loc1.isUnguessed());
        println("Is hit: " + loc1.checkHit());
        println("Is miss: " + loc1.checkMiss());

        // Test 3: Create another location, set a ship, and mark it as a miss
        Location loc2 = new Location();
        loc2.setShip(true);
        loc2.markMiss();
        println("\n=== Location 2: Ship Present but Marked Miss ===");
        println("toString: " + loc2);
        println("Has ship: " + loc2.hasShip());
        println("Is unguessed: " + loc2.isUnguessed());
        println("Is hit: " + loc2.checkHit());
        println("Is miss: " + loc2.checkMiss());

        // Test 4: Set status directly and check it
        Location loc3 = new Location();
        loc3.setStatus(Location.MISSED);
        println("\n=== Location 3: Set Status to Missed Directly ===");
        println("toString: " + loc3);
        println("Status: " + loc3.getStatus());
    }
}
