
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
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

    public static int binarySearch(int[] arr, int start, int end, int target) {
        // 1 10 7
        if (start > end) return 0;
        int mid = (start + end) / 2;

        if (arr[mid] > target) return binarySearch(arr, start, mid - 1, target);
        if (arr[mid] < target) return binarySearch(arr, mid + 1, end, target);
        else return 1 + binarySearch(arr, start, mid - 1, target) + binarySearch(arr, mid + 1, end, target);
    }
}