import java.util.stream.Stream;

//하샤드 수
class Solution28 {
    public boolean solution(int x) {
        int sum = Stream.of(String.valueOf(x).split(""))
                .mapToInt(Integer::parseInt).reduce(0, Integer::sum);

        if(x % sum == 0){
            return true;
        }else{
            return false;
        }

//        String strX = Integer.toString(x);
//        String[] arrX = String.valueOf(strX).split("");
//        int sumX = Arrays.stream(arrX).map(it -> {
//            return Integer.parseInt(it);
//        }).reduce(0, Integer::sum);
//
//        if(x % sumX == 0){
//            return true;
//        }else{
//            return false;
//        }
    }
}