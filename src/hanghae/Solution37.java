package hanghae;

//소수 만들기 4점
class Solution37 {
    public boolean primeCheck (int num){
        boolean result = true;
        for (int t = 2; t < Math.pow(num, 0.5)+1; t++){
            if(num%t==0){
                result = false;
            }
        }
        return result;
    }
    public int solution(int[] nums) {
        int cnt = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(primeCheck(nums[i] + nums[j] + nums[k])){
                        cnt += 1;
                    }
                }
            }
        }
        return cnt;
    }
}