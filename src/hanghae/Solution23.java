package hanghae;

//자연수 뒤집기 4점
class Solution23 {
    public int[] solution(long n) {
        String strLong = Long.toString(n);
        int lenOfStrLong = strLong.length();
        int[] answer = new int[lenOfStrLong];

        for(int i = 0; i<lenOfStrLong; i++){
            answer[i] = (strLong.charAt(lenOfStrLong-1-i)-'0');
        }
        return answer;
    }
}