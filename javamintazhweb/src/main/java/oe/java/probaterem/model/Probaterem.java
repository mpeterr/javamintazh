package oe.java.probaterem.model;

//egy idopontok mezőben a terem időpontjai tárolja.
//Konstruktorban vegye fel a lehetséges időpontokat (azonosítóval, címkével): (pl. „1”, „Hétfő 18:00-20:00”), ..., („5”, „Péntek 18:00-20:00”)).
//Megjegyzés: a próbaterem foglaltságát a web alkalmazás teljes futása során nyilván kell tartani (valamilyen application scope vagy singleton megoldással).
public class Probaterem {
    private String idopontok;

    public String getIdopontok() {
        return idopontok;
    }

    public void setIdopontok(String idopontok) {
        this.idopontok = idopontok;
    }

    public Probaterem(String idopontok) {
        this.idopontok = idopontok;
    }
}
