package ch09_array;

import java.util.Objects;
import java.util.Scanner;

public class Ex09_ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int serv; // 기능
        int stu1 = 0; // 학생 수
        int[] stu = null;
        int[] result = null;
        int result1 = 0; // 점수
        double avg; // 평균 점수
        int sum = 0; // 합계
        int temp;
        int max = -2147483647; // 최고 점수
        while (true) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("1.학생 수 입력 | 2.점수 입력 | 3.점수 목록 | 4.분석 | 5.종료");
            System.out.println("---------------------------------------------------------------------");
            System.out.print("선택 > ");
            serv = scanner.nextInt();
            if (serv == 1) {
                System.out.print("학생 수 > ");
                stu1 = scanner.nextInt();
                if (stu1 > 0) {
                    result = new int[stu1];
                } else {
                    result = null;
                }
            } else if (serv == 2) {
                stu = new int[stu1];
                for (int i = 0; i < stu.length; i++) {
                    System.out.print((i + 1) + "번 학생 점수 : ");
                    result1 = scanner.nextInt();
                    result[i] = result1;
                    sum += result[i];
                }
            } else if (serv == 3) {
                for (int j = 0; j < result.length; j++) {
                    System.out.println(j + 1 + "번 학생 점수 : " + result[j]);
                }
            } else if (serv == 4) {
                for (int i = 0; i < result.length; i++) {
                    for (int j = i + 1; j < result.length; j++) {
                        if (result[i] < result[j]) {
                            temp = result[i];
                            result[i] = result[j];
                            result[j] = temp;
                        }
                    }
                    System.out.println((i+1)+"등 : " + result[i]);
                }
                avg = ((double) sum / Objects.requireNonNull(stu).length);
                System.out.println("최고 점수는 : " + result[0]);
                System.out.println("총합 : " + sum);
                System.out.println("평균 : "+ avg);
            }else if (serv == 5){
                System.out.println("종료합니다.");
                break;
            }else {
                System.out.println("다시 입력해 주세요");
            }
        }
    }
}
