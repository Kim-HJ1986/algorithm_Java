package hanghae;

import java.util.ArrayList;
import java.util.Collections;

//문자열 내림차순으로 배치하기
class Solution36 {
    public String solution(String s) {
        // 문자열 character로 형변환하여 담아주고, 그대로 내림차순 정렬하기 (아스키코드 테이블)
        ArrayList<Character> charAL = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            charAL.add(s.charAt(i));
        }
        Collections.sort(charAL, Collections.reverseOrder());
        //Collections.reverse(charAL);

        StringBuilder answer = new StringBuilder();
        for(char x : charAL){
            answer.append(x);
        }
        return answer.toString();
    }
}