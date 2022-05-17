import java.util.Arrays;

//로또의 최고 순위와 최저 순위 3점
class Solution33 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        int[] answer = new int[2];
        int zeroCnt = 0;
        int correct = 0;

        for ( int j : lottos){
            if(j==0){
                zeroCnt += 1;
            }else{
                int correctCnt = (int)Arrays.stream(win_nums).filter(i -> i==j).count();
                correct += correctCnt;
            }

        }
        answer[0] = rank[zeroCnt + correct];
        answer[1] = rank[correct];

        return answer;
    }
}