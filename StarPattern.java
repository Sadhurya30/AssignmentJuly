package july.assignment;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iterate a for loop from 1 to 5
		for(int i=1;i<=5;i++) {
		//Iterate a nested for loop from 1 to the value of i
			for(int j=1;j<=i;j++) {
				// print "*"
				System.out.print("*");
			}
			//print the empty line
			System.out.println();
		}

	}

}
