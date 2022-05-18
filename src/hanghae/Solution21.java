package hanghae;

//이상한 문자 만들기 11점
class Solution21 {
    public String solution(String s) {
        s = s.toLowerCase();

        String[] stringArray = s.split("");

        int idx = 0;
        for (int i=0; i<stringArray.length; i++){
            String a = stringArray[i];
            if ( !stringArray[i].equals(" ")){
                if (idx % 2 == 0){
                    stringArray[i] = stringArray[i].toUpperCase();
                    idx += 1;
                }else{
                    idx += 1;
                }
            }else{
                idx = 0;
            }
        }
        StringBuilder answer = new StringBuilder();
        for (String str : stringArray){
            answer.append(str);
        }
        return answer.toString();
    }
}