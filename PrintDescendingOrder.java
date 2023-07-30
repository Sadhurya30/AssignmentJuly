package july.assignment;

import java.util.Arrays;

public class PrintDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare an integer array and assign the values
		int[] values = {10,30,20,50,40};
		
		//Sort the values in the array
		Arrays.sort(values);
		// Print the sorted values of the array by converting the array to string
		System.out.println(Arrays.toString(values));
		
		//Iterate a reverse for loop from the length of the array to 0
		for(int i=values.length-1;i>=0;i--) {
		//print the values of the array
			System.out.println(values[i]);
		}

	}

}
