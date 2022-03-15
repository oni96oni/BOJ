package solved;

import java.util.Scanner;
public class Solved2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num1 = sc.next(); //734 -> 437
		String num2 = sc.next();
		int count = num1.length();
		int count2 = num2.length();
		char asb1[] = new char[num1.length()];
		char asb2[] = new char[num2.length()];
		
		for(int i=0; i<num1.length(); i++) {
			asb1[count -1] = num1.charAt(i);
			count--;
		}
		
		for(int i=0; i<num2.length(); i++) {
			asb2[count2 -1] = num2.charAt(i);
			count2--;
		}
		
		int content1 = Integer.parseInt(String.valueOf(asb1));
		int content2 = Integer.parseInt(String.valueOf(asb2));
		
		
		if(content1 > content2) {
			System.out.println(content1);
		}
		else {
			System.out.println(content2);
		}
	}
}