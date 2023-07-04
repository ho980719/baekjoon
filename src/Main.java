import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Map> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (!grade.equals("P")) {
                Map map = new HashMap();
                map.put("subject", subject);
                map.put("score", score);
                map.put("grade", grade);
                list.add(map);
            }
        }

        double total = 0;
        double total2 = 0;
        for (Map map : list) {
            double score = Double.parseDouble(String.valueOf(map.get("score")));
            total2 += score;
            if (map.get("grade").equals("A+")) score *= 4.5;
            else if (map.get("grade").equals("A0")) score *= 4;
            else if (map.get("grade").equals("B+")) score *= 3.5;
            else if (map.get("grade").equals("B0")) score *= 3;
            else if (map.get("grade").equals("C+")) score *= 2.5;
            else if (map.get("grade").equals("C0")) score *= 2;
            else if (map.get("grade").equals("D+")) score *= 1.5;
            else if (map.get("grade").equals("D0")) score *= 1;
            else if (map.get("grade").equals("F")) score *= 0;

            total += score;
        }
        System.out.println(total / total2);
    }
}