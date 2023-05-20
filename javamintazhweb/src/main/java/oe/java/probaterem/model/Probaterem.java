package oe.java.probaterem.model;

import java.util.Map;

//egy idopontok mezőben a terem időpontjai tárolja.
//Konstruktorban vegye fel a lehetséges időpontokat (azonosítóval, címkével): (pl. „1”, „Hétfő 18:00-20:00”), ..., („5”, „Péntek 18:00-20:00”)).
//Megjegyzés: a próbaterem foglaltságát a web alkalmazás teljes futása során nyilván kell tartani (valamilyen application scope vagy singleton megoldással).
public class Probaterem {
    private Map<String, String> idopontok;

    public Map<String, String> getIdopontok() {
        return idopontok;
    }

    public void setIdopontok(Map<String, String> idopontok) {
        this.idopontok = idopontok;
    }

    public Probaterem(Idopont idopont) {
        idopontok.put(idopont.getAzonosito(),idopont.getCimke());
    }
}
