import java.util.Arrays;

//평균 구하기
class Solution8 {
    public double solution(int[] arr) {
        int sum = Arrays.stream(arr).sum();
        int count = arr.length;

        return (double) sum / count;
    }
}