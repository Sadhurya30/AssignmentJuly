package july.assignment;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declare a string and assign the value
		String s = "Sadhurya";
		
		//Convert the string into character array
		char[] charArray = s.toCharArray();
		
		//Iterate a reverse for loop from the length of the array to zero
		for(int i=charArray.length-1;i>=0;i--) {
			//Print the elements in the array
			System.out.print(charArray[i]);
		}

	}

}

