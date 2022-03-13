import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String inputSt = br.readLine();


		if(inputSt.equals(" ") || inputSt.equals("")) {
			System.out.print("0");
			return;
		}

		if(inputSt.length() <= 1000000) {
			inputSt = inputSt.trim();
			String[] input = inputSt.split("\\s");
			System.out.print(input.length);	
		}

		br.close();
	}
}