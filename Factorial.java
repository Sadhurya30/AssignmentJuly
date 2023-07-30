package july.assignment;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5
		//5*4*3*2*1
		
		// declare a variable sum and initialize it to 1
		int sum = 1;
		//iterate a reverse for loop from 5 to 1
		for(int i=5;i>0;i--) {
		// multiply the variable sum  with the iterative variable i within the loop
			sum = sum *i;
		}
		//print the  value of sum
		
		System.out.println(sum);
	}

}
