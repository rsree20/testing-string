
public class Test {

	public static void main(String[] args) {

		String s2 = "Helo java!! I started learning you!!";
		String s3 = "aaabbccaabbcc";

		String s1 = "Helo Java!! I started Java learning you!! I know Java and Core Java and Adv Java and other Java!!";
		int index = 0;
		int count = 0;
		String check= "b";
		while (index >= 0) {
			index = s3.indexOf(check, index);
			if (index >= 0) {
				count++;
				System.out.println(check + " occurred at : " + index);
				index = index +  check.length();
			}
		}

		System.out.println("Java occured : " + count + " times");
//		System.out.println(s1.indexOf("Java", 9));
		/*
		 * System.out.println(s1.charAt(6)); System.out.println(s1.charAt(10));
		 * s1.concat(" welcome"); System.out.println(s1.concat(" welcome new"));
		 * System.out.println(s1);
		 */

		/*
		 * if(s1.contains("Helo Java!! I started learning you!!")) {
		 * System.out.println("Stared learningn java"); } else {
		 * System.out.println("Started learning .net"); } boolean isItContainsJava =
		 * s1.contains("Java"); System.out.println(isItContainsJava);
		 */

		/*
		 * boolean isEquals = s1.equalsIgnoreCase(s2); System.out.println(isEquals);
		 */
	}
}