//	WAP to accept two strings and tell which comes later in lexicographicsorder(dictionary order)


package Strings_Level1;

import java.util.Scanner;

public class Lexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println((s1.compareToIgnoreCase(s2)>0));
		System.out.println(s1.compareTo(s2)>0);
	}

}
