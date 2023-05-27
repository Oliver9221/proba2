public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Flow!");          // Ez kiír a konzolra egy sort, ami a Hello Flow
        //         Ez egy komment!
        /*
        Ez egy
        több soros
        komment
         */
        byte smallNumber = -50;     // Típus név = kezdőérték;
        byte smallNumber2;          // Nincs kedzőértéke
        smallNumber2 = 10;          // Itt kap értéket
        System.out.println(smallNumber2);
        smallNumber = 10;
        System.out.println(smallNumber);
        short number2 = 6000;
        System.out.println(number2);
        int number3 = 350_000;
        System.out.println(number3);
        long number4 = 4_000_000_000l;
        System.out.println(number4);

        // Lebegőpontos számok
        float floatNum1 = 3.567891011123456786f;    // f betű a végére!
        System.out.println(floatNum1);
        double doubleNum1 = 3.567891011123456786;
        System.out.println(doubleNum1);

        double bigDouble1 = 1_000_000.1234567891011;
        double smallDouble1 = 1.1234567891011;
        System.out.println(bigDouble1);
        System.out.println(smallDouble1);

        boolean isSunnyOutside = true;   // Logikai adattípus
        System.out.println(isSunnyOutside);

        char myChar = 'ű';              // Karakter
        System.out.println("Karakter:" + myChar);

        String myText = "Test";         // Szöveg - karakterlánc
        System.out.println(myText);
        String myOtherText = "Almafa";
        String resultText = myText + " " + myOtherText;   // Konkatenálás
        System.out.println(resultText);

        // Aritmetikai operátorok
        int a = 123;
        int b = 50;
        int result = a + b;
        System.out.println("a + b = " + result);
        result = a - b;
        System.out.println("a - b = " + result);
        result = a * b;
        System.out.println("a * b = " + result);
        result = a / b;                             // VIGYÁZZ!
        System.out.println("a / b = " + result);

        // Prefix/postfix operátorok
        int p = 10;
        p++;                    // Postfix
        System.out.println("p: " + p);
        ++p;                    // Prefix operátor
        System.out.println("p: " + p);
        System.out.println("p pre: " + ++p);
        System.out.println("p post: " + p++);
        System.out.println("p after " + p);
        p--;
        --p;
        System.out.println("p after -- " + p);

        // Osztás
        a = 10;
        b = 3;
//        double b2 = 3;
        double res = (double) a / (double) b;    // Ha legalább az egyik operandus lebegőpontos, már jó lesz
        System.out.println(res);

        a = 1122;
        byte s = (byte)a;
        System.out.println("Konvertált int -> byte: " + s);

        byte myAge = 127;
        byte yourAge = 127;
        byte ourAge = (byte)(myAge + yourAge);
//        System.out.println(10 / 0);
        System.out.println("cica");

        // Maradékos osztás
        a = 10;
        b = 3;
        int remainder = a % b;
        res = (double)a / b;
        System.out.println("Hányados: " + res + " Maradék: " + remainder);

        int base = 2;
        int exponent = 10;
        res = Math.pow(base, exponent); // Hatványozás -  implicit típuskonverzió
        long convertedRes = Math.round(res);
        System.out.println("2^10 :" + convertedRes);

        a = 64;
        res = Math.sqrt(a);              // Gyökvonás
        System.out.println("sqrt(64): " + res);

        double rn = Math.random();
        System.out.println("Véletlen szám: " + rn);

        a = a + 10;     // a értékét növeljük meg 10-el
        a += 10;        // Szintén
        System.out.println("\"a\" értéke 10-el növelés után " + a);
        a -= 10;
        System.out.println("\"a\" értéke 10-el csökkentés után " + a);
        a *= 10;
        System.out.println("\"a\" értéke 10-el szorozva " + a);
        a /= 10;
        System.out.println("\"a\" értéke osztva 10-el " + a);
    }
}