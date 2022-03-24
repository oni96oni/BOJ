package solved;

import java.util.Scanner;

public class Solved2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=0;
		int sum=0;
		int cnt=1;
		sc.close();
		while(true) {
			if(n==1) 
				break;
			else if(n>6*sum+1) { // sum을 1씩 늘려가면서 cnt를 1씩 증가 그러다가 n이 점점 커지는 sum값에 걸리면 그때 break로
				cnt++;
				i++;
				sum+=i;
			}
			else
				break;
		}
		System.out.println(cnt);
	}
}