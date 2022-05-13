//두 정수 사이의 합
class Solution4 {
    public long solution(int a, int b) {
        long ans = 0;
        if(a < b ){
            for(int i = a; i < b+1; i ++){
                ans += i;
            }
            return ans;
        } else if (a==b) {
            return a;
        }else{
            for(int i = b; i < a+1; i ++){
                ans += i;
            }
            return ans;
        }
    }
}