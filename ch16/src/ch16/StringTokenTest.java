package ch16;

import java.util.StringTokenizer;

public class StringTokenTest {
	public static void main(String[] args) {
		String s1 = "name kojunseok gender M age 23";
		String s2 = "name,kojunseok,gender,M,age,23";
		String s3 = "name/kojunseok/gender/M/age/23";
		
		System.out.println(":: 빈칸을 기준으로 분리 ::");
		StringTokenizer st1 = new StringTokenizer(s1);
		// 토큰이 있으면 true, 없으면 flase를 반환
		while(st1.hasMoreTokens()) { 
			// 다음 토큰을 기준으로 문자열을 반환
			String first = st1.nextToken();
			String second = st1.nextToken();
			System.out.println(first + "\t" + second);
		}
		
		System.out.println(":: ,를 기준으로 분리 ::");
		StringTokenizer st2 = new StringTokenizer(s2, ",");
		while(st2.hasMoreTokens()) { 
			// 다음 토큰을 기준으로 문자열을 반환
			String first = st2.nextToken();
			String second = st2.nextToken();
			System.out.println(first + "\t" + second);
		}
		System.out.println(":: /를 기준으로 분리 ::");
		StringTokenizer st3 = new StringTokenizer(s3, "/");
		while(st3.hasMoreTokens()) { 
			// 다음 토큰을 기준으로 문자열을 반환
			String first = st3.nextToken();
			String second = st3.nextToken();
			System.out.println(first + "\t" + second);
		}
		
	}
}