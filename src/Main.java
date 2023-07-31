import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        Set<Integer> S = new HashSet<>();

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            int number = 0;
            if (!method.equals("all") && !method.equals("empty"))
                number = Integer.parseInt(st.nextToken());

            if (method.equals("add")) add(S, number);
            if (method.equals("remove")) remove(S, number);
            if (method.equals("check")) check(S, number);
            if (method.equals("toggle")) toggle(S, number);
            if (method.equals("all")) {
                all(S);
//                S.stream().forEach(System.out::println);
            }
            if (method.equals("empty")) empty(S);

        }
    }

    public static Set<Integer> add(Set<Integer> set, int x) {
        set.add(x);
        return set;
    }

    public static Set<Integer> remove(Set<Integer> set, int x) {
        set.removeIf(integer -> integer == x);
        return set;
    }

    public static void check(Set<Integer> set, int x) {
        boolean chk = false;
        chk = set.stream()
                .anyMatch(integer -> integer == x);
        if (chk) System.out.println(1);
        else System.out.println(0);
    }

    public static Set<Integer> toggle(Set<Integer> set, int x) {
        boolean chk = false;
        chk = set.stream()
                .anyMatch(integer -> integer == x);
        if (chk) remove(set, x);
        else add(set, x);

        return set;
    }

    public static Set<Integer> all(Set<Integer> set) {
        for (int i = 1; i <= 20; i++) set.add(i);
        return set;
    }

    public static Set<Integer> empty(Set<Integer> set) {
        set.clear();
        return set;
    }

}