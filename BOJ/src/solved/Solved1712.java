package solved;

import java.util.Scanner;

public class Solved1712{
	public static void main(String[] args) {
		long A,B,C;
		Scanner s=new Scanner(System.in);
		
		A=s.nextLong();
		B=s.nextLong();
		C=s.nextLong();
		
		long start=A+B; //총비용
		long count=1; //판매량
		long sellP=C; //총수익
		
		if (B>=C) { //개당 판매비용이 개당 판매수익을 뛰어넘는다면 손익분기점이 나올 수 없다. 팔때마다 계속 손실
			System.out.println("-1");
			return;
		}
		while(start>=sellP) { //총비용이 총수익보다 크거나 같다면 계속해서 반복
			++count;	//판매추가
			sellP+=C;	//총수익에 개당판매수익을 추가
			start+=B;	//총비용에 개당판매비용을 추가
		}
		System.out.println(count);
		
	}
}	