package step;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step {
    public static void 함수명() throws Exception{ }
    public static void 색종이() throws Exception{
        Scanner sc = new Scanner(System.in);
        int[][] backboard = new int[100][100];
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int g = y; g < y + 10; g++) {
                    if (backboard[j][g] == 1)
                        sum++;
                    else backboard[j][g] = 1;
                }
            }
        }
        System.out.println(n * 100 - sum);
    }
    public static void 세로읽기() throws Exception{
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];

        for (int i = 0; i < 5; i++) {
            char[] chars = sc.nextLine().toCharArray();
            for(int j = 0; j < chars.length; j ++) {
                arr[i][j] = chars[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for(int j = 0; j < 5; j ++) {
                // char 공백 체크
                if (arr[j][i] != '\0') System.out.print(arr[j][i]);
            }
        }
    }

    public static void 최댓값() throws Exception{
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = 0, x = 0, y = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    x = i + 1;
                    y = j + 1;
                }
            }
        }

        System.out.println(max);
        System.out.println(x + " " + y);
    }

    public static void 행렬덧셈() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()),M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
