package hanghae;

//핸드폰 번호 가리기
class Solution9 {
    public String solution(String phone_number) {
        String after = phone_number.substring(phone_number.length()-4);
        String before = "";
        for (int i=0; i < (phone_number.length()-4); i++){
            before += "*";
        }
        return before + after;
    }
}