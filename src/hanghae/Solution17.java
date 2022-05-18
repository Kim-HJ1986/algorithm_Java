package hanghae;

//문자열 다루기 기본 10점
class Solution17 {
    public boolean solution(String string) {
        boolean answer = true;
        if (string.length() == 4 || string.length() == 6){
            for(int i=0; i<string.length(); i++){
                char a = string.charAt(i);
                int b = a - '0';
                if(!(0 <= string.charAt(i) - '0' & string.charAt(i)- '0' <= 9)) {
                    answer = false;
                    break;
                }
            }
            return answer;
        }else{
            return false;
        }
    }
}