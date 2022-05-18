package hanghae;

//부족한 금액 계산하기 (10점)
class Solution12 {
    public long solution(int price, int money, int count) {
        long sum = (price * ((long) count * (count+1) / 2));

        if ( sum > money){
            return sum-money;
        }else{
            return 0;
        }
    }
}