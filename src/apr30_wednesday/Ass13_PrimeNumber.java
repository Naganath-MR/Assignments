package apr30_wednesday;

import java.util.Scanner;

public class Ass13_PrimeNumber {
public static void main(String[] args) {
		        Scanner sn = new Scanner(System.in);

		        while (true) {
		            System.out.println("Enter the no:");
		            int no = sn.nextInt();

		            if (no < 2) {
		                System.out.println("Oh! No --- The given number which is less than 2 is absolutely not a prime");
		                System.out.println("Exit the program.......");
		                break;
		            }

		            boolean isprime = true; // Assumes number is prime initially
		            int prime = no;

		            for (int i = 2; i < prime; i++) { // Loop starts from 2 to one less than the number
		                if (prime % i == 0) {
		                    isprime = false; //Once the given number divisible by 2, Change isprime status to false & end the program
		                    System.out.println(prime + " is not a prime number");
		                    break;
		                }
		            }

		            if (isprime == true) {
		                System.out.println(prime + " is a PRIME NUMBER");
		            }
		        }

		        sn.close();
		    }
		


	}

