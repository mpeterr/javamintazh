package oe.java.probaterem.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//egy idopontok mezőben a terem időpontjai tárolja.
//Konstruktorban vegye fel a lehetséges időpontokat (azonosítóval, címkével): (pl. „1”, „Hétfő 18:00-20:00”), ..., („5”, „Péntek 18:00-20:00”)).
//Megjegyzés: a próbaterem foglaltságát a web alkalmazás teljes futása során nyilván kell tartani (valamilyen application scope vagy singleton megoldással).
public class Probaterem {
    private List<Idopont> idopontok = new ArrayList<>();

    public Probaterem() {
        idopontok.add(new Idopont("1", "Hétfő 18:00-20:00", null));
        idopontok.add(new Idopont("2", "Kedd 18:00-20:00", null));
        idopontok.add(new Idopont("3", "Szerda 18:00-20:00", null));
        idopontok.add(new Idopont("4", "Csütörtök 18:00-20:00", null));
        idopontok.add(new Idopont("5", "Péntek 18:00-20:00", null));
    }
}
