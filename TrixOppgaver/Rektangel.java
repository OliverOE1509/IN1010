package TrixOppgaver;

class Rektangel {
    double l;
    double b;

    public Rektangel (double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void oekLengde (int okning) {
        l+= okning;
    }

    public void oekBredde (int okning) {
        b += okning;
    }

    public void reduserLengde(double redusering) {
        if (l - redusering > 0) {
            l -= redusering;
        }
    }

    public void reduserBredde(double redusering) {
        if (b - redusering > 0) {
            b -= redusering;
        }
    }

    public double areal () {
        return l * b;
    }

    public double omkrets () {
        return 2 * b + 2 *l;
    }



    @Override
    public String toString() {
        String retStr = "Lengde: " + l +
        "\nBredde: " + b + 
        "\nAreal: " + areal() + 
        "\nOmkrets: " + omkrets() + "\n";
        return retStr;
    }

}