package com.greatlearning.dslabsession;
import java.util.Scanner;

public class Transaction {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {		
		
		// Ask the user to enter the size of the transaction array
		
		System.out.println("Enter the size of transaction array");
		int sizeOfArray = sc.nextInt();
		
		
		//Initialize array based on the size
		
		int[] transactionArray = new int[sizeOfArray];
		
		// Ask the user to enter the value of the array
		
		System.out.println("Enter the values of array");
		for (int i=0;i<sizeOfArray; i++)
		{
			transactionArray[i] = sc.nextInt();
		}				
		
		//Ask the user to enter the number of targets that needs to be achieved
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTargets = sc.nextInt();
		
						
		//Loop over the transaction array and check if the target can be achieved
		//If target cannot be achieved display proper message
		
		while(numberOfTargets!=0)
		{
			System.out.println("Enter the value of target");
			int valueOfTarget = sc.nextInt();
		
			CheckIfTargetIsAchievable(valueOfTarget,transactionArray );
			numberOfTargets --;
		}
		
	}
	private static void CheckIfTargetIsAchievable(int valueOfTarget, int[] transactionArray) {
		// TODO Auto-generated method stub
		
		int sum =0;
		for(int i = 1; i<transactionArray.length; i++)
		{
			sum += transactionArray[i-1];
			if(sum >= valueOfTarget)
			{				
				System.out.println("Target achieved after "+ i +" transactions");
				return;
			}
		}
		
		if (sum <valueOfTarget)
		{
			System.out.println(" Given target is not achieved");
		}
	}

}
