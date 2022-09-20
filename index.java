/**
 * The program calculates the amount of logs
 *
 * By:      Michael Clermontl
 * Version: 1.0
 * Since:   2022-11-25
 */

import java.util;

public class Index {
public static final int LogWeight = 20;
public static final int TruckCarryLimit = 1100;

Scanner sc = new Scanner(System.in);
System.out.print("What is the length of the log (0.25, 0.5 or 1): "); 
float lengthNumber = sc.nextFloat();
float weight = lengthNumber * LogWeight;

weight = TruckCarryLimit / weight;
System.out.println("The amount of logs that can fit in the truck is " + weight);
System.out.println("\nDone.");
}
