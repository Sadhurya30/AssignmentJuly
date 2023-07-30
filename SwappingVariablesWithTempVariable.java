package july.assignment;

public class SwappingVariablesWithTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declare a variable a and assign the value 
		int a =50;
		// declare a variable b and assign the value 
		int b = 100;
		// declare a variable c and initialize it to 0 
		int c=0;
		
		//Assign the value of a to the variable  c
		c=a;
		//Assign the value of b to the variable a
		a=b;
		//Assign the value of c to the variable b
		b=c;
		//Print the values of a and b
		System.out.println(a);
		System.out.println(b);

	}

}
