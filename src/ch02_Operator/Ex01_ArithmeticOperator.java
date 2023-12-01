package ch02_Operator;

public class Ex01_ArithmeticOperator {

	public static void main(String[] args) {
		// 산술연산자
		/**
		 * num1, num2 두개의 정수형 변수를 선언하고 값은 마음대로
		 * 두 변수의 +, -, *, /, % 의 연산결과를 print()를 활용하여 출력해봅시다
		 * 출력방법
		 * System.out.println(num1 + num2);
		 */
		int num1 = 11, num2 = 30;
		System.out.println("덧셈 결과: " + (num1 + num2));
		System.out.println("뺄셈 결과: " + (num1 - num2));
		System.out.println("곱셈 결과: " + (num1 * num2));
		System.out.println("나눗셈 결과: " + (num1 / num2));
		System.out.println("나머지 결과: " + (num1 % num2));
		
		int result = 0;
		result = num1 + num2;
		System.out.println(result);
		result = num1 - num2;
		System.out.println(result);
		result = num1 * num2;
		System.out.println(result);
		result = num1 / num2;
		System.out.println(result);
		result = num1 % num2;
		System.out.println(result);
		
		//계산 결과 변수를 따로 선언
		int sumResult = num1 + num2;
		System.out.println(sumResult);
		int subResult = num1 - num2;
		System.out.println(subResult);
		int mulResult = num1 * num2;
		System.out.println(mulResult);
		int divResult = num1 / num2;
		System.out.println(divResult);
		int remainResult = num1 % num2;
		System.out.println(remainResult);
		
		
	}

}
