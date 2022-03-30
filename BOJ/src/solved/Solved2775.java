package solved;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Solved2775 {
	public static void main(String[] args) throws IOException { 
		//BR, SB, Count 변수 선언 및 입력 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		// 인원 수를 미리 배열로 계산
		int[][] floor = new int[15][15];
		for(int i = 1; i < 15; i++) { 
			floor[0][i] = i;
		} 
		for(int i = 1; i < 15; i++) {
			for(int j = 1; j < 15; j++) {
				if(j == 1) floor[i][j] = 1;
				else floor[i][j] = floor[i - 1][j] + floor[i][j - 1]; } } //내가 구할려는 배열칸의 아래와 바로왼쪽칸 합이 그 배열의 들어갈 수가 된다

		// count만큼 결과 입력 
		for(int i = 0; i < count; i++) { 
			int K = Integer.parseInt(br.readLine()); 
			int N = Integer.parseInt(br.readLine()); 
			sb.append(floor[K][N]).append("\n"); 
		} 
		System.out.print(sb); 
		// 결과 출력 
	} 

}
