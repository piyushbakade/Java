package assignment3;

public class stringbuffer2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("it is used to _ at the specified index position");
		System.out.println(sb);
		sb.insert(13," insert text");
		System.out.println(sb);
	}

}