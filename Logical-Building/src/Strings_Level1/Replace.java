//	WAP to replace “15 august” with “26 january” and  “independence” with “republic” in the string “15 august is independence day” 

package Strings_Level1;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "15 august is independence day" ;
		s=s.replace("15","26");
		s=s.replace("independence", "republic");
		System.out.println(s);
	}

}
