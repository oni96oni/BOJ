package solved;

import java.util.Scanner;

public class Solved2675 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num, repeat, str_length;
		String str;
		char[] result;

		num = in.nextInt();

		for(int i = 0; i < num; i++) {
			repeat = in.nextInt();
			str = in.next();
			str_length = str.length();

			result = str.toCharArray();
			for(int j = 0; j < str_length; j++) {

				for(int k = 0; k < repeat; k++) {
					System.out.print(result[j]);

				}

			}
			System.out.println();
		}
	}
}