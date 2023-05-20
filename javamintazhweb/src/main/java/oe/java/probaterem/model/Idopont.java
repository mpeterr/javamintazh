package oe.java.probaterem.model;

//    három szöveges mezővel: azonosito, cimke, foglalas.
//    A cimke mező az időpont szöveges megjelenítését fogja tartalmazni (pl. „Hetfő 18:00-20:00”).
//    Az azonosito egyedi string értékek (pl. „1”, „2”, ...).
//    A foglalas mező null értéke azt fogja jelenteni, hogy ez az időpont még nincs lefoglalva, egyébként a lefoglaló e-mail címe.
public class Idopont {
    private String azonosito; //pl. „1”, „2”, ...
    private String cimke; //pl. „Hetfő 18:00-20:00”
    private String foglalas; //null vagy foglaló emailje

    public String getAzonosito() {
        return azonosito;
    }

    public void setAzonosito(String azonosito) {
        this.azonosito = azonosito;
    }

    public String getCimke() {
        return cimke;
    }

    public void setCimke(String cimke) {
        this.cimke = cimke;
    }

    public String getFoglalas() {
        return foglalas;
    }

    public void setFoglalas(String foglalas) {
        this.foglalas = foglalas;
    }

    public Idopont(String azonosito, String cimke, String foglalas) {
        this.azonosito = azonosito;
        this.cimke = cimke;
        this.foglalas = foglalas;
    }

    public Idopont() {
    }

    @Override
    public String toString() {
        return "Idopont{" +
                "azonosito='" + azonosito + '\'' +
                ", cimke='" + cimke + '\'' +
                ", foglalas='" + foglalas + '\'' +
                '}';
    }
}
