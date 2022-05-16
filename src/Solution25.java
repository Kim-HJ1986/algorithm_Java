//정수 제곱근 판별 5점
class Solution25 {
    public long solution(long n) {
        double result = Math.sqrt(n);

        if(result == (int)result){
            return (long)Math.pow(result+1,2);
        }else{
         return -1;
        }
    }
}