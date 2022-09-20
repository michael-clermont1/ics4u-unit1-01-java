/*
 * The program calculates the amount of logs
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-11-25
*/

import java.util.Scanner;

final class Main {
    public static final int LOGWEIGHT = 20;
    public static final int TRUCKCARRYLIMIT = 1100;

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
