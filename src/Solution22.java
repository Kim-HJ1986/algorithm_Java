//자릿수 더하기
class Solution22 {
    public int solution(int n) {
        String strN = Integer.toString(n);
        int ans = 0;
        for(int i=0; i<strN.length(); i++){
            // character '0' 빼주며 int로 형변환
            ans += (strN.charAt(i) - '0');
        }
        return ans;
    }
}