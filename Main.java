/*
 *
 * The program calculates the amount of logs
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-11-25
*/

import java.util.Scanner;

/**
* This is the starting of main program.
*/
public abstract class Main {
    /**
     * Constant Variable Weight.
     */
    static final int LOGWEIGHT = 20;
    /**
     * Constant Variable Weight Limit.
     */
    static final int TRUCKCARRYLIMIT = 1100;

    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the log (0.25, 0.5 or 1): ");
        float lengthNumber = sc.nextFloat();
        float weight = lengthNumber * LOGWEIGHT;

        weight = TRUCKCARRYLIMIT / weight;
        System.out.println("The amount of logs that can fit in the truck is "
         + weight);
        System.out.println("\nDone.");
    }
}
