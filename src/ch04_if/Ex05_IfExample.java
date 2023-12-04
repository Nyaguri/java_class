package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		/**
		 * 정수 하나를 입력 받아서 양수, 음수, 0인지를 출력
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = scanner.nextInt();
		String spelling = "";
		//		if(num > 0 || num <= 0) {
		if(num > 0) {
			spelling = "양수";
		}else if(num == 0) {
			spelling = "0";
		}else {
			spelling = "음수";
		}
		System.out.print(spelling);	
	}

}
