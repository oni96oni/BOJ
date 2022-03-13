package solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solved1152 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputSt = br.readLine();


		if(inputSt.equals(" ") || inputSt.equals("")) { //주어진값이 공백 이거나 없으면 0을 출력
			System.out.print("0");
			return;
		}

		if(inputSt.length() <= 1000000) {
			inputSt = inputSt.trim();
			String[] input = inputSt.split("\\s"); //split은 입력받은 정규표현식 또는 특정 문자를 기준으로 문자열을 나누어 배열에 저장하여 리턴한다.
			System.out.print(input.length);	
		}

		br.close();
	}
}