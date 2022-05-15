//문자열 내 p와 y의 개수 4점
class Solution16 {
    boolean solution(String string) {
        string = string.toUpperCase();
        if (string.contains("P") || string.contains("Y")){
            int pCnt=0;
            int yCnt=0;
            for(int i=0; i<string.length(); i++){
                if (string.charAt(i) == 'P'){
                    pCnt+=1;
                }else if(string.charAt(i) == 'Y'){
                    yCnt+=1;
                }
            }
            if ( pCnt == yCnt ){
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}