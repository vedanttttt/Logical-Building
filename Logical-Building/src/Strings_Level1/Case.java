//	WAP to accept a String and Convert the case of each alphabet present in it

package Strings_Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char ar[] = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isUpperCase(ar[i]))
				ar[i]=Character.toLowerCase(ar[i]);
			else
				ar[i]=Character.toUpperCase(ar[i]);
		}
		s = String.valueOf(ar);
		System.out.println(s);
//		int e = s.lastIndexOf('p');
//		System.out.println(e);
//		List<Character> l = new ArrayList<>();
//		l.add('a');
//		l.add('a');
//		l.add('b');
//		l.remove(new Character('a'));
//		System.out.println(l);
//		char[] arr = {'h','e','l','l','o'};
//		String str = new String(arr);
//		System.out.println(str);
	}

}
