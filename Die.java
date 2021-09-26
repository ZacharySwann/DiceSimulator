/* Zachary Swann, CS 321-02, 09/25/2021
    This program creates a Die and the methods to roll it, assign its current color,
    and convert the enumerated color to a string.
*/

import java.lang.Math;

public class Die {
    /** The class Die creates a Die with 6 sides and methods to roll the Die and determine its randomly assigned color.
      * The class Die also can change the enumerated dieColor type to a string. 
      */
    //Methods
    /** Default constructor, sets the default color of the die to RED. 
      */
    public Die() {
        diceColor = DieColor.RED;
    }

     /** A class that rolls the dice using Math.random and changes color of dice based on result.
       * A random float number is generated and multiplied by six, then added to one. 
       * This operation creates a random number between 1 and 6. The class then determines which color
       * the Die is by assigning the color based on the number rolled.
       */
    public void roll() {
        //A number betweeon 1 and 6 is generated using Math.random.
        int randomNumber = (int)(Math.random() * 6) + 1;
        //A series of if and else statements that determine the color of the Die based on the number rolled
        if (randomNumber == 1) {
            diceColor = DieColor.RED;
        } else if (randomNumber == 2 || randomNumber == 3) {
            diceColor = DieColor.YELLOW;
        } else {
            diceColor = DieColor.GREEN;
        }
    }

    /** A Method Class that returns current color of the die by returning the diceColor determined by the roll
     * @return diceColor the current enumerated type of the die being rolled.
     */
    public DieColor currentColor()
    {
        return diceColor;
    }

    /** A method Class that changes the enumerated type DieColor to a string using if and else statements 
     * @param diceColor the color of the Die being rolled, as determined by the Method roll and the enumerated type DieColor.
     * @return colorString the string version of the enumerated type DieColor.
     */
    public static String toString(DieColor diceColor) {
        // Creates a string to convert the numerated type into and then return
        String colorString = "";
        // A series of if and else statements that check the enumerated type and set the String to whatever the enumerated type is.
        if (diceColor == DieColor.RED) {
            colorString = "RED";
        } else if (diceColor == DieColor.YELLOW) {
            colorString = "YELLOW";
        } else if (diceColor == DieColor.GREEN) {
            colorString = "GREEN";
        }
        return colorString;
    }

    //Fields
    private enum DieColor{RED, YELLOW, GREEN}; 

    private DieColor diceColor;
}