import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FabrykaTowaru {

    private static final List<String> NAZWY_TOWAROW = Arrays.asList("samochod", "maslo", "slon", "kapusta", "komputer",
            "telewizor", "zabawka", "majciochy", "skarpety", "gumowa kaczka", "mydlo", "pasta",
            "solniczka", "frytki", "samolot", "skuter", "zelazko", "doniczka", "parmezan");

    public static Towar losowyTowar() {
        BigDecimal cena = new BigDecimal(Math.random() * 10000);
        String nazwa = NAZWY_TOWAROW.get(new Random().nextInt(NAZWY_TOWAROW.size()));
        LocalDate date = LocalDate.ofEpochDay(ThreadLocalRandom.current().nextLong(LocalDate.MIN.toEpochDay(), LocalDate.MAX.toEpochDay()));
        return new Towar(cena, nazwa, date);
    }
}
