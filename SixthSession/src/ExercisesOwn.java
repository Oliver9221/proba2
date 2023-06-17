import java.util.Arrays;

public class ExercisesOwn {

    /**
     * Megszámolja a tömbben található páros számok darabszámát
     * @param arr
     * @return
     */
    public static int CountEven(int[] arr) {
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    /**
     * A program olvasson be tetszőleges egész számot parancssori argumentumból, és
     * határozza meg azok összegét. Szóljon, ha ehhez nincs elég (legalább 2)
     * @param args
     * @return
     */
    public static int SumArgs(String[] args) {
        int sum = 0;
        if (args.length < 2) {
            System.out.println("Nincs elég bemenet!");
        }

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        return sum;
    }

    /**
     * A program olvasson be tetszőleges egész számot parancssori argumentumból, és határozza meg azok átlagát.
     * Szóljon, ha ehhez nincs elég (legalább 2) bemenet.
     * @param args
     * @return
     */
    public static double AverageArgs(String[] args) {
        int sum = 0;
        if (args.length < 2) {
            System.out.println("Nincs elég bemenet!");
        }

        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        return (double)sum / args.length;
    }

    /**
     * Az első feladatban készülttömb elemei közt keressünk meg az első páros szám
     * indexét. Ha nincs ilyen, adjunk vissza -1-et! (indexOfEven)
     * @param arr
     * @return
     */
    public static int IndexOfEven(int[] arr) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Készítsünk programot, ami bekér a felhasználótól egy szót, és megszámolja a benne
     * lévő magánhangzókat (elég az angol)! A számlálást függvényben oldjuk meg!
     * (countVowels)
     * @param word
     * @return
     */
    public static int CountVowels(String word) {
        int vowelCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    vowelCount++;
            }
        }
        return vowelCount;
    }

    /**
     * Készítsünk programot, ami bekér a felhasználótól egy sort, amiben szóközzel
     * elválasztottszavak vannak. A program keresse meg, melyik a leghosszabb szó, és írja is
     * ki azt! (getLongestWord)
     * @param line
     * @return
     */
    public static String GetLongestWord(String line) {
        String[] words = line.split(" ");
        String longestWord = words[0];
        for (int i = 1; i < words.length; i++) {
            if(words[i].length() > longestWord.length()){
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    /**
     * Készítsünk programot, ami bekér egy sornyi szöveget, majd azokból kiválogatja
     * a 3 karakternél hosszabbakat egy tömbbe. (getLongWords)
     * @param line
     * @return
     */
    public static String[] GetLongWords(String line) {
        String[] words = line.split(" ");
        String[] result = new String[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() > 3) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = words[i];
            }
        }
        return result;
    }

    /**
     * A program olvasson be tetszőleges egész számot parancssori argumentumból,
     * és határozza meg azok minimumát. Szóljon, ha ehhez nincs elég (legalább 2)
     * bemenet.
     * @param args
     * @return A legkisebb szám, vagy 0, ha nincs bemenet
     */
    public static int MinArgs(String[] args) {
        if(args.length < 2) {
            System.out.println("Nincs elég bemenet");
            return 0;
        }

        int min = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int actual = Integer.parseInt(args[i]);
            if (actual < min)
                min = actual;
        }
        return min;
    }

    public static double Calculate(String[] args) {
        if(args.length != 3) {
            System.out.println("Nem megfelelő számú bemenet");
            return Double.NaN;
        }

        double firstNumber = Double.parseDouble(args[0]);
        double secondNumber = Double.parseDouble(args[2]);
        char operator = args[1].charAt(0);

        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                return firstNumber / secondNumber;
            default:
                System.out.println("Ismeretlen művelet");
                return Double.NaN;
        }
    }
}
