package com.greatlearning.driver;
import com.greatlearning.service.MergeSortImplementation;
import com.greatlearning.service.NotesCount;
import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Initialize the objects
		MergeSortImplementation mergeSort = new MergeSortImplementation();
		NotesCount notes = new NotesCount();
		
		System.out.println("Enter the size of currency denominations");
		int sizeOfCurrency = sc.nextInt();
		
		
		//Initialize the array 
		int[] currencyArray = new int[sizeOfCurrency];
		System.out.println("Enter the size of currency denominations");
		for (int i=0;i<sizeOfCurrency; i++)
		{
			currencyArray[i] = sc.nextInt();
		}	
		
		System.out.println("Enter the amount you want to pay");
		int amountToPay = sc.nextInt();
		
		mergeSort.sort(currencyArray, 0, currencyArray.length-1);
				
		
		notes.notesCountImplementation(currencyArray,amountToPay);
	}

}
