package assignment1;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		
		 	Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Principal value");
	        int p=sc.nextInt();
	        System.out.println("Enter Time value");
	        int t=sc.nextInt();
	        System.out.println("Enter Rate value");
	        float r=sc.nextInt();
	        float si=(p*t*r)/100;
	        System.out.println(si);

	}

}
