package level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Level1 {
    public static void OX퀴즈() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int testCaseCount = Integer.parseInt(st.nextToken());

        List<String> list = new ArrayList<>();
        for (int i = 0; i < testCaseCount; i ++) {
            st = new StringTokenizer(br.readLine());
            list.add(st.nextToken());
        }

        for (String str : list) {
            int score = 0;
            int temp = 0;
            char[] c = str.toCharArray();

            for (int i = 0; i < c.length; i ++) {
                if (String.valueOf(c[i]).equals("O")) {
                    temp ++;
                } else {
                    temp = 0;
                }
                score = score + temp;
            }

            System.out.println(score);
        }
    }

    public static void 나머지() throws Exception{
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            arr.add(sc.nextInt());
        }

        List<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arr.size(); i ++) {
            int n = arr.get(i) % 42;
            if (!arr2.contains(n)) {
                arr2.add(n);
            }
        }

        System.out.println(arr2.size());
    }

    public static void 음계() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        int index = 0;
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index ++;
        }

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {8,7,6,5,4,3,2,1};

        if (Arrays.equals(arr, arr1)) {
            System.out.print("ascending");
        } else if (Arrays.equals(arr, arr2)) {
            System.out.print("descending");
        } else {
            System.out.print("mixed");
        }
    }

    public static void 알람시계() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        if (m - 45 < 0) {
            if (h == 0) {
                h = 23;
            } else {
                h = h - 1;
            }
            m = 60 - ((m - 45) * -1);
        } else {
            m = m - 45;
        }

        System.out.println(String.format("%s %s", h, m));
    }

    public static void 윤년() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }

    public static void n찍기() throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.println(i);
        }
    }

    public static void 구구단() throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < 10; i ++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void 문자열반복() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int testCaseCount = Integer.parseInt(st.nextToken());

        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < testCaseCount; i ++) {
            st = new StringTokenizer(br.readLine());
            Map<String, String> map = new HashMap<>();
            map.put("count", st.nextToken());
            map.put("str", st.nextToken());

            list.add(map);
        }

        for (int i = 0; i < list.size(); i ++) {
            StringBuilder sb = new StringBuilder();
            // {A,B,C}
            char[] arr = list.get(i).get("str").toCharArray();
            for (int ii = 0; ii < arr.length; ii ++) {
                for (int j = 0; j < Integer.parseInt(list.get(i).get("count")) ; j ++) {
                    sb.append(arr[ii]);
                }
            }

            System.out.println(sb);
        }
    }

    public static void 숫자의개수() throws Exception{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int d = a * b * c;

        char[] arr = String.valueOf(d).toCharArray();
        int[] arr2 = new int[10];
        for (int i = 0; i < 10; i ++) {
            for (int j = 0; j < arr.length; j ++) {
                if (Integer.parseInt(String.valueOf(arr[j])) == i) {
                    arr2[i] = arr2[i] + 1;
                    // arr2[count] ++
                }
            }

            System.out.println(arr2[i]);
        }
    }

    public static void 최댓값() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i ++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = 0, count = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (max < arr[i]) {
                max = arr[i];
                count = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }

    public static void 검증수() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken())
                , b = Integer.parseInt(st.nextToken())
                , c = Integer.parseInt(st.nextToken())
                , d = Integer.parseInt(st.nextToken())
                , e = Integer.parseInt(st.nextToken())
                , f = 0;

        f = ((a * a) + (b * b) + (c * c) + (d * d) + (e * e)) % 10;
        System.out.println(f);
    }

    public static void 별찍기2() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < a - i - 1; j ++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void 별찍기1() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        for (int i = 0; i < a; i ++) {
            for (int j = 0; j < i + 1; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void 나누기() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
        System.out.printf(String.valueOf(a / b));
    }

    public static void 두수비교() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

        if (a > b) {
            System.out.printf(">");
        } else if (a < b) {
            System.out.printf("<");
        } else {
            System.out.printf("==");
        }
    }

    public static void 문자카운트(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] arr1 = st.nextToken().toCharArray();
        char[] arr2 = new char[26];
        int[] arr3 = new int[26];
        int index = 0;

        // 1. 문자 낱말 기록
        for (int i = 0; i < arr1.length; i++) {
            if (!contains(arr2, Character.toLowerCase(arr1[i]))) {
                arr2[index] = Character.toLowerCase(arr1[i]);
                index++;
            }
        }
        // 2. 낱말 별 카운트 기록
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (Character.toLowerCase(arr1[j]) == arr2[i]) {
                    arr3[i] = arr3[i] + 1;
                }
            }
        }

        // 3. 가장 큰 수의 index 및 char 찾기
        int max = 0, maxIndex = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (max < arr3[i]) {
                maxIndex = i;
                max = arr3[i];
            }
        }

        // 4-1. 가장 큰 수가 여러개 있을시 -1 출력
        int count = 0;
        for (int cnt : arr3) {
            if (cnt == max) {
                count++;
            }
        }
        if (count > 1) {
            System.out.println("?");
        } else {
            // 4-2. maxIndex로 char배열 조회 및 대문자 변환
            System.out.println(Character.toUpperCase(arr2[maxIndex]));
        }
    }

    public static boolean contains(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
