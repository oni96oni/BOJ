import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		String word = sc.next();

		int length= word.length();

		int[] abcArr = new int[26];


		for(int i=0;i<length;i++){
			for(int x=0;x<26;x++){
				char char_word= word.charAt(i);
				int X = x+97;
				int xC=x+65;
				char alpha = (char) X;
				char alphaC= (char) xC;
				if(char_word==alpha  ||  char_word==alphaC){
					abcArr[x]+=1;
				}

			}

		}
		int max = 0;
		int count =0;
		int result = 0;
		for(int i : abcArr){
			max=(max<i)?i:max;
		}
		for(int i :abcArr){
			count+=(i==max)?1:0;
		}
		if(count==1){
			for(int i=0;i<26;i++){
				if(max==abcArr[i]){
					result=i+65;
					break;
				}


			}
		}else{
			System.out.println("?");
		}
		char result_char = (char) result;
		System.out.println(result_char);
	}
}