package ch17;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest01 {
	public static void main(String[] args) {
		// HashMap 객체 생성 <탐색>
		HashMap<String, String> dict = new HashMap<String, String>();
		
		// 3개의 (k, v)로 이루어진 값을 dict에 저장
		dict.put("사과", "apple");
		dict.put("포도", "grape");
		dict.put("바나나", "banana");
		
		// 사용자로부터 한글 단어를 입력 받아 영어 단어 검색
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			System.out.print("알고 싶은 과일 이름을 입력하세요.(0은 종료) ");
			String kor = stdIn.next();
			
			// 0 입력 시 프로그램 종료
			if(kor.equals("0")) {
				System.out.print("사전 종료");
				break;
			}
			
			// 해시맵에서 키 kor에 해당하는 값 eng 검색
			String eng = dict.get(kor);
			if(eng == null) {
				System.out.println(kor + "는 없는 단어 입니다.");
			}
			else {
				System.out.println(eng);
			}	
		}
		
	}
}