import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    // https://school.programmers.co.kr/learn/courses/30/lessons/150370
    public static void main(String[] args) throws Exception {
        int[] answer = {};
        int answerIndex = 0;

        List<Integer> result = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        // today string to date
        Date d = format.parse(today);
        // terms set
        Map term = new HashMap();
        for (String s : terms) {
            term.put(s.split(" ")[0], s.split(" ")[1]);
        }

        for (int i = 0; i < privacies.length; i++) {
            String insertDate = privacies[i].split(" ")[0];
            String type = privacies[i].split(" ")[1];

            Date date = format.parse(insertDate);
            Calendar c = Calendar.getInstance();
            c.setTime(date);

            c.add(Calendar.MONTH, Integer.parseInt(String.valueOf(term.get(type))));
            Date exDate = c.getTime();
            if (exDate.before(d)) {
                // 파기
                result.add(i+1);
            }
        }

        answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}