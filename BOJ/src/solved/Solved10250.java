package solved;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
 
public class Solved10250 {
 
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//자바 bufferreader를 사용해서 입력을 할 경우 한줄 읽기밖에 안되기 때문에 StringTokenizer나 split으로 문자열을 분리해줘야한다.
        int testCase = Integer.parseInt(br.readLine());
        for(int i=0; i<testCase; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int height = Integer.parseInt(st.nextToken()); // 층
        	int width = Integer.parseInt(st.nextToken()); // 층마다 방수
        	int nth = Integer.parseInt(st.nextToken()); //손님
        	int floor = nth%height , room = nth/height; // 손님/층 의값은 호수(+1해주면됨) 손님%층 의값은 층수가된다.
        	if( floor == 0 ) {
        		System.out.println(height*100+room);
        	} else {
        		System.out.println(floor*100+room+1);
        	}
        }
	}
}