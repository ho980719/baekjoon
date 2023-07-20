import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pos = "A7";
        char[] arr = new char[8];

        int[][] chess = new int[8][8];

        int index = 0;
        for (int i = 'A'; i <= 'H'; i++) {
            arr[index] = (char) i;
            index++;
        }

        int charIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pos.charAt(0))
                charIndex = i;
            System.out.print(arr[i] + " ");
        }

        Position position = new Position();
        position.x = 0 + charIndex;
        position.y = 7 - (Integer.parseInt(String.valueOf(pos.charAt(1))) - 1);

        System.out.println("[" + position.x + "," + position.y + "]");

        chess[position.y][position.x] = 1;

        int answer = 0;

        if (position.x + 2 < 8) {
            if (position.y + 1 < 8) answer++;
            if (position.y - 1 >= 0) answer++;
        }
        if (position.x - 2 >= 0) {
            if (position.y + 1 < 8) answer++;
            if (position.y - 1 >= 0) answer++;
        }
        if (position.y + 2 < 8) {
            if (position.x + 1 < 8) answer++;
            if (position.x - 1 >= 0) answer++;
        }
        if (position.y - 2 >= 0) {
            if (position.x + 1 < 8) answer++;
            if (position.x - 1 >= 0) answer++;
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(answer);
    }

    static class Position {
        int x = 0;
        int y = 0;
    }
}