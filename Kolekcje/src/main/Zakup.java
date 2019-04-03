import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Zakup {

    private static List<Towar> towary = new ArrayList<>();

    private static String cwiczenie1() {
        // Dodaj 10 losowych towarow do zakupu
        // przy pomocy przeciazenia metody toString zwroc liste w formacie
        // *nazwa*::*cena* jeden pod drugim
        return null;
    }

    private static String cwiczenie2() {
        // podaj wraz z cena nazwy najtanszego i najdrozszego produktu
        return null;
    }

    private static String cwiczenie3() {
        // posortuj towary alfabetycznie i wylistuj same nazwy
        return null;
    }

    private static String cwiczenie4() {
        // podlicz sume zakupu, dodaj rabat 10% jezeli kwota ta bedzie wynosila ponad 5000
        // stworz testy pod logike
        return null;
    }

    private static boolean cwiczenie5() {
        // sprawdz czy na liscie znajduje sie samochod, telewizor lub komputer
        // zwroc w zaleznosci od tego true lub false
        return false;
    }

    private static BigDecimal cwiczenie6() {
        // usun z listy przeterminowane towary, podaj wartosc strat
        return null;
    }

    public static void main(String[] args) {
        System.out.println("\n------------1------------\n");
        System.out.println(cwiczenie1());
        System.out.println("\n------------2------------\n");
        System.out.println(cwiczenie2());
        System.out.println("\n------------3------------\n");
        System.out.println(cwiczenie3());
        System.out.println("\n------------4------------\n");
        System.out.println(cwiczenie4());
        System.out.println("\n------------5------------\n");
        System.out.println(cwiczenie5());
        System.out.println("\n------------6------------\n");
        System.out.println(cwiczenie6());
    }

}
