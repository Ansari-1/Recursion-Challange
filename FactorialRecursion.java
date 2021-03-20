*/Recursion Challange*/

import java.util.*;
public class factorialRecursion
{
	int factorial(int N)
	{
		if(N == 0)
			return 1;
		else
			return(N*factorial(N-1));
	}
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();

		System.out.println(factorial(N));
	}
} 