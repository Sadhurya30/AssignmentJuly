package july.assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare an integer array and assign the values
		int[] arr1 = {3,2,11,4,6,7};
		//declare an integer array and assign the values
		int[] arr2= {1,2,8,4,9};
		
		
		//Iterate a for loop from 0 to the length of the first array
		for(int i =0;i<arr1.length;i++) {
			//Iterate a nested for loop from 0 to the length of the second array
			for(int j=0;j<arr2.length;j++) {
				// Compare the elements in the first array  with the elements in the second array, if they are equal print that element.
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
				}
	}

}
}
}
