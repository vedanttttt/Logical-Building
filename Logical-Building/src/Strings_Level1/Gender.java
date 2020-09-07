//	WAP to accept the name of a person and guess the gender based on following Table.
//Condition	Gender
//Start with “mr.”	Male
//Start with “miss”	Female
//Start with “mrs”	Married Female
//Ends with “Kumari”	Female
//Else	Cannot Determine

package Strings_Level1;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		if(s.startsWith("mr."))
			System.out.println("Male");
		else if(s.startsWith("miss"))
			System.out.println("Female");
		else if(s.startsWith("mrs"))
			System.out.println("Married Female");
		else if(s.endsWith("kumari"))
			System.out.println("Unmarried Female");
		else
			System.out.println("Cannot Determine");
	}

}
