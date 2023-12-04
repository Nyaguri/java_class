package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		/**
		 * 성적 출력 예제 응용
		 * 입력값: 학년(year), 점수(score)
		 * 처리
		 *  - 1~3학년은 60점 이상이면 합격
		 *  - 4학년은 70점 이상이여야 합격
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("학년을 입력하세요: ");
		int year = scanner.nextInt();
		System.out.print("점수를 입력하세요: ");
		int Score = scanner.nextInt();
		if(year <= 3 && year >= 1) {
			if(Score >= 60) {
				System.out.println("합격");
			}
		}else if(year == 4) {
			if(Score >= 70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("학년을 다시 입력해주세요");
		}
	}
}
