package com.greatlearning.service;

//Merge Sort implementation class

public class MergeSortImplementation {
	
	//This method is used to sort the array and divide it into small groups
	
	public void sort(int[] arr, int left, int right)
	{
		if(left < right) {
		int mid = (left+right)/2;
		sort(arr,left,mid);
		sort(arr,mid+1,right);
		
		merge(arr,left,mid,right);
		}
	}
	
	//This method is used to merge the arrays
	
	public void merge(int[] arr, int left, int mid,int right)
	{
		int len1 = mid-left +1;
		int len2 = right-mid;
		
		int[] leftarr = new int[len1];
		int[] rightarr = new int[len2];
		for(int i =0;i< len1 ; i++)
		{
			leftarr[i] = arr[left+i];
		}
		for(int j =0;j< len2 ; j++)
		{
			rightarr[j] = arr[mid+1+j];
		}
		
		int i,j,k;
		i = 0;
		j = 0;
		k = left;
		
		while (i <len1 && j <len2)
		{
			// Used greater than as descending order is required
			
			if(leftarr[i]>=rightarr[j])
			{
				arr[k] = leftarr[i];
						i++;
			}
			else
			{
				arr[k] = rightarr[j];
						j++;
			}
			k++;
		}
		while(i <len1)
		{
			arr[k] = leftarr[i];
			i++;
			k++;
		}
		while(j <len2)
		{
			arr[k] = rightarr[j];
			j++;
			k++;
		}
	}
}

