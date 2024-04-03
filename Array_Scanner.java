package Automation_MKT;

import java.util.Scanner;

public class Array_Scanner {

	public static void main(String[] args) {

		// get sum of array 


		int arr[] = new int[5];
		int sum = 0;

		for(int i=0; i>arr.length ; i++)
		{
			System.out.println();
			Scanner s1 =  new Scanner(System.in);
			int input = s1.nextInt();

			arr[i] = input;
			//sum = sum +arr[i];
System.out.println(input);
			//System.out.println("Array Is" + stringtochar);
		}

	}

}
