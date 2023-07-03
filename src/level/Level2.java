package level;

import java.util.Arrays;
import java.util.Scanner;

public class Level2 {
    public static void 함수명() throws Exception{ }

    public static void 버블정렬() throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {          // 1.
            for (int j = 1; j < arr.length - i; j++) {  // 2.
                if (arr[j - 1] > arr[j]) {              // 3.
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void 수찾기2() throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2= new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // arr sorting
        Arrays.sort(arr1);

        int[] result = new int[m];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(binarySearch(arr1, 0, arr1.length - 1, arr2[i]));
        }
    }

    // 재귀
    public static int binarySearch(int[] arr, int start, int end, int target) {
        // 1 10 7
        if (start > end) return 0;
        int mid = (start + end) / 2;

        if (arr[mid] > target) return binarySearch(arr, start, mid - 1, target);
        if (arr[mid] < target) return binarySearch(arr, mid + 1, end, target);
        else return 1 + binarySearch(arr, start, mid - 1, target) + binarySearch(arr, mid + 1, end, target);
    }

    public static void 수찾기() throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();

        // 정렬
        Arrays.sort(arr1);

        int m = sc.nextInt();
        // 이진 탐색
        for (int i = 0; i < m; i++) {
            if (binarySearch(arr1, sc.nextInt())) System.out.println(1);
            else System.out.println(0);
        }

        // 완전 탐색(브루트 포스) 시간초과
        /*for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            boolean result = false;
            for (int j = 0; j < arr1.length; j++) {
                if (x == arr1[j]) {
                    result = true;
                }
            }

            if (result) System.out.println(1);
            else System.out.println(0);
        }*/
    }

    public static boolean binarySearch(int[] arr, int n) {
        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] < n) left = mid + 1;
            else if (arr[mid] > n) right = mid - 1;
            else return true;
        }
        return false;
    }

    public static void 수학은비대면강의입니다() throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt(), e = sc.nextInt(), f = sc.nextInt();

        for (int x = -999; x <= 999; x++) {
            for (int y = -999; y <= 999; y++) {
                if (((a * x) + (b * y) == c) && ((d * x) + (e * y) == f)) {
                    System.out.println(x + " " + y);
                }
            }
        }
    }

    public static void 분해합() throws Exception {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        // 미지수
        int x = Integer.parseInt(n);
        // 미지수의 자릿수
        int digits = n.length();
        // 미지수의 비교 최소 값
        int y = 1;
        for (int i = 1; i < digits; i++)
            y = y * 10;
        // 생성자 배열
        int[] arr;

        int min = 1000001;
        // 생성자 구하기
        for (int i = x; i >= 1; i--) {
            // 배열 초기화
            if (constructorCheck(i, x)) {
                if (i < min) {
                    min = i;
                }
            }
        }

        if (min == 1000001) {
            System.out.print(0);
        } else {
            System.out.print(min);
        }
    }

    public static void 블랙잭() throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), z = 0;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n && j != i; j++) {
                for (int k = 0; k < n && k != j; k++) {
                    z = arr[i] + arr[j] + arr[k];
                    if (z <= m && x < z)
                        x = z;
                }
            }

        }
        System.out.println(x);
    }

    public static boolean constructorCheck(int i, int target) {
        int result = 0;
        int disits = Integer.toString(i).length();

        int[] arr = new int[disits + 1];
        for (int j = 0; j < disits; j++) {
            // 자리수 배열 주입
            arr[j] = Integer.toString(i).charAt(j) - '0';
            if (j + 1 == disits) {
                // 마지막 배열엔 현재 수 주입
                arr[arr.length - 1] = i;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            result += arr[j];
        }

        if (result == target) {
            return true;
        } else {
            return false;
        }
    }
}
