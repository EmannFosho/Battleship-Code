public class Location {
    public static final int UNGUESSED = 0;
    public static final int HIT = 1;
    public static final int MISSED = 2;

    private boolean hasShip;
    private int status;

    // Constructor initializes the location as unguessed and without a ship
    public Location() {
        this.hasShip = false;
        this.status = UNGUESSED;
    }

    // Was this location a hit?
    public boolean checkHit() {
        return status == HIT;
    }

    // Was this location a miss?
    public boolean checkMiss() {
        return status == MISSED;
    }

    // Was this location unguessed?
    public boolean isUnguessed() {
        return status == UNGUESSED;
    }

    // Mark this location as a hit
    public void markHit() {
        this.status = HIT;
    }

    // Mark this location as a miss
    public void markMiss() {
        this.status = MISSED;
    }

    // Return whether this location has a ship
    public boolean hasShip() {
        return hasShip;
    }

    // Set whether this location has a ship
    public void setShip(boolean val) {
        this.hasShip = val;
    }

    // Set the status of this location
    public void setStatus(int status) {
        if (status == UNGUESSED || status == HIT || status == MISSED) {
            this.status = status;
        }
    }

    // Get the status of this location
    public int getStatus() {
        return status;
    }

    // toString for debugging
    public String toString() {
        String shipStatus = hasShip ? "Ship Present" : "No Ship";
        String statusString;
        if (status == UNGUESSED) {
            statusString = "Unguessed";
        } else if (status == HIT) {
            statusString = "Hit";
        } else {
            statusString = "Missed";
        }
        return "[" + statusString + ", " + shipStatus + "]";
    }
}
