package hanghae;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//2016년 7점
class Solution13 {
    public String solution(int a, int b) {
        String[] arr = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        LocalDate startDate = LocalDate.of(2016, 1, 1);
        LocalDate endDate = LocalDate.of(2016, a, b);

        long perioddDays = ChronoUnit.DAYS.between(startDate, endDate);
        int cnt = (int)perioddDays % 7;

        return arr[cnt];
    }
}