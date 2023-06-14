import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // Tömbök anyag
        byte[] arr = new byte[10]; // 10 elemű byte tömb
        arr[0] = 5;         // A tömb első eleme legyen 5
        arr[1] = 6;
        arr[2] = 7;
        System.out.println("A tömb első eleme: " + arr[0]);
        System.out.println("Tömb mérete: " + arr.length);
        System.out.println(arr[9]);
//        String[] myStrArr = new String[10];
//        System.out.println(myStrArr[0]);

        // Tömb kiíratása 1D-ben
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        System.out.println(Arrays.toString(arr));

        for (byte element : arr) {
            System.out.print(element + " ");
        }

        // 1. feladat: véletlen számokkal töltött tömb
        int[] myRandomArray = new int[10];
        for (int i = 0; i < myRandomArray.length; i++) {
            myRandomArray[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }

        System.out.println();
        System.out.println("véletlen tömb: " + Arrays.toString(myRandomArray));
        System.out.println("");
        System.out.println("Páratlan elemek: ");
        // 2. feladat: páratlan elemek kiírása
        for (int element : myRandomArray) {
            if (element % 2 == 1) {
                System.out.print(element + ", ");
            }
        }

        System.out.println();
        // 3. feladat: páros számokat osszuk kettővel
        for (int i = 0; i < myRandomArray.length; i++) {
            if (myRandomArray[i] % 2 == 0) {
                myRandomArray[i] /= 2;
            }
        }

        System.out.println("Párosak osztva kettővel: " + Arrays.toString(myRandomArray));

        // 2D tömbök
//        int[][] my2dArray = new int[2][4];
//        my2dArray[0][0] = 9;
//        my2dArray[0][1] = 5;
//        my2dArray[1][3] = 1;
//
////        System.out.println(Arrays.toString(my2dArray));
//
//        System.out.println("Alap méret: " + my2dArray.length
//                + " 0. tömb mérete: " + my2dArray[0].length);
//        for (int i = 0; i < my2dArray.length; i++) {
//            for (int j = 0; j < my2dArray[i].length; j++) {
//                System.out.print(my2dArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Argumentumok

//        if (args.length > 0) {
//            System.out.println(args[0]);
//            int num = Integer.parseInt(args[0]);
//            System.out.println("A szám: " + num);
//        } else {
//            System.out.println("Nem adtál meg argumentumot!");
//        }

        // Argumentumból jövő számok összege:
//        int sum = 0;
//        for (int i = 0; i < args.length; i++) {
//            sum += Integer.parseInt(args[i]);
//        }
//        System.out.println("Összeg: " + sum);

        // 4. feladat
//        if (args.length > 0) {
//            // Stringek bejárása
//            // Eldöntsük, lehet-e szám a string
//            char[] sizeCharArr = args[0].toCharArray();
//            for (int i = 0; i < sizeCharArr.length; i++) {
//                char c = sizeCharArr[i];
//                if (i == 0 && (c != '-' && c != '+' && !Character.isDigit(c))) {
//                    System.out.println("HIBA, ez nem lehet szám, az első karakter rossz");
//                    System.exit(1);
//                } else if (i != 0 && !Character.isDigit(c)) {
//                    System.out.println("HIBA, ez nem lehet szám, ez rossz: " + c);
//                    System.exit(1);
//                }
//            }
//            // Eddig ^^^^
//
//            int size = Integer.parseInt(args[0]);
//            if (size >= 1 && size <= 10) {
//                System.out.println("A tömb mérete lesz: " + size);
//                int[] myArr = new int[size];
//                for (int i = 0; i < myArr.length; i++) {
//                    myArr[i] = ThreadLocalRandom.current().nextInt(1, 10);
//                }
//                System.out.println("A tömb: " + Arrays.toString(myArr));
//            } else {
//                System.out.println("A méret nem megfelelő. 1-10 közt legyen!");
//            }
//        } else {
//            System.out.println("Nincs elég argumentum");
//        }

        //5. feladat Készíts programot, ami létrehoz egy 10 elemű 1 dimenziós tömböt úgy, hogy a páros indexeken " " karakter, a páratlanokon "#" karakter legyen! Írja is ki ezt!
//        char[] myCharArray = new char[10];
//        for (int i = 0; i < myCharArray.length; i++) {
////            if (i % 2 == 0){
////                myCharArray[i] = ' ';
////            } else {
////                myCharArray[i] = '#';
////            }
//            myCharArray[i] = (i % 2 == 0 ? ' ' : '#');
//        }
//
//        System.out.println(Arrays.toString(myCharArray));

        // 6. feladat:
//        if (args.length > 0) {                       // Készíts programot, ami bekér egy egész számot argumentumból,
//            int size = Integer.parseInt(args[0]);
//            if (size >= 1 && size <= 10) {           //  aminek 1-10 közt kell lennie!
//                int[] myArr2 = new int[size];        //  A program hozzon létre egy ekkora 1 dimenziós tömböt,
//                for (int i = 0; i < myArr2.length; i++) {       //  és töltse fel minden elemét úgy
//                    myArr2[i] = i * i;               // az adott indexen lévő elem az adott index értékének négyzete legyen!
//                }
//                System.out.println("A négyzetes 5. feladat" + Arrays.toString(myArr2));    // Ezt írja is ki!
//            } else {
//                System.out.println("A szám nem megfelelő. 1-10 közt legyen!");
//            }
//        } else {
//            System.out.println("Nincs elég bemenet");
//        }

        // 7. feladat:

//        if (args.length > 1) {
//            int m = Integer.parseInt(args[0]);
//            int n = Integer.parseInt(args[1]);
//
//            if (m >= 1 && n >= 1 ) {
//                char[][] myChess = new char[m][n];
//
//                boolean isBlack = true;
//
//                for (int i = 0; i < myChess.length; i++) {
//                    for (int j = 0; j < myChess[i].length; j++) {
//                        if (isBlack) {
//                            myChess[i][j] = '#';
//                        } else  {
//                            myChess[i][j] = ' ';
//                        }
//
//                        isBlack = !isBlack;
////                        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
////                            myChess[i][j] = '#';
////                        else
////                            myChess[i][j] = ' ';
//                    }
//                    isBlack = !isBlack;
//                }
//
//                for (int i = 0; i < myChess.length; i++) {      // kiíratás
//                    for (int j = 0; j < myChess[i].length; j++) {
//                        System.out.print(myChess[i][j]);
//                    }
//                    System.out.println();
//                }
//            }
//        } else {
//            System.out.println("Nincs elég bemenet");
//        }

        // Függvények tananyag
        hello();    // Függvény hívása
        hello();
        hello();
        double v = getPI();     // Visszatérési érték eltárolása
        System.out.println("getPI eredménye: " + v);
        System.out.println(getGreetingString("Máté", 1800));
        System.out.println(getGreetingString("Feri", 1900));
        System.out.println("getAbs " + getAbs(5));
        System.out.println("getAbs " + getAbs(-5));
        System.out.println("getParity  " + getParity(-5));
        System.out.println("getParity  " + getParity(5));
        System.out.println("getParity  " + getParity(0));

        System.out.println("getParity  " + getParity(3.5));
        System.out.println("getParity  " + getParity("3.5"));

        int[] arr2 = new int[]{1, 2, 3, 4};
        int num = 10;
        String text = "feri";
        MultiplyArrary(arr2, num, text);
        System.out.println(Arrays.toString(arr2) + " " + num + " " + text);

    }

    public static void hello() {        // A függvényt a main függvényen kívül hozzuk létre
        System.out.println("Szia");
    }

    public static double getPI() {      // A függvény vissza is adhat értéket
        double res = 3.1415;
        return res;                  // Amit vissza akarunk adni, a return után írjuk
    }

    public static String getGreetingString(String name, int birthYear) {    // Készítsünk egy függvényt, ami megkapja a nevünket és a születési évet, ---- visszaad egy formázott szöveget
        int age = 2023 - birthYear;                                         // kiszámolja, hány évesek vagyunk
        String result = "Szia " + name + " te " + age + " éves vagy!";     // egy formázott szöveget, amiben köszönt minket!​
        return result;                                                      // visszaad
    }

    //  Készítsünk egy "getAbs" nevű függvényt, ami egy egész számot vár,
    //  és visszaadja az abszolutértékét!
    public static int getAbs(int num) {
        if (num >= 0)                   // Pozitív szám abszolutértéke önmaga
            return num;
        else
            return num * -1;            // Negatív számnak pedig a -1szerese
    }

    //Készítsünk egy "GetParity" nevű függvényt ,ami egy egész számot vár,
    // és visszaad 1-et, ha a szám pozitív, 0-át, ha a szám 0, és -1-et, ha a szám negatív!
    public static int getParity(int num) {
        return getParity((double) num);
    }

    public static int getParity(String numberString) {
        double num = Double.parseDouble(numberString);
        return getParity(num);
    }

    // Paraméter overloading
    public static int getParity(double num) {
        if (num > 0) {
            return 1;
        } else if (num == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static int getParity(int num, int num2) {
        return 1;
    }

    // Készítsünk egy "IsEven" nevű függvényt, ami egy egész számot vár paraméterül,
    // és logikai értékkel tér vissza annak függvényében, hogy a szám páros-e!

    /**
     * Eldönti egy számról, hogy páros-e
     * @param num A szám, amiről eldöntjük ezt.
     * @param num2 Ez meg egy fölösleges paraméter
     * @return True ha páros. False, ha páratlan
     */
    public static boolean isEven(int num, int num2) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
        // return num % 2 == 0
    }

    // Készítsünk egy függvényt "MultiplyArray", ami egy int tömböt vár paraméterül, és minden elemét megszorozza 2-vel. Ne adjon vissza semmit!
    public static void MultiplyArrary(int[] input, int num, String s) {
        // int[] input2 = input.clone(); - Ezzel lemásolhatjuk egy új tömbbe, és már nem leszünk hatással a hívóra
        // input = new int[] {10, 20, 30};       // ha új referenciát hozunk létre, már nem lesz visszahatás
        for (int i = 0; i < input.length; i++) {
            input[i] *= 2;                      // ha azonban az eredeti tömb elemeit módosítjuk hatással lesz az eredetire
        }
        s += "asd";                     // stringen nem lesz jó, mert az immutable, új referencia jön létre
        num *= 2;                       // Primitív típus nem hat vissza, mert értékként adódik át
    }
}