package week3.day1;

public class StringText {

	public static void main(String[] args) {
		String str1= "I am Learnig Java";
		String str2="I am learning java?";
		if(str1==str2) {
			System.out.println("strings are matching");
		}
		else
		{
			System.out.println("strings are not matching");
		}
		if(str1.equals(str2)) {
			System.out.println("strings are matching");
		
		}
		else {
			System.out.println("strings are not matching");
			
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("strings are matching");
			
		}
		else {
			System.out.println("strings are not matching");
			
		}

	}

}
