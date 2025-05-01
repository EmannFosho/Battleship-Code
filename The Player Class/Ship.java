public class Ship
{
       private int row;
       private int col;
       private int length;
       private String direction;
      
       public static final int UNSET = -1;
       public static final int HORIZONTAL = 0;
       public static final int VERTICAL = 1;
      
       public Ship(int l){
           length = l;
           row = UNSET;
           col = UNSET;
       }
       public void setLocation(int r, int c){
           row = r;
           col = c;
       }
      
       public void setDirection(int d){
          if(d == HORIZONTAL){
              direction = "horizontal";
          }
           if(d == VERTICAL){
              direction = "vertical";
          } if (d == UNSET){
              direction = "unset";
          }
          
       }
       public int getRow(){
           return row;
       }
       public int getCol(){
           return col;
       }
       public int getLength(){
           return length;
       }
       public int getDirection(){
           if (direction == "horizontal"){
               return HORIZONTAL;
           }
           if(direction == "vertical"){
               return VERTICAL;
           }
           return UNSET;
       }
      
    private String directionToString(){
         if(direction == null){
             return "unset direction";
         }
         return direction;
      }
      
       private String locationToString(){
           if(this.isLocationSet() == false){
           return "unset location";
           }
           return  row + ", " + col;
       }
       public String toString(){
           return directionToString() + " ship of length " + length + " at " + "(" + locationToString() + ")";
       }
      
      
       public boolean isLocationSet(){
           if (row == -1 || col == -1){
               return false;
           }
           return true;
       }
       public boolean isDirectionSet(){
           if (direction == null){
               return false;
           }
           return true;
       }

}
// public class Ship
// {
//     // Direction constants
//     private static final int UNSET = -1;
//     private static final int HORIZONTAL = 0;
//     private static final int VERTICAL = 1;

//     private static final String[] directions = {"unset direction", "horizontal", "vertical"};

//     // Instance variables
//     private int row;
//     private int col;
//     private int length;
//     private int direction;

//     // Constructor. Create a ship and set the length.
//     public Ship(int length)
//     {
//         this.length = length;
//         this.direction = UNSET;
//         this.row = UNSET;
//         this.col = UNSET;
//     }

//     // Has the location been initialized
//     public boolean isLocationSet()
//     {
//         return row != UNSET && col != UNSET;
//     }

//     // Has the direction been initialized
//     public boolean isDirectionSet()
//     {
//         return direction != UNSET;
//     }

//     // Set the location of the ship
//     public void setLocation(int row, int col)
//     {
//         this.row = row;
//         this.col = col;
//     }

//     // Set the direction of the ship
//     public void setDirection(int direction)
//     {
//         this.direction = direction;
//     }

//     // Getter for the row value
//     public int getRow()
//     {
//         return row;
//     }

//     // Getter for the column value
//     public int getCol()
//     {
//         return col;
//     }

//     // Getter for the length of the ship
//     public int getLength()
//     {
//         return length;
//     }

//     // Getter for the direction
//     public int getDirection()
//     {
//         return direction;
//     }

//     // Helper method to get a string value from the direction
//     private String directionToString()
//     {
//         return directions[direction + 1];
//     }

//     // Helper method to get a (row, col) string value from the location
//     private String locationToString()
//     {
//         if(isLocationSet())
//         {
//             return "(" + row + ", " + col + ")";
//         }
//         else
//         {
//             return "(unset location)";
//         }
//     }

//     // toString value for this Ship
//     public String toString()
//     {
//         return directionToString() + " ship of length " + length + " at " + locationToString();
//     }
// }
