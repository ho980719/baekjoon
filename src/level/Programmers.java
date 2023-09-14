package level;

public class Programmers {
    public static void main(String[] args) {
        System.out.println(Solution.solution(34, 3));
    }

    public static int n의배수(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}

class Solution {
    public static int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}
