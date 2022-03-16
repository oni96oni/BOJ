package solved;

import java.util.Scanner;

public class Solved5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String sDialog = sc.nextLine();
		int engtonumsum = 0;
//		if(!(2<=sDialog.length()&&sDialog.length()<=15)) {
//			
//		}
		char[] cDialog = sDialog.toCharArray();

		for(int i=0; i<cDialog.length; i++) {

			switch(cDialog[i]){
			case 'A': case 'B': case'C':
				engtonumsum +=3;
				break;
			case 'D': case 'E': case'F':
				engtonumsum +=4;
				break;
			case 'G': case 'H': case'I':
				engtonumsum +=5;
				break;
			case 'J': case 'K': case'L':
				engtonumsum +=6;
				break;
			case 'M': case 'N': case'O':
				engtonumsum +=7;
				break;
			case 'P': case 'Q': case'R': case'S':
				engtonumsum +=8;
				break;
			case 'T': case 'U': case'V':
				engtonumsum +=9;
				break;
			case 'W': case 'X': case'Y': case'Z':
				engtonumsum +=10;
				break;
			}
		}
		System.out.print(engtonumsum);
	}
}