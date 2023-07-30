package july.assignment;

public class SwappingVariablesWithoutTempVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare a variable a and assign the value of 50
		int a =50;
		// declare a variable b and assign the value of 50
		int b=100;
		//Add the variables a and b and assign it to variable a
		a=a+b;
		//Subtract the variable b from variable a and assign it to the variable b
		b=a-b;
		//Subtract the variable b from variable a and assign it to the variable a
		a=a-b;
		
		
		//Print the values of a and b
		System.out.println(a);
		System.out.println(b);

	}

}
