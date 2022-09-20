/*
 * The program calculates the amount of logs
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-11-25
*/

import java.util.Scanner;

class Main {
    public static final int LogWeight = 20;
    public static final int TruckCarryLimit = 1100;

    static void Main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("What is the length of the log (0.25, 0.5 or 1): "); 
        float lengthNumber = sc.nextFloat();
        float weight = lengthNumber * LogWeight;

        weight = TruckCarryLimit / weight;
        System.out.println("The amount of logs that can fit in the truck is " + weight);
        System.out.println("\nDone.");
    }
}
