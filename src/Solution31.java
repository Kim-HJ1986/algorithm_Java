import java.util.ArrayList;

//같은 숫자는 싫어 4점
class Solution31 {
    public int[] solution(int []arr) {
        int check = -1;
        int[] answer_arr = {};
        // 정답 배열의 크기를 몰라 ArrayList 사용..
        ArrayList<Integer> answer_AL = new ArrayList<>();
        for(int value : arr){
            if(value != check){
                answer_AL.add(value);
                check = value;
            }else{
                check = value;
            }
        }
        // ArrayList -> Array...
        answer_arr = new int[answer_AL.size()];
        for(int i=0; i<answer_AL.size(); i++){
            answer_arr[i] = answer_AL.get(i);
        }
        return answer_arr;
    }
}