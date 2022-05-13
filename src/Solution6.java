//없는 숫자 더하기
import java.util.Arrays;
class Solution6 {
    public int solution(int[] numbers) {
        // 전체 배열은 0~9로 이루어진 고정 값이어서 합인 45를 활용
        int answer=45;
        // forEach는 주석처리
        // for(int number : numbers){
        //     answer -= number;
        // }

        // 배웠던 stream() 을 활용하여 답안 작성!
        return answer - Arrays.stream(numbers).sum();
    }
}