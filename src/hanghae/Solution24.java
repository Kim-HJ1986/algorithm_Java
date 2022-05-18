package hanghae;

import java.util.Arrays;

//정수 내림차순으로 배치하기
class Solution24 {
    public long solution(long n) {
        String[] strList = String.valueOf(n).split("");
        Arrays.sort(strList);

        StringBuilder sb = new StringBuilder();
        for(String num : strList){
            sb.append(num);
        }
        return Long.parseLong(sb.reverse().toString());

//        String longToStr = Long.toString(n);
//        int longCnt = longToStr.length();
//        int[] ansArray = new int[longCnt];
//
//        for(int i=0; i<ansArray.length; i++){
//            int maxNum = 0;
//            for(int j=0; j<longCnt; j++){
//                if(longToStr.charAt(j) - '0' >= maxNum){
//                    maxNum = longToStr.charAt(j) - '0';
//                }
//            }
//            ansArray[i] = maxNum;
//            longToStr = longToStr.replaceFirst(Integer.toString(maxNum), "");
//            longCnt = longToStr.length();
//        }
//        StringBuilder answer = new StringBuilder();
//        for(int k = 0; k<ansArray.length; k++){
//            answer.append(ansArray[k]);
//        }
//        return Long.parseLong(answer.toString());
    }
}