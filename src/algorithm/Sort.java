package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) throws Exception {
        int[] test = {18, 10, 11, 13, 17};

        // 선택정렬
//        for (int n : selectSort(test, 0))
//            System.out.print(n + " ");
        quickSort(test, 0, test.length - 2, test.length - 1);
        System.out.println();


    }

    public static int[] quickSort(int[] arr, int start, int end, int pivot) {
        // 상대적 구현 난이도 어려움.
        // 시간복잡도 = O(nlogn), 최악의 경우 O(n^2)
        // 기준값(pivot)을 선정, 해당 값보다 작은 데이터와 큰 데이터로 분류, 반복 정렬
        // 기준값이 어떻게 선정되는지에 따라 시간 복잡도에 많은 영향을 준다.

        // start 값이 pivot 보다 클경우 우측으로 정렬
        if (arr[pivot] < arr[start]) {
            quickSort(arr, start + 1, end, pivot);
        }
        // end 값이 pivot 보다 작을경우 좌측으로 정렬
        if (pivot > end) {
            quickSort(arr, start, end - 1, pivot);
        }
        // start 값이 pivot 보다 크고, end 값이 pivot 보다 작을경우 swap

        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        // 상대적 구현 난이도 하.
        // 비효율적임
        // 데이터의 인접요소끼리 비교하고, swap 연산을 수행
        // 시간복잡도 = O(n^2)
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
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

    public static int[] selectSort(int[] arr, int order) {
        // 상대적 구현 난이도 어려움.
        // 비효율적임
        // 시간복잡도 = O(n^2)
        // 원리는 매우 간단

        // 1. 탐색 범위 지정
        // 2. 최솟값 또는 최댓값을 찾고 남은 정렬부분의 가장 앞에 있는 데이터와 swap

        if (order == 0) {
            // 내림차순
            for (int i = 0; i < arr.length; i++) {
                int max = Integer.MIN_VALUE;
                int maxIndex = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] > max) {
                        max = arr[j];
                        maxIndex = j;
                    }

                    if (j == arr.length - 1) {
                        int temp = arr[i];
                        arr[i] = arr[maxIndex];
                        arr[maxIndex] = temp;
                    }
                }
            }
        } else if (order == 1) {
            // 오름차순
            for (int i = 0; i < arr.length; i++) {
                int min = Integer.MAX_VALUE;
                int minIndex = 0;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j] < min) {
                        min = arr[j];
                        minIndex = j;
                    }

                    if (j == arr.length - 1) {
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
