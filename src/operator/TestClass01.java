package operator;

public class TestClass01 {
	
	public static void main(String[] args) {
		
		System.out.println("======연산자======");
		/*
		 	+, -, *, /, %
		 	
		 	/ : 정수 / 정수 => 정수 (몫)
		 		- 실수의 결과를 보고자하면 연산값 중 하나라도 실수값이 있어야한다
		 	
		 	% (mod) : 정수 % 정수 => 나머지
		 	 	- 짝, 홀 구분
		 	 	- 어떤 수의 배수
		 	 	- 각 자리별로 구분지을경우  
		 */
		
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println(n1 / (double)n2);
		System.out.println(n1 % n2);
		
		

		System.out.println("======복합대입 연산자======");
		/*
		 	복합대입 연산자
		 	a = 10;
		 	
		 	a = a + 10; => a += 10;
		 	a = a / 2; 	=> a /= 2;
		 	a = a * 2; 	=> a *= 2;
		 */
		
		n1 = n2 = 5;
		n1 += 1; System.out.println(n1);	// n1 + 1 = 6
		n1 -= 1; System.out.println(n1);	// n1 - 1 = 5
		n1 *= n2; System.out.println(n1);	// n1 * n2 = 25
		n1 /= n2; System.out.println(n1);	// n1 / n2 = 5
		n1 %= n2; System.out.println(n1);	// n1 % n2 = 0
		

		
		System.out.println("======관계 연산자======");
		/*
		 	관계 연산자
		 	- 결과적으로 true(참) 또는 false(거짓) 표현
		 	>, <, >=, <=, ==, !=
		 	a = 10, b = 5
		 	
		 	a > b  => true
		 	a <= b => false
		 	a == b => false
		 	a != b => true
		 	
		 	- 2항 연산자
		 */
		
		n1 = 5;
		n2 = 4;
		
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		
		
		System.out.println("======논리 연산자======");
		/*
			논리 연산자
			- 결과적으로 참 또는 거짓 표현
			- 여러개의 식을 묶고자하는 경우 사용
			
			&&(and) : 모든 값이 참인 경우 참, 하나라도 거짓이라면 거짓
			||(or)	: 하나라도 참이면 참, 모두 거짓인 경우 거짓
			!(not)	: 결과를 반전시켜준다. !참 => 거짓 // !거짓 => 참
		 */
		
		int n3 = 10;
		n1 = 5; n2 = 7;
		
		System.out.println(n1 > n2 && n2 > n3);		// f && f => f
		System.out.println(n2 > n1 && n1 > n3);		// t && f => f
		System.out.println(n3 > n1 && n3 > n2);		// t && t => t
		
		System.out.println("-------or-------");
		System.out.println(true || true);		// t
		System.out.println(true || false);		// t
		System.out.println(false || true);		// t
		System.out.println(false || false);		// f
		
		System.out.println("-------and-------");
		System.out.println(true && true);		// t
		System.out.println(true && false);		// f
		System.out.println(false && true);		// f
		System.out.println(false && false);		// f
		
		System.out.println("-------not-------");
		System.out.println( !true );			// f
		System.out.println( !false );			// t
		
		

		
		
	}
}
