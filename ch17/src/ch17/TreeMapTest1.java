package ch17;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest1 {
	public static void main(String[] args) {
		// 트리맵 객체 생성 <정렬>
		TreeMap<Integer, String> score = new TreeMap<Integer, String>();
		
		// 맵에 요소 추가
		score.put(75, "국어");
		score.put(30, "영어");
		score.put(54, "수학");
		score.put(83, "과학");
		score.put(100, "한국사");
		
		// 첫번째 요소를 Map.Entry 형으로 생성, <key, value>
		Map.Entry<Integer, String> high_low = score.firstEntry();
		// 항상 정렬이 되는 첫번째 값이 가장 낮은 값이다.
		System.out.println("가장 낮은 성적은 " + high_low.getKey() + "점 이며, 과목은 " + high_low.getValue() + "입니다.");
		
		// 제일 높은 점수 찾아 출력
		Map.Entry<Integer, String> high_high = score.lastEntry();
		// 항상 정렬이 되는 마지막 값이 가장 높은 값이다.
		System.out.println("가장 높은 성적은 " + high_high.getKey() + "점 이며, 과목은 " + high_high.getValue() + "입니다.");
		
		// 학점 출력 (80점 미만은 C,D에 해당하고, 80점 이상은 A,B에 해당한다.)
		// Map객체 지정하여 제네릭으로 생성
		Map<Integer, String> cd = score.headMap(80);  // 80 미만 맵 생성
		Map<Integer, String> ab = score.tailMap(80);  // 80 이상 맵 생성
		
		System.out.println("학점 A,B에 해당하는 과목과 점수 : " + ab);
		System.out.println("학점 C,D에 해당하는 과목과 점수 : " + cd);
		
		System.out.println("점수순으로 출력(낮은 점수부터) : " + score);
		System.out.println("점수순으로 출력(높은 점수부터) : " + score.descendingKeySet());
	}
}