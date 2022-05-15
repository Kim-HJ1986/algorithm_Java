import java.util.Arrays;

//완주하지 못한 선수 8점 (복습)!
class Solution20 {
    public String solution(String[] participant, String[] completion) {
        // 정렬 후 차례차례 비교
        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        for (idx = 0; idx < completion.length; idx++) {
            if (!participant[idx].equals(completion[idx])) {
                break;
            }
        }
        return participant[idx];


        //HashMap() 사용코드 공부!
//        String answer = "";
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String player : participant) map.put(player, map.getOrDefault(player, 0) + 1);
//        for (String player : completion) map.put(player, map.get(player) - 1);
//        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();
//        while (iter.hasNext()) {
//            Map.Entry<String, Integer> entry = iter.next();
//            if (entry.getValue() != 0) { //완주하지 못한 사람은 값이 1이다.
//                answer = entry.getKey();
//                break;
//            }
//        }
//        return answer;


    }
}