import java.util.List;

public class AufgabenListe {
    private List<Aufgabe> aufgaben;

    /**
     * methode fur loschen
     * @param a aufgabe a die geloscht wird
     * @return bool true wenn ja
     */
    public boolean loschen(Aufgabe a){
        return aufgaben.remove(a);
    }

    /**
     * methode fur einfugen
     * @param a aufgabe a die eingefugt wird
     * @return bool true wenn ja
     */
    public boolean einfugen(Aufgabe a){
        return aufgaben.add(a);
    }

    /**
     * methode fur andern
     * @param a aufgabe a die geandert wird
     * @return bool true wenn ja
     */
    public boolean andern(Aufgabe a){
        for(Aufgabe ag :aufgaben){
            if(ag.getName()==a.getName()) {
                ag.setTeilaufgaben(a.getTeilaufgaben());
                ag.setNotize(a.getNotize());
                ag.setPrioritat(a.getPrioritat());
                return true;
            }
        }
        return false;
    }

    public List<Aufgabe> getAlleAufgaben(){
        return aufgaben;
    }
}
