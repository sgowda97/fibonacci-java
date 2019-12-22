package fibonacci.recursive;

import java.util.Scanner;

public class FibonacciSeries {
	
	static int n1 = 0, n2 = 1, n3 = 0;
	
	static void fibonacciSeries(int count) {
		if(count>0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
			fibonacciSeries(count-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int count;
		
		System.out.println("Enter the number of iterations:");
		count = sc.nextInt();
		
		System.out.print(n1+" "+n2);
		fibonacciSeries(count-2);
	}
}
