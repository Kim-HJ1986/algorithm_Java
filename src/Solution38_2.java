//숫자 문자열과 영단어
class Solution38_2 {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder("");
        int len = s.length();
        String[] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] alphabets = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < 10; i++) {
            // replaceAll 은 문자열 내 모든 첫번 째 값을 두번 째 값으로 바꿔준다!
            s = s.replaceAll(alphabets[i], digits[i]);
        }

        return Integer.parseInt(s);
    }
}