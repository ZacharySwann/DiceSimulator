/* Zachary Swann, CS 321-02, 09/25/2021
    This program tests the Die by creating 10 Die, rolling each one, and counting how many
    yellows, greens, or reds are rolled. 
*/

public class DieTester {
    /** The class DieTester creates 10 die and rolls them all while counting how many of each color are rolled 
     * The class uses nested for loops to create 10 die, roll each 4 times, and then count how many of each 
     * color are rolled after rolling them 10 times. The class also creates new int variables to store the counters.
     * @param args Takes input from the command line.
     */
    public static void main(String[] args) 
    {
        // Creates the int counters to be used to count how many of each color are rolled
        int redCounter = 0;
        int yellowCounter = 0;
        int greenCounter = 0;
        // A dieArray named Die is created with 10 positions
        Die[] dieArray = new Die[10];
        //A loop to populate the array with new Die.
        for (int i = 0; i <= 9; i++) {
            dieArray[i] = new Die();
        }
        // A nested for loop to loop through it four times.
        for (int k = 0; k <= 3; k++) {
            //A for loop to roll each die once and print their current color.
            for (int i = 0; i <= 9; i++) {
                dieArray[i].roll();
                dieArray[i].currentColor();
                System.out.println(dieArray[i].currentColor());
            }
            // A for loop to change the counter based on what each currentColor is.
            for (int i = 0; i <= 9; i++) {
                if (dieArray[i].toString(dieArray[i].currentColor()) == "RED") {
                    redCounter++;
                } else if (dieArray[i].toString(dieArray[i].currentColor()) == "YELLOW") {
                    yellowCounter++;
                } else if (dieArray[i].toString(dieArray[i].currentColor()) == "GREEN") {
                    greenCounter++;
            }
        }
     }
        //Print out the count for each color.
        System.out.println(redCounter);
        System.out.println(yellowCounter);
        System.out.println(greenCounter);
    }
}
