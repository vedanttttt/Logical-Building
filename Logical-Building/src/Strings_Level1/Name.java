//2.	WAP to accept the First name , Middle Name and Last Name of a person and display full name  and Short Name (eq- Amar Kumar Singh-   A.K.S)

package Strings_Level1;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String fname = sc.nextLine();
		String mname = sc.nextLine();
		String lname = sc.nextLine();
		String s = fname + " " + mname + " " + lname;
		System.out.println(s);
		String res= fname.charAt(0) + "." + mname.charAt(0) + "." + lname.charAt(0);
		System.out.println(res);
//		if(res.compareTo(s)>0)
//			System.out.println(true);
	}

}
