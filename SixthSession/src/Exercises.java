public class Exercises {

    /**
     * Megszámolja, hány páros szám van a tömbben
     * @param arr
     * @return
     */
    public static int CountEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        return count;
    }


}
