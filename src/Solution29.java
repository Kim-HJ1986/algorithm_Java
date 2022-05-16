//3진법 뒤집기
class Solution29 {
    public int solution(int n) {
        String ternary = "";
        // 3진법으로 변환 (3으로 반복하여 나눠준 나머지 문자열에 이어붙이기)
        while(n > 0){
            ternary = (n % 3) + ternary;
            n /= 3;
        }
        // 3진법 뒤집어 String으로 저장하기
        // 13번 줄의 우항 ternary를 앞에서 더해주면 reverse()할 필요가 없지만, 학습중이니 모두 활용!
        StringBuilder reverseTernary = new StringBuilder();
        reverseTernary.append(ternary).reverse();
        String strReverseTernary = reverseTernary.toString();

        // 다시 10진법으로 바꿔주기 각 자릿수 곱하기 3^i
        // Integer.parseInt(x,y) 에서 y자리는 radix(진법)으로 y진법으로 표현된 x를 10진법 값으로 리턴해준다!
        int answer = 0;
        for (int i = 0; i < strReverseTernary.length(); i++){
            answer += (strReverseTernary.charAt(strReverseTernary.length()-i-1)-'0') * Math.pow(3, i);
        }
        return answer;
    }
}