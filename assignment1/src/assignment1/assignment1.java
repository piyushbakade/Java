package assignment1;
import java.util.*;
public class assignment1 {
	public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        String s=Integer.toString(i);
        int sum=0;
        for(int j=0;j<s.length();j++)
        {
            int k=Integer.parseInt(Character.toString(s.charAt((j))));
            sum=sum+(k*k*k);
        }
        if(sum==i)
        {
            System.out.println("Is an ArmStrong");
        }
        else
        {
            System.out.println("Is Not an ArmStrong");
        }
    }
}
