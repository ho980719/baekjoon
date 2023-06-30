package level;

import java.util.Scanner;

public class Level2 {
    public static void 함수명() throws Exception{ }

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
