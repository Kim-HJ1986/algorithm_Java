import java.util.*;

//문자열 내 마음대로 정렬하기 4점
class Solution35_1 {
    public String[] solution(String[] strings, int n) {
        HashMap<String, Character> map = new HashMap<>();
        for (String s : strings){
            map.put(s, s.charAt(n));
        }
        // String AL에 hashmap의 keySet을 담아 Collection의 sort 사용
        List<String> listKeySet = new ArrayList<>(map.keySet());
        Collections.sort(listKeySet);
        // 두번 째 인자로 compareTo한 값을 기준으로 정렬 (val1, val2 비교)
        Collections.sort(listKeySet, (val1, val2) -> (map.get(val1).compareTo(map.get(val2))));

        String[] answer = new String[listKeySet.size()];
        for (int i=0; i<listKeySet.size(); i++){
            answer[i] = listKeySet.get(i);
        }
        return answer;
    }
}