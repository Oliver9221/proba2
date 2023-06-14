import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //welcome();       // Extract code (ctrl + alt + m)
//        int a = 10;
//        System.out.println("kutya");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            a += 20;
//        }
//
//        System.out.println("cica");

        String s = "cica kutya";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(i + ". karakter: " + s.charAt(i));
        }

        int indexOfSpace = s.indexOf(" ");
        System.out.println("A szóköz indexe: " + indexOfSpace);

        boolean containsCica = s.contains("cica");
        System.out.println((containsCica ? "Van" : "Nincs") + " benne cica");

        System.out.println(s.substring(s.indexOf(" ") + 1));
        String[] words = s.split(" ");
        for (String word : words) {
            System.out.println("Szó: " + word);
        }
        s = "   cIcA kUtYa ";
        System.out.println(s.toLowerCase() + " " + s.toUpperCase());

        System.out.println(s.trim());
        // Cseréljük le a 'c' karaktereket 'd'-re

        char[] chars = s.toCharArray();         // Karakter tömb stringből

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'c') {
                chars[i] = 'd';
            }
        }

        String result = new String(chars);      // String létrehozása karakter tömbből
        System.out.println(result);

        s += " asd";

        StringBuilder sb = new StringBuilder();
        sb.append("asd");
        sb.toString();

        for (int i = 0; i < 1000000; i++) {
            sb.append(" ");
        }

        String res2 = sb.toString();
    }

    /**
     * Bekéri a felhasználó nevét, és születési évét
     * Majd üdvözli őt.
     * Szinkron módon működik!
     */
    private static void welcome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Írd be a neved!");
        String name = sc.nextLine();
        System.out.println("Szia " + name);
        System.out.println("Add meg a születési évedet!");
        int birthYear = sc.nextInt();
        int age = 2023 - birthYear;
        System.out.println("Ennyi éves vagy: " + age);
    }
}