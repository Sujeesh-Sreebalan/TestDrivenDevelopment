package TestDrivenDevelopment;

import java.util.Scanner;


public class ArrOperation {
	
	/**
	 * 
	 * Main method to demonstrate usage of ArrOperation class
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Computation compute = new Computation();
		int size = 0;
		try {
			while(true) {
				System.out.println("\n1.Calculate Longest Mirror Size.\n2.Calculate Number of Clumps in Array."
						+ "\n3.Solve fixXY problem.\n4.Split Array Problem");
				System.out.print("\nEnter your choice: ");
				int choice = sc.nextInt();
				
				if(choice == 1) {
					System.out.print("\nEnter the size of array: ");
					size = sc.nextInt();
					int maxMirror[] = new int[size];
					
					for (int index = 0; index < size; index++) {
						System.out.print("Enter the number: ");
						maxMirror[index] = sc.nextInt();
					}
					
					System.out.println("Maximum Size: "+compute.calculateLongestMirrorSize(maxMirror));
					
					
				}else if( choice == 2) {
					System.out.print("\nEnter the size of array: ");
					size = sc.nextInt();
					int countClumps[] = new int[size];
					
					for (int index = 0; index < size; index++) {
						System.out.print("Enter the number: ");
						countClumps[index] = sc.nextInt();
					}
					
					System.out.println("Clumps: "+compute.calculateClumps(countClumps));
					
				}else if( choice == 3) {
					System.out.print("\nEnter the size of array: ");
					size = sc.nextInt();
					
					int[] fixXY = new int[size];
					for (int index = 0; index < size; index++) {
						System.out.print("Enter the number: ");
						fixXY[index] = sc.nextInt();
					}
					System.out.print("\nEnter the X value: ");
					int X = sc.nextInt();
					System.out.print("\nEnter the Y value: ");
					int Y = sc.nextInt();
					System.out.print("Updated Array: ");
					int updatedArray[] = compute.fixArray(fixXY, X, Y);
					for(int element: updatedArray) {
						System.out.print(element+" ");
					}
					
				}else if(choice == 4) {
					System.out.print("\nEnter the size of array: ");
					size = sc.nextInt();
					int[] splitArray = new int[size];
					
					for (int index = 0; index < size; index++) {
						System.out.print("Enter the number: ");
						splitArray[index] = sc.nextInt();
					}
					
					System.out.println("Equilibrium index: "+compute.calculateSum(splitArray));
					
				}else {
					break;
				}
			}
		}catch(AssertionError e) {
			System.err.println("Enter Valid Size");
		}catch(Exception e) {
			System.out.println("Error Occur "+e.getMessage());
		}
		
		sc.close();
	}
	

}
