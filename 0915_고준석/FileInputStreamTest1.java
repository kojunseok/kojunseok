package ch13_0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 *  작성일 : 2023년 9월 22일
 *  작성자 : 컴퓨터소프트웨어공학부 202095007 고준석
 *  설명 : 바이트 단위로 파일에 저장된 내용 가져오기.
 */
public class FileInputStreamTest1 {

	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next(); // 문자열로 입력된 파일명 저장.
		
		// 읽어들일 파일명으로 객체 생성
		FileInputStream fis = new FileInputStream(sfile);
		
		// 한 바이트씩 읽기
		int i;
		while((i = fis.read()) != -1 ) { // 데이터를 모두 읽으면 -1 반환
			System.out.print((char)i);
		}
		fis.close(); // 입력 스트림 닫기.
		
		System.out.println(sfile + "파일로 부터 바이트를 읽어 화면에 출력하였습니다.");
	}

}
