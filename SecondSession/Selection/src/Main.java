import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        double a = 6;
        double mA = 8.2;
        double area = (a * mA) / 2;
        System.out.println("Terület: " + area);
        // Véletlen szám generálása
        int min = 1;
        int max = 10;
        int value = (int) (Math.random() * (max - min)) + min;
        System.out.println("A véletlen szám: " + value);

        Random r = new Random();
        value = r.nextInt(10);
        System.out.println("Másik véletlen szám: " + value);

        value = ThreadLocalRandom.current().nextInt(1, 5);
        System.out.println("A harmadik véletlen szám: " + value);

        if (value == 1) {                       // Feltétel, amit vizsgálunk
            System.out.println("A szám 1");     // Ha az előző feltétel teljesült
        } else if (value > 3) {                 // Ha az első feltétel nem teljesült, megvizsgáljuk
            System.out.println("A szám nagyobb, mint 3");
        } else {                                // Ha egyik megelőző feltétel sem teljesült
            System.out.println("A szám 2 vagy 3");
        }

        System.out.println("Az if után");

        String firstName = "Mate";
        String firstName2 = "Mate";

        if (firstName == firstName2)        // Ilyet ne
            System.out.println("Egyenlőek");

        if (firstName.equals(firstName2))            // Stringeknél csak így
            System.out.println("Egyenlőek");

        value = 4;

        if (value % 2 == 0) {
            if (value > 5) {
                System.out.println("Páros és nagyobb, mint 5");
            }
        }

        if (value % 2 == 0 && value > 5) {  // ÉS operátor használata
            System.out.println("Páros és nagyobb, mint 5");
        }

        // 1. Feladat:  Készítsünk programot, ami eldönti egy karakterről, hogy digit-e!

        char c = '0';
        if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Nem digit");
        }

        if (c >= '0' && c <= '9')
            System.out.println("Digit2");
        else
            System.out.println("Nem digit2");

        if (Character.isDigit(c)) {
            System.out.println("Digit");
        } else {
            System.out.println("Nem digit");
        }

        // 2. feladat.  Készítsünk programot, ami véletlenszerűen sorsol számot 1-99 közt, ami
        //életkor lesz. A program írja ki, hogy az adott életkor gyerek (0-17 év),
        //felnőtt (18-64 év), vagy nyugdíjas (65 és afölött)

        int age = (int) (Math.random() * (99 - 1)) + 1;
        System.out.println("Életkor: " + age);
        if (age >= 0 && age <= 17) {
            System.out.println("Gyerek");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Felnőtt");
        } else if (age > 64) {
            System.out.println("Nyugdíjas");
        } else {
            System.out.println("Nem értelmezhető");
        }

        // Készítsünk programot, ami sorsol két véletlen számot, és eldönti, melyik a
        // nagyobb!

        int firstNum = ThreadLocalRandom.current().nextInt(1, 10);
        int secondNum = ThreadLocalRandom.current().nextInt(1, 10);

        System.out.println("Első szám: " + firstNum + " Második szám: " + secondNum);

        if (firstNum > secondNum) {
            System.out.println("Az első szám nagyobb!");
        } else if (secondNum > firstNum) {
            System.out.println("A második a nagyobb");
        } else {
            System.out.println("Egyenlőek");
        }

        int randomOtig = ThreadLocalRandom.current().nextInt(1, 5);
        System.out.println("A random szám: " + randomOtig);
        if (randomOtig == 1)
            System.out.println("Egy");
        else if (randomOtig == 2)
            System.out.println("Ketto");
        //...

        switch (randomOtig) {
            case 1:
                System.out.println("egy");
                break;
            case 2:
                System.out.println("kettő");
                break;
            case 3:
                System.out.println("három");
                break;
            case 4:
                System.out.println("négy");
                break;
            case 5:
                System.out.println("öt");
                break;
            default:
                System.out.println("Nem értelmezett");
        }

        // Ternary operátor
        // Példa: Ha a szám 3-nál nagyobb, akkor az új változó értéke "nagy", amúgy "kicsi" legyen

        String ujSzoveg = (randomOtig > 3 ? "nagy" : "kicsi");  // (feltétel ? igaz eset : hamis eset)
        // Ha vad dolgokra vágyunk: (randomOtig > 3 ? "nagy" : (randomOtig % 2 == 0 ? "kicsi, de páros" : "kicsi de páratlan"));
        String ujSzoveg2;
        if (randomOtig > 3) {
            ujSzoveg2 = "nagy";
        } else {
            ujSzoveg2 = "kicsi";
        }

        System.out.println(ujSzoveg);

        a = 1;
        int b = 9;
        if ((a * b) % 2 == 0) {
            System.out.println("A szorzat páros");
        } else {
            System.out.println("A szorzat páratlan");
        }
    }
}