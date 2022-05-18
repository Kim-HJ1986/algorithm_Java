package hanghae;

import java.util.Scanner;

//직사각형 별찍기
class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String result = "";

        for (int j = 0; j < n; j++){
            result += "*";
        }

        for (int i = 0; i < m; i++){
            System.out.println(result);
        }
    }
}