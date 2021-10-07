package assignment3;

public class stringclass3 {

	public static void main(String[] args) {

		String str1 = "Java String pool refers to collection which are stored in heap memory";
		
		System.out.println("A: "+str1.toLowerCase());
		
		System.out.println("B: "+str1.toUpperCase());
		
		System.out.println("C: "+str1.replace('a','$'));
		
		System.out.println("D: "+str1.contains("collection"));
		
		System.out.println("E: "+str1.equals("java string pool refers to collection which are stored in heap memory"));
	
		System.out.println("F: "+str1.equalsIgnoreCase("Java String pool refers to collection which are stored in heap memory"));
		   }
}


