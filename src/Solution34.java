import java.util.Collections;
import java.util.HashMap;

//모의고사 4점
class Solution34 {
    public int[] solution(int[] answers) {
        // 각 학생 별 반복 패턴을 저장
        int[] pattern1 = {1,2,3,4,5};
        int[] pattern2 = {2,1,2,3,2,4,2,5};
        int[] pattern3 = {3,3,1,1,2,2,4,4,5,5};
        
        // 학생 별 정답 개수
        int pattern1Ans = 0;
        int pattern2Ans = 0;
        int pattern3Ans = 0;

        for (int i=0; i<answers.length; i++){
            // 패턴의 길이로 나눈 나머지로 패턴 값과 answers 값 비교
            if(answers[i] == pattern1[i%pattern1.length]){
                pattern1Ans += 1;
            }if(answers[i] == pattern2[i%pattern2.length]){
                pattern2Ans += 1;
            }if(answers[i] == pattern3[i%pattern3.length]){
                pattern3Ans += 1;
            }
        }
        // HashMap에 key-value로 넣어서 max값인 key들을 담은 Array 리턴
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,pattern1Ans);
        map.put(2,pattern2Ans);
        map.put(3,pattern3Ans);
        int max = Collections.max(map.values());
        int[] answer = map.entrySet().stream().filter(i->i.getValue() == max).mapToInt(i -> i.getKey()).toArray();
        return answer;
    }
}