package Eksamensøving;

class BrukHare {
    public static void main(String[] args) {
        Hare skogshare = new Hare("Bjørk");
        Hare sesonghare = new Påskehare("Påsan", 999);
        Høne burhøne = new Høne();

        //System.out.println(sesonghare instanceof Påskehare);

        // Hvilke av disse 10 linjene er lovlige som neste linje?
        Påskehare h1 = (Påskehare) sesonghare;
        Egglegger h2 = (Påskehare) sesonghare;
        /*Egglegger h3 = burhøne;
        Egglegger h4 = (Egglegger) skogshare;
        Påskehare h5 = (Påskehare) sesonghare;
        Egglegger h6 = (Hare) sesonghare;
        Hare h7 = sesonghare;
        Egglegger h8 = (Egglegger) sesonghare;
        Egglegger h9 = skogshare;
        Påskehare h10 = (Påskehare) skogshare;*/
    }
}
