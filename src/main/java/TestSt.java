
public class TestSt {

	public static void main(String[] args) {
		
		String s2 = "Helo Java test today evening";
		String[] s3 = s2.split(" ", 9);
		System.out.println(s3);
		for (String t : s3) {
			System.out.println(t);
		}
//		String s1 = "Test";
		
//		String revStr = "";
		
		/*for(int i = s1.length()-1; i>=0; i--) {
			revStr = revStr + s1.charAt(i);
		}*/		
		/*int index = s1.length()-1;
		while(index >= 0) {
			revStr = revStr + s1.charAt(index);
			index--;
		}
		
		System.out.println(revStr);
		if(revStr.equals(s1)) {
			System.out.println("It is polindrom");
		} else 
			System.out.println("Not polindrom");*/
	}
	
}
