package ch13_0922;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

/*
 *  작성일 : 2023년 9월 22일
 *  작성자 : 컴퓨터소프트웨어공학부 202095007 고준석
 *  설명 : 바이트 단위로 파일에 저장.(파일 생성)
 */
public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {		
		// 파일명으로 객체 생성.
		OutputStream fos = new FileOutputStream("c.txt");
		// OutputStream : 바이트 스트림의 입출력을 위한 추상 클래스
		// FileOutputStream : 파일에 바이트 스트림의 입출력 기능 제공.
		
		String str = "자바 프로그래밍 \n문자 스트림과 바이트 스트림";
		
		byte[] bt = str.getBytes(); // 문자열을 바이트로 변환.		
		
		fos.write(bt);  // 파일에 쓰기(저장).
		System.out.println("파일 생성하였습니다.");
		fos.close(); // 출력 스트림 닫기.
	}

}
