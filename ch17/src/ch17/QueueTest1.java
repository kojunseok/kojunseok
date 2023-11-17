package ch17;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueTest1 {
	public static void main(String[] args) {
		LinkedList<String> queue = new LinkedList<String>();
		
		// 사용자로부터 4개의 과일 이름을 입력 받아 queue에 저장 -> offer
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0; i < 4; i++) {
			System.out.print("과일 이름을 입력하세요 : ");
			String fruits = stdIn.next();
			queue.offer(fruits);
		}
		
		// queue에 저장된 과일 리스트 출력
		System.out.println("과일 리스트<큐> : " + queue);
		
		// queue에서 과일 찾기 - indexOf()
		System.out.print("찾고 싶은 과일 이름을 입력하세요 : ");
		String f_name = stdIn.next();
		int fruit = queue.indexOf(f_name);
		if(fruit != -1) { // -1이면 빈값
			System.out.println("큐에서 " + f_name + "의 위치는 " + fruit + "번째 입니다.");
		}
		else {
			System.out.println("큐에는 " + f_name + "가 없습니다.");
		}
		
		// queue 리스트 삭제 - poll()
		System.out.println("과일 리스트<큐> 삭제");
		while(!queue.isEmpty()) {
			String obj = queue.poll();
			System.out.println("<큐>에서 poll : " + obj);
		}
//		과일 이름을 입력하세요 : 사과
//		과일 이름을 입력하세요 : 포도
//		과일 이름을 입력하세요 : 수박
//		과일 이름을 입력하세요 : 망고
//		과일 리스트<스택> : [사과, 포도, 수박, 망고]
//		찾고 싶은 과일 이름을 입력하세요 : 사과
//		스택에서 사과의 위치는 4번째 입니다.
//		과일 리스트<스택> 삭제
//		<스택>에서 pop : 망고
//		<스택>에서 pop : 수박
//		<스택>에서 pop : 포도
//		<스택>에서 pop : 사과
	}
}