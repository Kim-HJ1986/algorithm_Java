import java.util.HashMap;

//숫자 문자열과 영단어
class Solution38_1 {
    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(){
            {
                put("zero", 0);
                put("one", 1);
                put("two", 2);
                put("three", 3);
                put("four", 4);
                put("five", 5);
                put("six", 6);
                put("seven", 7);
                put("eight", 8);
                put("nine", 9);
            }
        };

        // 모두 분리하여 배열로 저장하고, 스트링빌더에서 숫자라면 바로 append
        // 숫자가 아니라면 하나씩 append하여 HashMap의 Key와 비교한다.
        // Key에 해당 문자열이 있다면 해당 숫자를 더해준다.
        // 2번 풀이... replaceAll을 생각못했다!
        String[] sArr = s.split("");
        StringBuilder sbToChange = new StringBuilder();
        StringBuilder answerSB = new StringBuilder();
        for(int i = 0; i<sArr.length; i++){
            if(0<=s.charAt(i)-'0' & s.charAt(i)-'0'<=9){
                answerSB.append(sArr[i]);
                continue;
            }else{
                sbToChange.append(sArr[i]);
                if(map.containsKey(sbToChange.toString())){
                    answerSB.append(map.get(sbToChange.toString()));
                    sbToChange.setLength(0);
                }
            }
        }
        return Integer.parseInt(answerSB.toString());
    }
}