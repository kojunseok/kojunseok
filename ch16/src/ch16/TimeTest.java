package ch16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeTest {
	public static void main(String[] args) {
		// 날짜 관련 클래스
		LocalDate date = LocalDate.now();
		// 시간 관련 클래스
		LocalTime time = LocalTime.now();
		// 날짜와 시간 모두 가지는 클래스
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println("오늘 날짜 : " + date);
		System.out.println("현재 시간 : " + time);
		System.out.println("현재 날짜와 시간 : " + dt);
		
		String s = dt.getYear() + "년 ";
		s += dt.getMonthValue() + "월 ";
		s += dt.getDayOfMonth() + "일 ";
		s += dt.getDayOfWeek() + " ";
		s += dt.getHour() + "시 ";
		s += dt.getMinute() + "분 ";
		s += dt.getSecond() + "초 ";
		
		System.out.println("현재의 날짜와 시간 : " + s);
		
		System.out.println("오늘부터 100일 기념일은 : " + date.plusDays(100));
		System.out.println("오늘부터 10주 후의 날짜 : " + date.plusWeeks(10));
		
	}
}