import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
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



       /* for (int i = 0; i < n ; i++) {
            // 5, 4, 3, 2, 1
            for (int j = i; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    System.out.println("c! " + arr[j] + " " + arr[j + 1]);
                }
                count++;
            }
        }*/

        for (int i : arr) {
            System.out.println(i);
        }
    }

}