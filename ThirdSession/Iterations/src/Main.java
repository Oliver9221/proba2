import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        // Készítsünk programot, ami 3 számot sorsol 1-15-ig, melyek oldalhosszak!
        // A program döntse el, hogy az oldalak alkothatnak-e háromszöget!
        // Használd a háromszög egyenlőtlenséget! Extra: Terület Hérón képlettel!

        int a = ThreadLocalRandom.current().nextInt(1, 15);
        int b = ThreadLocalRandom.current().nextInt(1, 15);
        int c = ThreadLocalRandom.current().nextInt(1, 15);

        System.out.println("a: " + a + " b: " + b + " c: " + c);
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Lehetnek háromszög oldalai");
            double s = (a + b + c) / 2.0;
            System.out.println("s: " + s);
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.println("Area: " + area);
        } else {
            System.out.println("Nem alkothat háromszöget");
        }

        //int i = 1;
//        while (i <= 100) {
//            System.out.print(i + ", ");
//            i++;
//        }

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();

        // számoljunk 10-től 1-ig!
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }

//        System.out.println();
//        int i = 10;
//        while (i >= 1) {
//            System.out.print(i + ", ");
//            i--;
//        }

//        System.out.println();
//        int i = 100;
//        do {
//            System.out.print(i + ", ");
//            i++;
//        } while (i <= 5);

        for (int i = 1; i < 100; i++) {
            if (i % 25 == 0) {
                break;
            }
            System.out.println("Futok " + i);
        }

        System.out.println();

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + ", ");
        }

        // 1. feladat
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + ", ");
        }

        System.out.println();
        // 2. feladat: páros számok 1-20-ig
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println();

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + ", ");
        }

        // 3. feladat: páros 3-al osztható számok 1-20-ig
        System.out.println("páros 3-al osztható számok 1-20-ig");
        for (int i = 1; i <= 30 ; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }

        // 4. fleadat: Készítsünk programot, ami generál egy random számot 10-20
        // közt, és elszámol négyesével 1-től eddig a számig!
        System.out.println("négyesével számolós");
        int max = ThreadLocalRandom.current().nextInt(10,20);
        System.out.println("Véletlen szám: " + max);
        for (int i = 1; i <= max; i += 4) {
            System.out.print(i + ", ");
        }

        // 5. feladat Készítsünk programot, ami elszámol egyesével a születési évünktől
        // az aktuális évig, és mindig kiírja, hogy az adott évben
        // hanyadik életévünket töltöttük!
        System.out.println("");
        System.out.println("Éves feladat");

        int birthYear = 2000;
        int actualYear = 2023;

        for (int i = birthYear; i <= actualYear ; i++) {
            int age = i - birthYear;
            System.out.println("Év: " + i + " életkor: " + age);
        }

        // 6. Készítsünk programot, ami megkeresi két szám legkisebb közös többszörösét ciklus segítségével! Egyelőre brute-force módszer is jó!
        int num1 = 52;
        int num2 = 11;

        int bigger = (num1 > num2 ? num1 : num2);
        for (int i = bigger; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("Lkkt: " + i);
                break;
            }
        }
    }

}