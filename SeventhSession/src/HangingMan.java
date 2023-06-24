import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HangingMan {

    public static String GetWord() {
        String[] words = new String[]{"cica", "kutya", "almafa", "macskakaparó"};
        int randomIndex = ThreadLocalRandom.current().nextInt(0, words.length);
        return words[randomIndex];
    }

    public static char[] GetEmptyCharacters(String word) {
        char[] res = new char[word.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = '_';
        }
        return res;
    }

    public static void PrintGame(int life, char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Életek száma: " + life);
    }

    public static boolean IsSolved(char[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (guessed[i] == '_')
                return false;
        }

        return true;
    }

    public static boolean MakeAGuess(String word, char guess, char[] guessed) {
        boolean contains = false;
        for (int i = 0; i < word.length(); i++) {       // Végigmegyünk a szón
            if (word.charAt(i) == guess) {              // Ha megtaláljuk a tippelt karaktert
                guessed[i] = word.charAt(i);            // A karaktertömbbe beírjuk
                contains = true;
            }
        }
        return contains;
    }

    public static void Game() {
        String word = GetWord();
        char[] guessed = GetEmptyCharacters(word);
        int life = word.length() / 2;
        System.out.println("Üdvözöllek!");
        PrintGame(life, guessed);
        Scanner sc = new Scanner(System.in);

        while (life > 0 && !IsSolved(guessed)) {
            System.out.println("Add meg a tippelt karaktert!");
            char guess = sc.nextLine().charAt(0);
            if (!MakeAGuess(word, guess, guessed)) {
                System.out.println("Nem talált!");
                life--;
            }
            PrintGame(life, guessed);
        }

        if (life == 0) {
            System.out.println("Veszítettél, a szó ez volt: " + word);
        } else {
            System.out.println("Gratulálok, nyertél!");
        }
    }
}
