package hanghae;

import java.util.ArrayList;
import java.util.Collections;

//두 개 뽑아서 더하기
class Solution32 {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> ans_AL = new ArrayList<>();
        for (int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                // 이중 반복문에서 자기자신을 더하는 것과 이미 저장된 값은 넘어가기
                if(i!=j & !ans_AL.contains(numbers[i]+numbers[j])){
                    ans_AL.add(numbers[i]+numbers[j]);
                }
            }
        }
        Collections.sort(ans_AL);
        // 배열 선언해서 넣어주기.. ( 배열에서 ArrayList로 변형하는 방법 공부하기)
//        int[] ans_arr = new int[ans_AL.size()];
//        for(int i=0; i< ans_arr.length; i++){
//            ans_arr[i] = ans_AL.get(i);
//        }
        return ans_AL.stream().mapToInt(i->i).toArray();
    }
}