//GOOD QUESTION

//	WAP to accept a String and Display it in Title Case.(eq- My name is covid----- My Name Is Covid)

package Strings_Level1;

import java.util.Scanner;

public class Title
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("plz enter any String");
        String str,r = "";
        char ch;
        int l;
        str = sc.nextLine();
        //str = str.toLowerCase();
        str = " " + str;
        l = str.length();
        for(int i =0;i<l;i++)
        {
          ch = str.charAt(i);
          if(ch == ' ')
          {
             r = r + ch;
             i++;
             ch = Character.toUpperCase(str.charAt(i));
          }
          else
              ch = Character.toLowerCase(str.charAt(i));
          r = r + ch;
        }
        System.out.println(r.substring(1));
        
//        String s = sc.nextLine();
//        String r=""+ Character.toUpperCase(s.charAt(0));
//        for(int i=1;i<s.length();i++) {
//        	if(s.charAt(i-1)==' ')
//        		r += Character.toUpperCase(s.charAt(i));
//        	if(s.charAt(i-1)!=' ')
//        		r += Character.toLowerCase(s.charAt(i));
//        	if(s.charAt(i)==' ')
//        		r += s.charAt(i);
//        }
//        System.out.println(r);
    }
}
