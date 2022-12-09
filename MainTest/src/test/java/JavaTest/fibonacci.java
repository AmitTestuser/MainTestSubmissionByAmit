package JavaTest;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to find fibonacci series");
		
		int n = in.nextInt();
		
		int firstNo =0;
		int secondNo =1;
		
		System.out.println("Fibonacci series:");
		System.out.print(firstNo+" "+secondNo);
		
		for(int i = 2; i < n; i++){
			
			int thirdNo = firstNo + secondNo;
			
			System.out.print(" "+thirdNo);
			firstNo = secondNo;
			secondNo = thirdNo;
			
		}
		

	}

}
