//시저 암호 9점
class Solution39 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) !=' '){
                // 만약 n을 더한 값이 기존 소,대문자의 범위를 넘어간다면 26만큼을 뺀다.(알파벳 개수)
                if ((s.charAt(i) <= 90 &  s.charAt(i) + n > 90) || s.charAt(i) + n > 122){
                    answer.append((char)(s.charAt(i) + n - 26));
                }else{
                    answer.append((char)(s.charAt(i) + n));
                }
            }else{
                answer.append(' ');
            }
        }
        return answer.toString();
    }
}