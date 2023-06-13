package variable;

public class TestClass05 {

	public static void main(String[] args) {
		/*
			상수
			- final키워드를 이용하여 단 한 번만 초기화 하여 사용하는 변수
			- 값의 변경이 불가능하다
			- 데이터가 변조되지 않았다는 것을 보장받는 변수
			
			literal 상수
			- 메모리 공간을 일시적으로 사용하여 한번 사용되고 버려지는 값
		 */
		System.out.println("값 : " + 100);	//literal 상수
		final String KOREA = "대한민국"; 			// 문자열은 "(큰 따옴표)
		System.out.println("나의 나라는 " + KOREA);
		
		// KOREA = "미국";
		System.out.println("나의 나라는 " + KOREA);
	}

}
