package july.assignment;

public class LearnCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Declare a string and assign the value
     String text = "Testleaf";
     // declare a variable length and get the length of the text
     int length = text.length();
     
     //Print the value of the length
     System.out.println(length);
     
     //Convert the string into character array
     
     char[] charArray = text.toCharArray();
     //Iterate a for loop from 0 to the length of the character array
     for(int i=0;i<charArray.length;i++) {
    	 System.out.println(charArray[i]);
     }
	}

}
