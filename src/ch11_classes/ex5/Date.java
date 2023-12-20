package ch11_classes.ex5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
        System.out.println("now = " + now);
    String year = now.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("year = " + year);
    String month = now.format(DateTimeFormatter.ofPattern("MM"));
        System.out.println("month = " + month);
    String day = now.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("day = " + day);
    String hour = now.format(DateTimeFormatter.ofPattern("HH"));
        System.out.println("hour = " + hour);
    String minute = now.format(DateTimeFormatter.ofPattern("mm"));
        System.out.println("minute = " + minute);
    String second = now.format(DateTimeFormatter.ofPattern("ss"));
        System.out.println("second = " + second);
    String createdAt = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("createdAt = " + createdAt);
    createdAt = now.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH시mm분ss초"));
        System.out.println("createdAt = " + createdAt);
    }
}
