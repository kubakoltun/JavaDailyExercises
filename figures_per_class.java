public class figures {
    public static void main(String[] args) {
        {
            Prostokat prostoka = new Prostokat(2, 3);
            prostoka.pp();

            Prostopadloscian prosto = new Prostopadloscian(2, 3, 4);
            prosto.show();

            Trojkat tr = new Trojkat(2, 3);
            tr.pp();

            Ostroslup ost = new Ostroslup(2, 3, 4);
            ost.show();
        }
    }
}

class Prostokat {
    protected int bokA;
    protected int bokB;

    Prostokat(int a, int b) {
        bokA = a;
        bokB = b;
    }

    void pp() {
        System.out.println(bokA*bokB);
    }
}
class Prostopadloscian extends Prostokat {
    private int bokC;

    Prostopadloscian(int a, int b, int c) {
        super(a, b);
        bokC = c;
    }

    void show() {
        System.out.println("pp "+2*bokA*bokB + 2*bokA*bokC + 2*bokB*bokC);
        System.out.println("V " + bokA*bokB*bokC);
    }
}
class Trojkat {
    protected int dlugosc_podstawy;
    protected int wysokosc;

    Trojkat(int dl, int wy) {
        dlugosc_podstawy = dl;
        wysokosc = wy;
    }

    void pp() {
        System.out.println((dlugosc_podstawy*wysokosc)/2);
    }
}
class Ostroslup extends Trojkat {
    private int h;

    Ostroslup(int dl, int wys, int h) {
        super(dl, wys);
        this.h = h;
    }

    void show() {
        System.out.println("p "+((dlugosc_podstawy*wysokosc)/2*h)*3);
        System.out.println("V "+(1/3*(dlugosc_podstawy*wysokosc)/2)*h);
    }
}
