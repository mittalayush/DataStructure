package data.structure;

import java.util.Hashtable;
import java.util.Scanner;
public class DuplicateValues {
/* An unsorted array of n integers, and range of integers are 1 to n. 
 * In the array, one integer has a duplicate , and one integer is missing. 
 * How to find the duplicate number and the missing number? 
 */
public static void main(String args[])
{			
			int sum=0, arraysum=0,duplicate = 0;
			Hashtable <Integer, Integer> table= new Hashtable<Integer, Integer>();
			Scanner reader = new Scanner(System.in);
			System.out.println("Please enter the total number of elements...");
				int n=reader.nextInt();
        		int[] a=new int[n];
       		Scanner sc=new Scanner(System.in);
        		System.out.println("Please enter the elements...");
        	for(int j=0;j<n;j++)
        		a[j]=sc.nextInt();
        		System.out.println("Array elements are : ");
        	for (int i=0;i<a.length;i++){
        		arraysum+=a[i]; 
        		System.out.println(a[i]);
        	}
        	sum= (n*(n+1))/2;
        	
        	for(int j=0;j<n;j++){
        		if (!table.containsValue(a[j]))
        		table.put(j, a[j]);
        	else{
        		 duplicate=a[j];
        		System.out.println("Duplicate value found  "+duplicate);
        		}
        	}// end for loop 
        	
        	if (duplicate==0){
        		System.out.println("No Duplicate records found");
        	}
        	else{
        	System.out.println("Missing value is  "+ (sum-arraysum+duplicate));
        	}
}
}