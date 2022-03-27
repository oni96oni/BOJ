package solved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Solved2869 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //br.readLine()은 문자열로 데이터를 읽는다. StringTokenizer로 문자열 분리 후 해당 토큰을 꺼내서 쓸 때 int형으로 쓰고자 한다면 Integer.parseInt()로 String을 int형으로 변환 시켜준다.
        
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
 
		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0)
			day++;
 
		System.out.println(day);
	}
}