import java.util.Arrays;

public class BasicAlgorithms {

    /**
     * Összegzés tétel, összeadja a tömb elemeit
     * Ha nincs a tömbben elem, 0-t ad vissza
     *
     * @param input A számokat tároló tömb
     * @return Az összeg, 0, ha nincs elem
     */
    public static int GetSum(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
        }
        return sum;
    }

    /**
     * Megszámlálás tétel, megszámolja hány negatív szám van
     *
     * @param input Ennek az elemeit vizsgálja
     * @return A negatív elemek darabszáma. 0, ha üres a tömb!
     */
    public static int CountNegative(int[] input) {
        int count = 0;                              // Feltételt teljesítő elemek darabszáma, kezdetben 0
        for (int i = 0; i < input.length; i++) {    // Bejárjuk a tömböt
            if (input[i] < 0) {                     // Megszámlált elemek feltétele
                count++;                            // Ha megfelele a feltételnek, növeljük a daraszámot
            }
        }
        return count;                               // Visszaadjuk a darabszámot
    }

    /**
     * Minimum keresés tétel
     *
     * @param input Legalább 1 elemű tömb
     * @return A legkisebb elem értéke
     */
    public static int GetMin(int[] input) {
        int min = input[0];                         // A legkisebb elem kezdetben a tömb első eleme
        for (int i = 1; i < input.length; i++) {    // Bejárjuk a tömböt
            if (input[i] < min) {                   // Ha az i. elem kisebb, mint az addigi legkisebb
                min = input[i];                     // Felülírjuk az addigi legkisebbet vele
            }
        }
        return min;                                 // Visszaadjuk a minimumot
    }

    /**
     * Legkisebb elem indexének megkeresése
     *
     * @param input Tömb, amiben keressük a minimumot
     * @return A legkisebb elem indexe, -1 legyen, ha nincs benne elem
     */
    public static int GetMinIndex(int[] input) {
        int minIndex = 0;                               // Legkisebb elem indexe
        for (int i = 1; i < input.length; i++) {        // Végigmegyünk a tömbön
            if (input[i] < input[minIndex]) {           // Ha az i. elem kisebb, mint a minIndexedik
                minIndex = i;                           // Felülírjuk a minIndexet az i-vel
            }
        }
        return input.length > 0 ? minIndex : -1;        // Ha a tömb mérete nem
    }

    /**
     * Eldöntés tétel: szerepel-e az element az inputban
     *
     * @param input   Ebben keressük az elemet
     * @param element Ezt keressük a tömbben
     * @return true, ha tartalmazza, más esetben false
     */
    public static boolean ContainsElement(int[] input, int element) {
        boolean contains = false;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == element) {
                contains = true;
                break;
                //return true;
            }
        }
        //return false;
        return contains;
    }

    /**
     * Eldöntés tétel: szerepel-e az element az inputban
     *
     * @param input   Ebben keressük az elemet
     * @param element Ezt keressük a tömbben
     * @return true, ha tartalmazza, más esetben false
     */
    public static boolean ContainsElementWhile(int[] input, int element) {
        int i = 0;
        int n = input.length;
        while (i < n && input[i] != element) {
            i++;
        }

        if (i < n) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Keresés tétel, megkeresi az element első előfordulásának indexét
     *
     * @param input   Ebben keressük az elementet
     * @param element Ezt keressük a tömbben
     * @return Az element első előfordulásának indexe, -1, ha nincs benne
     */
    public static int IndexOf(int[] input, int element) {
        int index = -1;                             // Kezdetben -1, mert azt mondjuk, nincs benne
        for (int i = 0; i < input.length; i++) {    // Végigmegyünk a tömbön
            if (input[i] == element) {              // Ha az i. elem a keresett
                index = i;                          // Az index lesz az i
                break;                              // Vége is ekkor
            }
        }
        return index;                               // Visszaadjuk az indexet
    }

    /**
     * Másolás tétel
     *
     * @param src Bemenet
     * @return Új tömb, amiben minden elem a bemenet kétszerese
     * Üres tömb, ha a bemenet üres
     */
    public static int[] CopyTwice(int[] src) {
        int[] dst = new int[src.length];        // Új tömb, ami akkora, mint az eredeti
        for (int i = 0; i < src.length; i++) {  // Végigmegyünk az eredetin
            dst[i] = src[i] * 2;                // Új tömb i. eleme az src i. elemének kétszerese
        }
        return dst;                             // Visszaadjuk az új tömböt
    }

    /**
     * Kiválogatás tétel páros számokra
     *
     * @param src Ebben keressük a páros számokat
     * @return A páros számokat tároló tömb, üres is lehet
     */
    public static int[] GetEvens(int[] src) {
        int[] dst = new int[0];
        int j = 0;
        for (int i = 0; i < src.length; i++) {
            if (src[i] % 2 == 0) {          // Csak a páros elemekkel foglalkozunk
                dst = Arrays.copyOf(dst, dst.length + 1);   // Új tömb, ami a régi elemeket tartalmazza, de egyel nagyobb
                dst[j] = src[i];            // A j. indexre megy a páros szám
                j++;                        // Növeljük a j-t
            }
        }
        return dst;
    }

    /**
     * Szétválogatás tétel. Párosakra és páratlanokra
     *
     * @param src
     * @return
     */
    public static void GetByParity(int[] src) {
        int[] evens = new int[0];
        int j = 0;
        int[] odds = new int[0];
        int k = 0;
        for (int i = 0; i < src.length; i++) {
            int actual = src[i];
            if (actual % 2 == 0 && !ContainsElement(evens, actual)) {
                evens = Arrays.copyOf(evens, evens.length + 1);
//                evens[j++] = actual;
                evens[evens.length - 1] = actual;
            } else if (actual % 2 != 0 && !ContainsElement(odds, actual)) {
                odds = Arrays.copyOf(odds, odds.length + 1);
                odds[k++] = actual;
            }
        }
        System.out.println("Párosak: " + Arrays.toString(evens));
        System.out.println("Páratlanok: " + Arrays.toString(odds));
    }

    /**
     * Metszet tétel.
     *
     * @param a
     * @param b
     * @return
     */
    public static int[] Section(int[] a, int[] b) {
        int[] dst = new int[0];
        for (int i = 0; i < a.length; i++) {                                    // Végigmegyünk az első tömbön, és minden elemére
            for (int j = 0; j < b.length; j++) {                                // Megnézzük a második tömböt
                if (a[i] == b[j]) {                                             // Benne van-e az első tömb i. eleme a második tömbben
                    dst = Arrays.copyOf(dst, dst.length + 1);         // Ha igen, akkor belerakjuk a kimenetben
                    dst[dst.length - 1] = a[i];                                 // A dst tömb utolsó indexére rakjuk az 'a' tömb aktuális elemét
                    break;
                }
            }
        }
        return dst;
    }

    public static int[] SectionWithContains(int[] a, int[] b) {
        int[] dst = new int[0];
        for (int i = 0; i < a.length; i++) {                                    // Végigmegyünk az első tömbön, és minden elemére
            if (ContainsElement(b, a[i]) && !ContainsElement(dst, a[i])) {                                             // Benne van-e az első tömb i. eleme a második tömbben
                dst = Arrays.copyOf(dst, dst.length + 1);         // Ha igen, akkor belerakjuk a kimenetben
                dst[dst.length - 1] = a[i];                                 // A dst tömb utolsó indexére rakjuk az 'a' tömb aktuális elemét
            }
        }
        return dst;
    }

    public static int[] Union(int[] a, int[] b) {
        int[] dst = a.clone();              // Az únióban az első tömb benne lesz
        for (int j = 0; j < b.length; j++) {    // Megnézzük a második tömböt
            boolean contains = false;           // Keressük a második tömb azon elemeit,
            for (int i = 0; i < a.length; i++) {    // Amik nem szerepelnek az első tömbben
                if (a[i] == b[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {                    // Ha az első tömbben nem volt benne
                dst = Arrays.copyOf(dst, dst.length + 1);   // Növeljük a dst tömböt
                dst[dst.length - 1] = b[j];         // és belerakjuk a második tömb elemét
            }
        }
        return dst;
    }
}
