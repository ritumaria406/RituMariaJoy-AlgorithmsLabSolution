package com.greatlearning.service;

public class NotesCount {
	
	public void notesCountImplementation(int notes[], int amount)
	{
		//notes Counter array  - used to print what all currencies are used
		int[] notesCounter = new int[notes.length];		
		try
		{
		for(int i =0 ; i< notes.length; i++)
		{
			if(amount >= notes[i])
			{
				notesCounter[i] = (amount / notes[i]);				
				amount = (amount % notes[i]);
			}
		}
		
		//Checking if any remaining amount is left 
		//If amount is left - Payment cannot be made
		//If amount =0 then we have enough currencies to pay the amount
		if(amount > 0)
		{
			System.out.println("Exact amount cannot be given with the highest denominations");
		}
		else
		{
			System.out.println("Your payment approach in order to give min no of notes will be");
			for(int i=0; i<notes.length;i++)
			{
				if(notesCounter[i] > 0)
				{
					System.out.println(notes[i]+":" +notesCounter[i]);
				}
			}
			}
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex +" notes of denomination 0 is invalid");
		}
	}
}
