import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        int[] arr = {2, 1, 4, 3, 5};

        int a = 1, b = 4;
        for (int i = a; i < b; i++) {
            for (int j = i - 1; j < b - 1; j++) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            }
        }

/*        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j++) {
                for (int k = j; k < b; k++) {
                    int temp = arr[k - 1];
                    arr[k - 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }*/

        for (int i : arr)
            System.out.println(i + " ");
    }
}