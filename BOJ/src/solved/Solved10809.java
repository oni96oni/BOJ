package solved;
import java.util.*; // 자바 유틸 라이브러리 호출 - 스캐너 사용

public class Solved10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너 호출

        String str = sc.next(); // 단어 입력
        char arr[] = str.toCharArray(); // 입력한 단어를 문자 배열로 변환

        if(arr.length <= 100){ // 단어 길이가 100보다 작으면 실행
            for(int i = 'a'; i <= 'z'; i++){ // 각 알파벳의 존재 위치 확인 반복문
                int result = -1; // 각 알파벳의 존재 여부값 초기화
                for(int j = 0; j < arr.length; j++){ // 문자 탐색
                    if(arr[j] == i){ // 문자의 십진 아스키 코드 값을 이용하여 문자 탐색
                        result = j;
                        break;
                    } // 십진 아스키 코드 값이 일치하는 문자가 있으면 그 글자의 인덱스 값으로 값 변경 후 반복문 탈출
                }
                System.out.print(result + " "); // 결과 출력
            }
        }
    }
}