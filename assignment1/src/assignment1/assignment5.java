package assignment1;

import java.util.Scanner;

public class assignment5 {

	public static void main(String[] args) {
		
		System.out.println("Enter you income");
		Scanner sc=new Scanner(System.in);
        long ctc=sc.nextInt();
        if(ctc<=180000)
        {
            System.out.println("Null");
        }
        else if(ctc>180000 && ctc<=300000)
        {
            long sum=(ctc/100)*10;
            System.out.println("Your income tax is"  +sum);
        }
        else if(ctc>300000 && ctc<=500000)
        {
            double sum=(ctc/100)*20;
            System.out.println("Your income tax is"  +sum);
        }
        else if(ctc>500000 && ctc<=1000000)
        {
            long sum=(ctc/100)*30;
            System.out.println("Your income tax is"  +sum);
        }
		
	}

}
