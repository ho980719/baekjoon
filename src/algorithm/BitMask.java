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
        // 원소 삭제 (4를 제거)
        System.out.println(Integer.toBinaryString(B &= ~(1 << 3)));
        // 원소 추가 (B 집합 다시 4를 추가, A 공집합에 13 추가)
        System.out.println(Integer.toBinaryString(B |= (1 << 3)));
        System.out.println(Integer.toBinaryString(A |= (1 << 12)));
        // 원소의 포함 여부 확인 (A에 4가 있냐, B에 4가 있냐)
        System.out.println((A & (1 << 3)) == (1 << 3));
        System.out.println((B & (1 << 3)) == (1 << 3));
        // 원소의 토글 (있으면 삭제, 없으면 추가) -> 12
        System.out.println(Integer.toBinaryString(A ^= (1 << 11)));
        System.out.println(Integer.toBinaryString(B ^= (1 << 11)));
    }
}
