import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10, -3, 6, -3, -1, 6, 4, 10};
//        int sum = BasicAlgorithms.GetSum(arr);
//        System.out.println("Összeg: " + sum);
//        int negativeCount = BasicAlgorithms.CountNegative(arr);
//        System.out.println("Negatív elemek darabszáma: " + negativeCount);
//        System.out.println("Min: " + BasicAlgorithms.GetMin(arr));
//        System.out.println("Min index: " + BasicAlgorithms.GetMinIndex(arr));
//        System.out.println("Legnagyobb ábrázolható int: " + Integer.MAX_VALUE);
//        System.out.println("6 benne van-e: " + BasicAlgorithms.ContainsElement(arr, 6));
//        System.out.println("6 indexe: " + BasicAlgorithms.IndexOf(arr, 6));
//        int[] arr2 = BasicAlgorithms.CopyTwice(arr);
//        System.out.println("Kétszeres tömb: " + Arrays.toString(arr2));
//        System.out.println("Páros elemek tömb: " + Arrays.toString(BasicAlgorithms.GetEvens(arr)));
//        BasicAlgorithms.GetByParity(arr);
        int[] res = BasicAlgorithms.Section(new int[]{1, 2, 3, 4, 5}, new int[]{5, 6, 7, 1, 2, 10});
        System.out.println("metszet: " + Arrays.toString(res));
        res = BasicAlgorithms.Union(new int[]{1, 2, 3, 4, 5}, new int[]{5, 6, 7, 1, 2, 10});
        System.out.println("unio: " + Arrays.toString(res));
    }


}