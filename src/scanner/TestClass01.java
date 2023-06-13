package scanner;

import java.util.Scanner;

public class TestClass01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		String name;
		
		System.out.println("이름 입력 : ");
		name = sc.next();			// next() :문자열
		
		System.out.println("수 입력 : ");
		num = sc.nextInt();			// nextInt() :정수
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + num);
		
	}
}
