package july.assignment;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt
		
		//Declare a string text and assign a value
		String text = "testleaf";
		
		// Declare a string uppercase and convert it into uppercase
		String upperCase = text.toUpperCase();
		//print the string upperCase
		System.out.println(upperCase);
		
		// convert the string text and convert it into character array
		char[] charArray = text.toCharArray();
		//Iterate a for loop from 0 to the length of the array
		for(int i=0;i<charArray.length;i++) {
			//check whether the elements in the array are divisible by 2
			//if it is divisible, convert that element into uppercase and print it
			//else print the element as such
			if(i%2!=0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			}
			else {
				System.out.print(charArray[i]);
			}
		}

	}

}

