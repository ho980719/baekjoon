package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        int[] test = {18, 10, 11, 13, 17};

        for (int n : bubbleSort(test))
            System.out.print(n + " ");
    }

    public static int[] bubbleSort(int[] arr) {
        // 상대적 구현 난이도 하.
        // 비효율적임
        // 데이터의 인접요소끼리 비교하고, swap 연산을 수행
        // 시간복잡도 = O(n^2)
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.err.println(j);
                int c = 0;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    c++;
                }
                if (c == 0) break;
            }
        }
        return arr;
    }
}
