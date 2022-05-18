package hanghae;

//신규 아이디 추천 4점 -> 정규식 공부할 겸 정규식 코드 적극 복붙했습니다!! 정리 필수!
class Solution40 {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        // 2단계: 대괄호 뒤의 ^ 는 not을 의미한다. 따라서 이거 빼고 다! 라는 뜻
        new_id = new_id.replaceAll("[^a-z0-9\\-_.]*", "");
        // 3단계: {}는 횟수 또는 범위를 나타낸다. 여기에선 .이 2번이상 쓰인 것을 가리킨다.
        new_id = new_id.replaceAll("\\.{2,}", ".");
        // 4단계: ^는 문자의 시작 $는 문자의 끝 |는 or 연산 따라서 시작이. 이거나 끝이. 인것
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        // 5단계: 빈문자열이라면 "a"를 넣어준다.
        if (new_id.equals("")){
            new_id =  "a";
        }

        // 6단계: 16자 이상이라면 15자 까지 substring하고 만약 끝이 .이라면 제거하기.
        if (new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            new_id = new_id.replaceAll("[.]$", "");
        }else if(new_id.length() <= 2){
            // 7단계: 길이가 2자 이하라면 마지막 문자를 길이가 3이 될 때 까지 반복하여 붙여준다.
            while (new_id.length() != 3){
                new_id = new_id.concat(Character.toString(new_id.charAt(new_id.length()-1)));
            }
        }
        return new_id;
    }
}