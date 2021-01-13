import java.util.ArrayList;

public class Aufgabe {
    /**
     * Erstellen Sie eine Anwendung mit welchem man Aufgaben planen kann.
     * Die Aufgaben haben die folgende Eigenschaften: Name, Priorität (1-4), Notizen und eine Liste von Teilaufgaben.
     * Teilaufgaben sind auch Aufgaben, die eigene Teilaufgaben haben können.
     *
     * Implementieren Sie eine Möglichkeit, die einen solchen Tasks Anwendung erstellt.
     * Man kann eine bestimmte Aufgabe hinzufügen/löschen/ändern und alle Aufgaben erhalten. (2p) Finden Sie eine Möglichkeit um wenn eine Aufgabe gelöscht ist, alle Teilaufgaben rekursiv gelöscht werden. (1p) Schreiben Sie JUnit Testen für implementierte Funktionalität. (1p)
     *
     * Hinweis: 1 Punkt wird für Kode Qualität ausgegeben (Einhaltung der Java Naming Convention, Model-View-Controller Struktur, Kommentare, Lesbarkeit der Kode)
     *
     * Benotung: Top 100 Videospiele (4p) + Task Anwendung (5p) + 1 Punkt von Amtswegen = 10
     * @param args
     */
    private String name;
    private int prioritat;
    private String notize;
    private ArrayList<Aufgabe> teilaufgaben;

    public Aufgabe(String name, int prioritat, String notize, ArrayList<Aufgabe> teilaufgaben) {
        this.name = name;
        this.prioritat = prioritat;
        this.notize = notize;
        this.teilaufgaben = teilaufgaben;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrioritat() {
        return prioritat;
    }

    public void setPrioritat(int prioritat) {
        this.prioritat = prioritat;
    }

    public String getNotize() {
        return notize;
    }

    public void setNotize(String notize) {
        this.notize = notize;
    }

    public ArrayList<Aufgabe> getTeilaufgaben() {
        return teilaufgaben;
    }

    public void setTeilaufgaben(ArrayList<Aufgabe> teilaufgaben) {
        this.teilaufgaben = teilaufgaben;
    }

    @Override
    public String toString() {
        return "Aufgabe{" +
                "name='" + name + '\'' +
                ", prioritat=" + prioritat +
                ", notize='" + notize + '\'' +
                ", teilaufgaben=" + teilaufgaben +
                '}';
    }
}
