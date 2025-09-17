/*
 * Write a Java program (or method) that does the following:
 *
 * 1. Prompts the user to enter a positive integer n.
 *
 * 2. Then, n times, reads in three numbers 
 *    (they may be integers or real numbers).
 *
 * 3. For each set of three numbers, computes their sum, product, and average.
 *
 * 4. Prints out the results (one line per set).
 *
 * 5. After processing all n sets, the program ends.
 */

import java.util.Scanner;

public class SumProductAverage
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // signature
        System.out.println("Shuler Wiegerink\nAPCS-A\n2.2-2.3 program");
        // prompt user for the number of runs
        System.out.println("\n\nHow many timed would you like the program to run:  ");
        int numRuns = sc.nextInt();

        for (int i = 0; i < numRuns; i++) {
            double num1, num2, num3, sum;

            // prompt user for the inputs
            System.out.println("\nPlease enter 3 numbers");
            num1 = sc.nextDouble();
            num2 = sc.nextDouble();
            num3 = sc.nextDouble();

            // output the sum
            System.out.println("\nThe sum of these numbers is " + (num1 + num2 + num3));

            // output the product
            System.out.println("The product of these numbers is " + (num1 * num2 * num3));

            // output the average
            System.out.println("The average of these numbers is " + ((num1 + num2 + num3) / 3) + "\n\n");
        }
    }
}


