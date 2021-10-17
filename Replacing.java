package week3.day1;

public class Replacing {

	public static void main(String[] args) {
		String word= "I am working with Java8";
		String re=word.replaceFirst("8", "11");
		re=re+"#";
		System.out.println(re);
		System.out.println(re.substring(5, 14));

	}

}
