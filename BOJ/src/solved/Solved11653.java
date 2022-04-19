package solved;

import java.util.Scanner;
 
public class Solved11653 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        
		int N = in.nextInt();
 
		for (int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
			while (N % i == 0) {
				System.out.println(i);
				N /= i; //나눠주어야 나눠준값부터 다시 소인수분해 시작.
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
	}
}