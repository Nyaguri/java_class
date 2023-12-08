package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        /**
         * int[] num = {3, 2, 1, 5, 4 }
         * 같이 있을 때 배열을 오름차순 정렬 하는 코드 작성
         */
        int[] num = {3, 2, 1, 5, 4};
        int temp;
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        System.out.println(num[i]);
        }
    }
}
