package ch12;

public class BufferTest1 {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java ");
		StringBuffer sb2 = new StringBuffer("easy ");
		System.out.println(sb1.append("Korea")); // java Korea
		System.out.println(sb2.append(sb1)); // easy java Korea
		System.out.println(sb1); // java Korea
		System.out.println(sb2); // easy java Korea
		
		System.out.println(sb2.substring(5, 9)); // java -> 5번 부터 8번까지 string 객체로 반환 > 변환이 아님
		System.out.println(sb2.delete(5, 10)); // easy Korea -> 5번 부터 9번까지 삭제
		System.out.println(sb2); // easy Korea -> 위랑 동일
		System.out.println(sb1.reverse()); // aerok avaj // .reverse() 문자열을 역순의 문자열로 변환하여 반환
	}

}
