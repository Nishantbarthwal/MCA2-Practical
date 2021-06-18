package mocktest;

public class fact {

	public static void main(String[] args) {
		int num = 6;
		int fact =1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact*i;
		}
		System.out.print("Factorial of number:" + num + " is = " + fact);

	}

}
