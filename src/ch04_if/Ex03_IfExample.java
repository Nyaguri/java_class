package ch04_if;

import java.util.Scanner;

public class Ex03_IfExample {

	public static void main(String[] args) {
		/**
		 * 스캐너로 점수(score)를 하나 입력 받아서
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 60점보다 적은 점수면 F
		 * 를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int Score = scanner.nextInt();
		System.out.println(Score);
		if (Score >= 90) {
			System.out.print("A");
		} else if (Score >= 80) {
			System.out.print("B");
		} else if (Score >= 70) {
			System.out.print("C");
		} else if (Score >= 60) {
			System.out.print("D");
		} else {
			System.out.print("F");
		}

	}

}
