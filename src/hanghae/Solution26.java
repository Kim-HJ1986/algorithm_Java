package hanghae;

import java.util.Arrays;

//제일 작은 수 제거하기 6점
class Solution26 {
    public int[] solution(int[] arr) {
        int min_value = Arrays.stream(arr).sorted().findFirst().getAsInt();
        int[] answer = Arrays.stream(arr).filter(val -> val != min_value).toArray();
        if (answer.length == 0){
            return new int[]{-1};
        }else{
            return answer;
        }
    }
}