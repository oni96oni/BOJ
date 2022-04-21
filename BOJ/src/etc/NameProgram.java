package etc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class NameProgram {

	public static void main(String[] args) throws Exception {
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char name1 = st.nextToken().charAt(0);
			char name2 = st.nextToken().charAt(0);
			String name3 = st.nextToken();
			String name4 = name1 + "";
			String name5 = name2 + "";
			
			System.out.println(name4 + name5 + name3);
		}
	}

}
