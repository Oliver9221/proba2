import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Terminal.PrintLn("Cica kutya", Terminal.RED);
        //int[] arr = new int[]{5, 1, 6, 2, 4, 8};
//        int[] arr = GetRandomArray(50000);
//
////        System.out.println("Rendezendő tömb: " + Arrays.toString(arr));
//        long startTime = System.currentTimeMillis();
//        //BubbleSort(arr);                  // avg: 5.2s
//        //InsertionSort(arr);               // avg: 1.3s
//        SelectionSort(arr);                 // avg: 3.3s
//        long endTime = System.currentTimeMillis();
//        System.out.println((endTime - startTime) / 1000.0 + " sec");
////        System.out.println("Rendezett: " + Arrays.toString(arr));

//        RockPaperScissors3();
        HangingMan.Game();
    }

    public static void RockPaperScissors() {
        System.out.println("Add meg, mit választasz! 0 - kő, 1 - papír, 2 - olló");
        Scanner sc = new Scanner(System.in);
        int player = sc.nextInt();
        int enemy = (int) (Math.random() * 3);
        System.out.println("Gép döntése: " + enemy);

        int ROCK = 0;
        int PAPER = 1;
        int SCISSORS = 2;

        if (player == enemy) {
            System.out.println("Döntetlen");
        } else if (player == ROCK && enemy == PAPER) {
            System.out.println("Gép nyert, papír üti a követ");
        } else if (player == ROCK && enemy == SCISSORS) {
            System.out.println("Játékos nyert, kő üti az ollót");
        } else if (player == PAPER && enemy == ROCK) {
            System.out.println("Játékos nyert, papír üti a követ");
        } else if (player == PAPER && enemy == SCISSORS) {
            System.out.println("Gép nyert, olló üti a papírt");
        } else if (player == SCISSORS && enemy == ROCK) {
            System.out.println("Gép nyert, kő üti az ollót");
        } else if (player == SCISSORS && enemy == PAPER) {
            System.out.println("Játékos nyert, olló üti a papírt");
        } else {
            System.out.println("Ismeretlen állapot");
        }
    }

    public static void RockPaperScissors3() {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0;
        int enemyWins = 0;

        int ROCK = 0;
        int PAPER = 1;
        int SCISSORS = 2;

        for (int i = 0; i < 3; i++) {
            System.out.println("Add meg, mit választasz! 0 - kő, 1 - papír, 2 - olló");

            int player = sc.nextInt();
            int enemy = (int) (Math.random() * 3);
            System.out.println("Gép döntése: " + enemy);

            if (player == enemy) {
                System.out.println("Döntetlen");
            } else if (player == ROCK && enemy == PAPER) {
                System.out.println("Gép nyert, papír üti a követ");
                enemyWins++;
            } else if (player == ROCK && enemy == SCISSORS) {
                System.out.println("Játékos nyert, kő üti az ollót");
                playerWins++;
            } else if (player == PAPER && enemy == ROCK) {
                System.out.println("Játékos nyert, papír üti a követ");
                playerWins++;
            } else if (player == PAPER && enemy == SCISSORS) {
                System.out.println("Gép nyert, olló üti a papírt");
                enemyWins++;
            } else if (player == SCISSORS && enemy == ROCK) {
                System.out.println("Gép nyert, kő üti az ollót");
                enemyWins++;
            } else if (player == SCISSORS && enemy == PAPER) {
                System.out.println("Játékos nyert, olló üti a papírt");
                playerWins++;
            } else {
                System.out.println("Ismeretlen állapot");
            }
        }

        if (playerWins == enemyWins) {
            System.out.println("Döntetlen: " + playerWins + " - " + enemyWins);
        } else if (playerWins > enemyWins) {
            System.out.println("Játékos nyert: " + playerWins + " - " + enemyWins);
        } else {
            System.out.println("Gép nyert: " + enemyWins + " - " + playerWins);
        }
    }

    public static int[] GetRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(1, size * 10);
        }
        return arr;
    }

    /**
     * Kiválasztásos rendezés növekvő sorrendbe
     *
     * @param src
     */
    public static void SelectionSort(int[] src) {
        for (int i = 0; i < src.length - 1; i++) {      // honnan indul a minimum keresés
//            System.out.println("Minimum keresés innentől: " + i);
            int minIndex = i;                       // minimum keresés
            for (int j = i; j < src.length; j++) {
                if (src[j] < src[minIndex])         // ha a j. elem kisebb, mint a minindexedik
                    minIndex = j;                   // ez a legkisebb index
            }
//            System.out.println("Minimum indexe: " + minIndex);
            if (minIndex != i) {                    // Ha a minIndex != i-vel, cserélni kell
//                System.out.println("Cseréljük: " + src[i] + " min: " + src[minIndex]);
                int tmp = src[i];           // Kimentjük az első elemet
                src[i] = src[minIndex];     // Felülírjuk a minimum elemmel
                src[minIndex] = tmp;        // A minimum eleme helyére meg megy az első elem
            }
//            System.out.println("Résztömb rendezése után" + Arrays.toString(src));
        }
    }

    public static void InsertionSort(int[] src) {
        for (int i = 1; i < src.length; i++) {  // Honnantól megyünk visszafelé
            int actual = src[i];                    // Ezt vesszük ki a tömbből
//            System.out.println("Aktuális elem: " + actual);
            int j = i - 1;                          // Indexeljük a csökkenő ciklust
            while (j >= 0 && src[j] > actual) {     // Amíg nem értünk a tömb elejére, és a tömb adott eleme nagyobb, mint amit kivettünk
                src[j + 1] = src[j];            // Léptetjük egyel feljebb a tömb elmét
                j--;                            // és megyünk visszafelé a tömbben
//                System.out.println("Léptetés után: " + Arrays.toString(src));
            }
            src[j + 1] = actual;                // Beszúrjuk a kivett elemet
//            System.out.println("Beszúrás után: " + Arrays.toString(src));
        }
    }

    public static void BubbleSort(int[] src) {
        for (int i = src.length - 1; i > 0; i--) {      // Meddig kell cserélgetni az elemeket
            for (int j = 0; j < i; j++) {               // Cserélgetést vizsgáló ciklus
                if (src[j] > src[j + 1]) {     // Ha az adott elem nagyobb, mint a rákövetkező
                    int tmp = src[j];                   // csere
                    src[j] = src[j + 1];
                    src[j + 1] = tmp;
                }
            }
        }
    }
}