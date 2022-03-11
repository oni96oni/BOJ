package solved;

import java.util.Scanner;

public class Solved1157{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		String word = sc.next(); //입력 받을 값

		int length= word.length(); //입력 받은 값의 길이

		int[] abcArr = new int[26]; //알파벳 개수만큼의 배열생성


		for(int i=0;i<length;i++){
			for(int x=0;x<26;x++){
				char char_word= word.charAt(i);
				int X = x+97; // 'a'는 아스키 코드 10진법으로 97
				int xC=x+65;  // 'A'는 아스키 코드 10진법으로 65
				char alpha = (char) X;
				char alphaC= (char) xC;
				if(char_word==alpha  ||  char_word==alphaC){ // a와A면은 배열첫번째에 +1 이렇게 순서대로 더할수도있구나!
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
		if(count==1){ //가장 큰 값을 가진(입력이 많이된) 알파벳을 꺼낸뒤에 (char)붙여서 띄워버림
			for(int i=0;i<26;i++){
				if(max==abcArr[i]){
					result=i+65;
					break;
				}
			}
		}else{
			System.out.println("?");
			return;
		}
		char result_char = (char) result;
		System.out.println(result_char);
	}
}