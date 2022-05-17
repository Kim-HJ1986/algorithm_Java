import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//문자열 내 마음대로 정렬하기 4점
class Solution35_2 {
    public String[] solution(String[] strings, int n) {
        HashMap<String, Character> map = new HashMap<>();
        for (String s : strings){
            map.put(s, s.charAt(n));
        }
        // Map의 Entry ArrayList를 생성하여 entrySet을 넣어줌
        List<Map.Entry<String, Character>> entryList = new ArrayList<>(map.entrySet());
        
        // Map.Entry의 comparingBy~ 메서드 사용하여 정렬
        entryList.sort(Map.Entry.comparingByKey());
        entryList.sort(Map.Entry.comparingByValue());

        String[] answer = new String[entryList.size()];
        for (int i=0; i<entryList.size(); i++){
            answer[i] = entryList.get(i).getKey();
        }
        return answer;
    }
}