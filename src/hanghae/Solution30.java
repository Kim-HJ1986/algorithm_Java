package hanghae;

import java.util.ArrayList;
import java.util.Collections;

//최소 직사각형
class Solution30 {
    public int solution(int[][] sizes) {
        ArrayList<Integer> max_array = new ArrayList<>();
        ArrayList<Integer> min_array = new ArrayList<>();

        int sizeOfSizes = sizes.length;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                max_array.add(sizes[i][0]);
                min_array.add(sizes[i][1]);
            }else{
                max_array.add(sizes[i][1]);
                min_array.add(sizes[i][0]);
            }
        }
        return Collections.max(max_array) * Collections.max(min_array);
    }
}