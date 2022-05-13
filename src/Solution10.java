//행렬의 덧셈
class Solution10 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 답을 저장할 이중 배열 생성(사이즈까지)
        int[][] ans = new int[arr1.length][arr1[0].length];
        // 이중 반복문으로 행렬의 덧셈 구현
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                ans[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return ans;
    }
}