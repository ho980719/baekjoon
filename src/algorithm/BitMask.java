package algorithm;

public class BitMask {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(5));
        // 공집합 A = 0
        int A = 0;
        System.out.println(A);
        // 꽉 찬 집합 (1 ~ 20)
        int B = (1 << 20) - 1;
        System.out.println(B);
        System.out.println(Integer.toBinaryString(B));
        // 원소 추가
    }
}
