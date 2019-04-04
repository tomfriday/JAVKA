import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Towar {
    private BigDecimal cena;
    private String nazwa;
    private LocalDate dataWaznosci;

    @Override
    public String toString() {
        return "\n" + nazwa + "::" + cena.setScale(2, RoundingMode.UP);
    }

    public Towar(BigDecimal cena, String nazwa, LocalDate dataWaznosci) {
        this.cena = cena;
        this.nazwa = nazwa;
        this.dataWaznosci = dataWaznosci;
    }

    public BigDecimal getCena() { return cena; }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public LocalDate getDataWaznosci() {
        return dataWaznosci;
    }

    public void setDataWaznosci(LocalDate dataWaznosci) {
        this.dataWaznosci = dataWaznosci;
    }
}
