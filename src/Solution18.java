//서울에서 김서방 찾기
class Solution18 {
    public String solution(String[] seoul) {
        for(int i=0; i<seoul.length; i++){
            // Java에서 String 비교는 ==이 아닌 equals로 해야함.
            if(seoul[i].equals("Kim")){
                // return시 메서드 호출한 곳에 값이 보내짐 (즉, 뒤의 값들은 체크 안함)
                return "김서방은 " + i + "에 있다";
            }
        }
        return null;
    }
}