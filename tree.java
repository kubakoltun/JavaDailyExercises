public class tree {

    public static void main(String[] args) {
            Drzewo drzewo = new Drzewo(true, 115, "spory");
            System.out.println(drzewo.toString());

            DrzewoIglaste igl = new DrzewoIglaste(true, 12, "sredni", 14, 12);
            System.out.println(igl.toString());


            DrzewoLisciaste lisc = new DrzewoLisciaste(true, 12, "sredni", "okragly");
            System.out.println(lisc.toString());

            DrzewoOwocowe owoc = new DrzewoOwocowe(true, 12, "sredni", "ananas");
            System.out.println(owoc.toString());
        
    }
}

class Drzewo {
    protected boolean wiecznieZielone;
    protected int wysokosc;
    protected String przekrojDrzewa;

    Drzewo(boolean ziel, int wys, String prze) {
        this.wiecznieZielone = ziel;
        this.wysokosc = wys;
        this.przekrojDrzewa = prze;
    }

    public String toString() {
        return "Wiecznie zielone? " + wiecznieZielone + "\nJak wysokie: " + wysokosc + "\nPrzekroj " + przekrojDrzewa;
    }
}
class DrzewoIglaste extends Drzewo {
    private int iloscIgiel;
    private double dlugoscSzyszel;

    DrzewoIglaste(boolean ziel, int wys, String prze, int ilosc, double szysz) {
        super(ziel, wys, prze);
        this.iloscIgiel = ilosc;
        this.dlugoscSzyszel = szysz;
    }

    public String toString() {
        return "Wiecznie zielone? " + wiecznieZielone + "\nJak wysokie: " + wysokosc + "\nPrzekroj " + przekrojDrzewa + "\nIle igiel " + iloscIgiel + "\nJak dlugie szyszki " + dlugoscSzyszel;
    }
}
class DrzewoLisciaste extends Drzewo {
    private String ksztaltLiscia;

    DrzewoLisciaste(boolean ziel, int wys, String prze, String lisc) {
        super(ziel, wys, prze);
        this.ksztaltLiscia = lisc;
    }

    public String toString() {
        return "Wiecznie zielone? " + wiecznieZielone + "\nJak wysokie: " + wysokosc + "\nPrzekroj " + przekrojDrzewa + "\nJaki lisc " + ksztaltLiscia;
    }
}
class DrzewoOwocowe extends Drzewo {
    private String nazwaOwoca;

    DrzewoOwocowe(boolean ziel, int wys, String prze, String nazw) {
        super(ziel, wys, prze);
        this.nazwaOwoca = nazw;
    }

    public String toString() {
        return "Wiecznie zielone? " + wiecznieZielone + "\nJak wysokie: " + wysokosc + "\nPrzekroj " + przekrojDrzewa + "\nJaki owoc" + nazwaOwoca;
    }
}
