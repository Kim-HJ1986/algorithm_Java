import java.util.ArrayList;
import java.util.Comparator;

//나누어 떨어지는 숫자 배열
class Solution14 {
    public int[] solution(int[] arr, int divisor) {
        // 나누어 떨어지는 값들만 넣어줄 arrayList 생성
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a : arr){
            if (a % divisor == 0){
                arrayList.add(a);
            }
        }
        // arrayList 내장 정렬 함수 사용
        arrayList.sort(Comparator.naturalOrder());
        // arrayList 크기에 따라 리턴 배열에 담아줌
        if (arrayList.size() == 0){
            return new int[]{-1};
        }else{
            int[] answer = new int[arrayList.size()];
            for (int i=0; i < answer.length; i++){
                answer[i] = arrayList.get(i);
            }
            return answer;

        }
//        람다로도 표현했으나 시간이 훨씬 오래걸렸다..
//        int[] answer = Arrays.stream(arr)
//                .filter(a -> a % divisor == 0).toArray();
//        if (answer.length == 0){
//            return new int[]{-1};
//        }else{
//            Arrays.sort(answer);
//            return answer;
//        }
    }
}