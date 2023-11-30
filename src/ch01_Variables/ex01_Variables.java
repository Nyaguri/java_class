package ch01_Variables;

public class ex01_Variables {

	public static void main(String[] args) {
		// 본인의 이름(name), 나이(age), 키(height), 주소(address), 전화번호(mobile)
		// 를 입력할 수 있는 변수를 각각 선언해봅시다.
		String name = "최낙원";
		int age = 27;
		double height = 168.8;
		String address = "경기도 시흥시 오동마을로45번길 47";
		String mobile = "010-2157-4026";
		
		// 변수값 출력
		System.out.println(name);
		// "name"라는 문자를 출력(""로 감싸면 문자 취급)
		System.out.println("name");
		// "name1"이라는 변수가 없으므로 에러 발생
		// System.out.println(name1);
		// 문자열과 변수를 연결 할 땐 "+"를 사용한다
		System.out.println("저의 이름은 " + name + " 입니다");
		
		

	}

}
