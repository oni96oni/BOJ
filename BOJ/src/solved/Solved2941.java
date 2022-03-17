package solved;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		//문자열로 받아서 그중에 크로아티아 알파벳에 해당하는것을 그냥 A로 치환해서 문자열길이 출력해버리기
		str = str.replace("c=", "A");
		str = str.replace("c-", "A");
		str = str.replace("dz=", "A");
		str = str.replace("lj", "A");
		str = str.replace("nj", "A");
		str = str.replace("s=", "A");
		str = str.replace("z=", "A");
		str = str.replace("d-", "A");
		
		System.out.println(str.length());
	}

}