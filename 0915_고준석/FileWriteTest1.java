package ch13_0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 *  작성일 : 2023년 9월 22일
 *  작성자 : 컴퓨터소프트웨어공학부 202095007 고준석
 *  설명 : 문자를 파일에 쓰기.(저장)
 */
public class FileWriteTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		// 파일에 저장할 물자열 생성.
		String source = "동해물과 백두산이 마르고 닳도록\n"
				      + "하느님이 보우하사 우리 나라만세 \n"
				      + "무궁화 삼천리 화려강산 대한사람 대한으로 길이 보전하세";
		// 파일명으로 객체 생성.
		FileWriter fw = new FileWriter(sfile);
		
		// 문자열을 파일에 출력.
		fw.write(source); // 객체를 통해 a.txt 파일에 source에 있는 내용을 출력(저장).
		
		// 출력 스트림 닫기.
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
		
	}

}