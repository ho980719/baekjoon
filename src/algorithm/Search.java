package algorithm;

public class Search {
    public static void main(String[] args) throws Exception {
        // 1 ~ 100까지의 배열
        int[] arr = new int[100];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = count;
            count++;
        }

        // 68을 찾고싶음
        BinarySearch.binarySearch(arr, 68);
    }
}

class BinarySearch {
    /*
        이분 탐색

        정렬된 배열 안에서 특정 원소를 찾을 때 인덱스 i부터 j의 중간값과 비교
        중간값이 찾는 원소가 아니라면 인덱스 i와 j 다시 정해줌
        인덱스 i와 j를 정할 때 마다 탐색 범위 반으로 줄어듦
     */
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

    public static boolean BSearchRecursive(int[] arr, int n, int left, int right) {
        if (left > right) return false;

        int mid = (left + right) / 2;

        if (arr[mid] < n)
            return BSearchRecursive(arr, n, mid + 1, right);
        else if (arr[mid] > n)
            return BSearchRecursive(arr, n, left, mid - 1);
        else
            return true;
    }

}