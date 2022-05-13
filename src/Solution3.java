//가운데 글자 가져오기
class Solution3 {
    public String solution(String s) {
        if (s.length() % 2 != 0){
            int cnt = (s.length() / 2);
            return Character.toString(s.charAt(cnt));
        }else {
            int cnt = (s.length() / 2);
            return Character.toString(s.charAt(cnt-1)) + Character.toString(s.charAt(cnt));
        }
    }
}
