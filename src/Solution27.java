//콜라츠 추측 5점
class Solution27 {
    public int solution(int num) {
        int cnt = 0;
        // num은 int 타입이어서 오버플로우 시 오류 발생
        long i = (long)num;
        while(i!=1){
            if(cnt>=500){
                return -1;
            }
            if(i%2==0){
                i = i/2;
                cnt += 1;
            }else if(i%2==1){
                i = (i*3)+1;
                cnt += 1;
            }
        }
        return cnt;
    }
}