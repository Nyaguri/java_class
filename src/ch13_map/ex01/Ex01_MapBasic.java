package ch13_map.ex01;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        // key: 정수(int), Value: String
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "안녕");
        map1.put(2, "hello");
        // map1.put(3, 100); // Value 타입 불일치
        // map1.put("4", "안녕하세요") // key 타입 불일치
        // key 가 1인 데이터
        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println("s1 = " + s1);
        map1.put(1, "ㅎㅎㅎㅎ");
        // 동일한 키에 다른 데이터를 넣는다면
        map1.put(1, "안녕하십니까");
        System.out.println(map1.get(1));
        // 반복문으로 접근
        for (Integer i : map1.keySet()) {
            System.out.println("i = " + i);
        }

        // key : String, Value : String
        Map<String, String> map2 = new HashMap<>();
        map2.put("가", "안녕");
        map2.put("나", "ㅎㅎㅎ");
        map2.put("다", "ㅋㅋㅋ");
        System.out.println(map2.get("a"));

        // 반복문
        for (String s : map2.keySet()) {
            System.out.println(map2.get(s));
        }

        Map<Long, String> map3 = new HashMap<>();
        String ss1 = map3.put(1L, "안녕");
        System.out.println("ss1 = " + ss1); // null
        String ss2 = map3.put(2L, "hello");
        System.out.println("ss2 = " + ss2); // null
        String ss3 = map3.put(1L, "안녕하세요");
        System.out.println("ss3 = " + ss3); // 안녕
    }
}
