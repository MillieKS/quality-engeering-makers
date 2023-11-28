import java.util.HashMap;

public class ScrabbleScore {
    static HashMap<Character, Integer> letterValues = new HashMap<>();

    static {
        letterValues.put('A', 1);
        letterValues.put('E', 1);
        letterValues.put('I', 1);
        letterValues.put('O', 1);
        letterValues.put('U', 1);
        letterValues.put('L', 1);
        letterValues.put('N', 1);
        letterValues.put('S', 1);
        letterValues.put('T', 1);
        letterValues.put('R', 1);

        letterValues.put('D', 2);
        letterValues.put('G', 2);

        letterValues.put('B', 3);
        letterValues.put('C', 3);
        letterValues.put('M', 3);
        letterValues.put('P', 3);

        letterValues.put('F', 4);
        letterValues.put('H', 4);
        letterValues.put('V', 4);
        letterValues.put('W', 4);
        letterValues.put('Y', 4);

        letterValues.put('K', 5);

        letterValues.put('J', 6);
        letterValues.put('X', 6);

        letterValues.put('J', 8);
        letterValues.put('X', 8);

        letterValues.put('Q', 10);
        letterValues.put('Z', 10);
    }

    public static int calculate(String word) {
        int totalScore = 0;

        word = word.toUpperCase();

        for (Integer i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (letterValues.containsKey(letter)) {
                totalScore += letterValues.get(letter);
            }
        }

        return totalScore;
    }

    public static void main(String[] args) {
        Integer score = calculate("EXQUISITELY");
        System.out.println("Scrabble score: " + score);
    }




}


// 1 point - A, E, I, O, U, L, N, S, T, R
// 2 points - D, G
// 3 points - B, C, M, P
// 4 points - F, H, V, W, Y
// 5 points - K
// 8 points - J, X
// 10 points - Q, Z