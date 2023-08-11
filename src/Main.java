import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = Solution.solution(4, new int[]{1, 5, 2}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        for (int i : array)
            System.err.print(i + " ");
    }
}

class Solution {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0], b = slicer[1], c = slicer[2];
        int[] answer = {};
        if (n == 1)
            answer = arraySlice(0, b, num_list);
        else if (n == 2)
            answer = arraySlice(a, num_list.length - 1, num_list);
        else if (n == 3)
            answer = arraySlice(a, b, num_list);
        else if (n == 4)
            answer = arraySlice(a, b, c, num_list);

        return answer;
    }

    public static int[] arraySlice(int start, int end, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(num_list[i]);
        }

        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }

    public static int[] arraySlice(int start, int end, int interval, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int testing = interval;
        for (int i = start; i <= end; i++) {
            if (testing == interval) {
                list.add(num_list[i]);
            } else if (testing == 1) {
                testing = interval;
                continue;
            }

            testing--;
        }
        int[] array = list.stream().mapToInt(i -> i).toArray();
        return array;
    }
}