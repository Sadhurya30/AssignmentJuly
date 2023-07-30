package july.assignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare the variable range and assign the value to 8
		   int range =8;
		   // declare the variable firstnum and initialize the value to 0
	        int firstNum = 0;
	        // declare the variable secNum and initialize the value to 1
	        int secNum = 1;
	        //declare the variable sum and initialize the value to 0
	        int sum=0;
	        //print the values of firstnum and secnum
	        System.out.println(firstNum);
	        System.out.println(secNum);
	        //iterate a for loop from 3 to the range 
	        for(int i=3;i<=range;i++) {
	            // add the variables firstNum and secNum and assign it to the variable sum
	        	sum = firstNum + secNum;
	        	// assign the value of the secNum  to firstNum
	        	firstNum= secNum;
	        	//assign the value of sum to the variable secNum
	        	secNum = sum;
	        	//Print the values of the sum
	        	System.out.println(sum);
	        	
	        }

	}

}
