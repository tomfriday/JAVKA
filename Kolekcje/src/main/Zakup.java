import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.time.LocalDate;
import java.util.Date;

public class Zakup {

    private static List<Towar> towary = new ArrayList<>();

    private static String cwiczenie1() {
        for (int i = 0; i < 10; i++) {
            towary.add(FabrykaTowaru.losowyTowar());
        }
        return towary.toString();

        // Dodaj 10 losowych towarow do zakupu
        // przy pomocy przeciazenia metody toString zwroc liste w formacie
        // *nazwa*::*cena* jeden pod drugim
    }

    private static String cwiczenie2() {

        BigDecimal lowerPrice = towary.get(0).getCena().min(towary.get(1).getCena());
        BigDecimal higherPrice = towary.get(0).getCena().max(towary.get(1).getCena());

        for (int i = 1; i < 10; i++) {
            lowerPrice = lowerPrice.min(towary.get(i).getCena());
            higherPrice = higherPrice.max(towary.get(i).getCena());
        }
        int indexOfMostExpensiveElement = 0;
        int indexOfLeastExpensiveElement = 0;

        for (int i = 0; i < 10; i++) {
            if (towary.get(i).getCena() == higherPrice) {
                indexOfMostExpensiveElement = i;

            }
            if (towary.get(i).getCena() == lowerPrice) {
                indexOfLeastExpensiveElement = i;

            }
        }

        return String.valueOf(towary.get(indexOfMostExpensiveElement)) + String.valueOf(towary.get(indexOfLeastExpensiveElement));

        // podaj wraz z cena nazwy najtanszego i najdrozszego produktu
    }

    // TROCHE WALKA BYLA,
    // NO WIDZE

    private static String cwiczenie2Jaroslaw() {
        towary.sort(Comparator.comparing(Towar::getCena));
        return towary.get(towary.size() - 1) + towary.get(0).toString();
    }


    private static String cwiczenie3() {

        // posortuj towary alfabetycznie i wylistuj same nazwy

        towary.sort(Comparator.comparing(Towar::getNazwa));
        List<String> posortowaneTowary = new ArrayList<>();

        for (int i = 0; i < towary.size(); i++) {
            posortowaneTowary.add(towary.get(i).getNazwa() + "\n");
        }
        String sformatowanePosortowaneTowary = posortowaneTowary.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .trim();
        return sformatowanePosortowaneTowary;
    }

    //3cie done

    private static String cwiczenie4() {
        // podlicz sume zakupu, dodaj rabat 10% jezeli kwota ta bedzie wynosila ponad 5000
        // stworz testy pod logike

        BigDecimal sumaZakupu = new BigDecimal(0);
        BigDecimal progRabatowy = new BigDecimal(5000);
        BigDecimal rabat = new BigDecimal(0.9);
        for (int i = 0; i < towary.size(); i++) {
            if (towary.get(i).getCena().compareTo(progRabatowy) > 1) {
                towary.get(i).setCena(towary.get(i).getCena().multiply(rabat));
            }
        }
        sumaZakupu = towary.stream()
                .map(Towar::getCena)
                .reduce(BigDecimal::add)
                .get();
        return "Utopilismy" + " " + sumaZakupu + " " +"na zakupy, w dypę janysza";

    }

    private static boolean cwiczenie5() {
        boolean wynik = true;
        for (int i = 0; i < towary.size(); i++) {
            if (towary.get(i).getNazwa() == "samochod" || towary.get(i).getNazwa() == "telewizor" || towary.get(i).getNazwa() == "komputer") {
                wynik = true;
                System.out.println(towary.get(i).getNazwa());
                return wynik;
            } else {
                wynik = false;
            }
        }
        return wynik;
    }
// 5te zrobione, pytanie odnosnie skladni

    // sprawdz czy na liscie znajduje sie samochod, telewizor lub komputer
    // zwroc w zaleznosci od tego true lub false

    private static BigDecimal cwiczenie6() {
        LocalDate currentDate = LocalDate.now();
        BigDecimal straty = new BigDecimal(0);

        for (int i = 0; i < towary.size(); i++) {
            if (towary.get(i).getDataWaznosci().isBefore(currentDate)) {
                straty = straty.add(towary.get(i).getCena());
                // System.out.println(towary.get(i).toString());
                towary.remove(i);
            }
        }
        // System.out.println(towary);

        System.out.println("utopiliśmy tyle pieniedzy :");
        // usun z listy przeterminowane towary, podaj wartosc strat
        return straty;
    }

    public static void main(String[] args) {
        System.out.println("\n------------1------------\n");
        System.out.println(cwiczenie1());
        System.out.println("\n------------2------------\n");
        System.out.println(cwiczenie2());
        System.out.println(cwiczenie2Jaroslaw());
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
