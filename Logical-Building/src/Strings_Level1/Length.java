//	WAP to accept a sentence and display the words having length is greater than 5

package Strings_Level1;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine()+" ";
		int n = s.length();
		int j =0;
		int i=0;
		while(i<n) {
			if(s.charAt(i)==' ') {
				if(s.substring(j, i).length()>=5)
					System.out.println(s.substring(j, i));
				j=i+1;
			}
			i++;
		}
	}

}
