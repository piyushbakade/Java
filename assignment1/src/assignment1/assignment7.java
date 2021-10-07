package assignment1;

import java.util.Scanner;

public class assignment7 {

	public static void main(String[] args) {
			
			System.out.println("Enter the value");
		 	Scanner sc=new Scanner(System.in);
	        int[] a=new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	        int n=sc.nextInt();
	        for(int i=0;i<a.length;i++)
	        {
	            if(n==a[i])
	            {
	                System.out.println("Yes its available");
	            }
	        }
	       

	}

}
