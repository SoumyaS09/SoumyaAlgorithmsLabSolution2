package com.target.achieved;

import java.util.Scanner;

public class Targetachieved {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array: ");
		int arraySize = sc.nextInt();
		int[] array = new int[arraySize];

		System.out.println("Enter the value of target  ");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the total no of targets that needs to be achieved ");
		int targetvalue = sc.nextInt();
			
	while(targetvalue !=0) {
		int flag =0;
		int sum = 0;
		
		System.out.println("Enter the value of target ");
		int value= sc.nextInt();
		for (int i = 0; i < arraySize; i++) {
			sum =  sum + array[i];
		if (sum>= value) {
		System.out.println("Target is achieved after " + (i+1) + "transactions");
		flag = 1;
		break;
		}
		}
		if (flag==0) {
			System.out.println("Given target is not achieved");
			sc.close();
		}
	}
	
}
}

