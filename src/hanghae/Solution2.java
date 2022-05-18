package hanghae;

//짝수와 홀수
class Solution2 {
    public String solution(int num) {
        String result = "";

//        if (num % 2 == 0){
//            result = "Even";
//        }else{
//            result = "Odd";
//        }

        // 삼항 연산자 활용
        result = (num % 2 == 0)? "Even" : "Odd";
        return result;
    }
}