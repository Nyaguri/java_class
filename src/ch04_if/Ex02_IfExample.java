package ch04_if;

import java.util.Scanner;

public class Ex02_IfExample {

	public static void main(String[] args) {
		/**
		 * 성적 출력하기
		 * 자바 점수(javaScore)가 60점 이상이면 합격, 아니면 불합격이라고 출력하기
		 * 자바 점수는 미리 점수를 입력해놓고 실행함
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int javaScore = scanner.nextInt();
		System.out.println(javaScore);
		if (javaScore >= 60) {
			System.out.println("합격");
		} else if (javaScore >= 50) {
			System.out.println("멍청이");
		} else if (javaScore >= 10){
			System.out.println("바보");
		} else {
			System.out.print("불합격");
		}
	}

}
