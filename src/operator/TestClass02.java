package operator;

import java.util.Scanner;

public class TestClass02 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수 입력: ");
		int num = sc.nextInt();
		
		String result1 = (num % 2 == 0)? "짝수" : "홀수";
		String result2 = (num % 3 == 0)? "3의 배수" : "3의 배수가 아니다";
		
		System.out.println(num + "= " + result1);
		System.out.println(num + "= " + result2);
		
		System.out.println("두 수 입력: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		String result3 = (n1 > n2)? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println("num1 : " + n1 + " ,num2: " + n2);
		System.out.println(result3);
		
		
	}
}
	