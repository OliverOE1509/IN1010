import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class LesLegeData {
    public static Legemiddel finnLegemiddel(int id, IndeksertListe<Legemiddel> legeMidler) {
        for (int i = 0; i < legeMidler.størrelse(); i++) {
            if (legeMidler.hent(i).id == id) {
                return legeMidler.hent(i);
            } 
        }
        return null;
    }

    public static Pasient finnPasient(int pasientId, IndeksertListe<Pasient> pasientListe) {
        for (int i = 0; i < pasientListe.størrelse(); i++) {
            if (pasientListe.hent(i).hentID() == pasientId) {
                return pasientListe.hent(i);
            }
        }
        return null;
    }

    public static Lege finnLege(String legeNavn, IndeksertListe<Lege> legeListe) {
        for (int i = 0; i < legeListe.størrelse(); i++) {
            if (legeListe.hent(i).hentNavn().equals(legeNavn)) {
                return legeListe.hent(i);
            }
        }
        return null;
    } 

    public static void main (String[] args) {
        IndeksertListe<Pasient> pasientListe = new IndeksertListe<>();
        IndeksertListe<Legemiddel> legemiddelListe = new IndeksertListe<>();
        IndeksertListe<Lege> legeListe = new IndeksertListe<>();
        IndeksertListe<Resept> reseptListe = new IndeksertListe<>();
        try (Scanner sc = new Scanner(new File("legedata.txt"))) {
            String kategori = "";
            while (sc.hasNextLine()) {
                String linje = sc.nextLine();
                if (linje.startsWith("# Pasienter")) {
                    kategori = "pasienter";
                    continue;
                } else if (linje.startsWith("# Legemidler")) {
                    kategori = "legemidler";
                    continue;
                } else if (linje.startsWith("# Leger")) {
                    kategori = "leger";
                    continue;
                } else if (linje.startsWith("# Resepter")) {
                    kategori = "resepter";
                    continue;
                }

                String[] deler = linje.split(",");
                switch (kategori) {
                    case "pasienter":
                        String navn = deler[0].trim();
                        String fødlsnr = deler[1].trim();
                        Pasient pasient = new Pasient(navn, fødlsnr);
                        pasientListe.leggTil(pasientListe.størrelse(), pasient);
                        break;
                    
                    case "legemidler":
                        String lmNavn = deler[0].trim();
                        String type = deler[1].trim();
                        int pris = Integer.parseInt(deler[2]);
                        double mengdeVirkestoff = Double.parseDouble(deler[3].trim());

                        Legemiddel lm = null;

                        String type2 = deler[1];

                        switch (type2) {
                            case "narkotisk", "vanedannende":
                                int styrke = Integer.parseInt(deler[4]);
                                lm = new Narkotisk(lmNavn, pris, mengdeVirkestoff, styrke);
                                break;
                            
                            case "vanlig":
                                lm = new Vanlig(lmNavn, pris, mengdeVirkestoff);
                                break;
                            
                            default:
                                break;
                        }
                        legemiddelListe.leggTil(legemiddelListe.størrelse(), lm);
                        break;
                    
                    case "leger":
                        Lege lege;
                        String legeNavn = deler[0].trim();
                        String kontrollKode = deler[1].trim();
                        if (kontrollKode.equals("0")) {
                            lege = new Lege(legeNavn);
                        } else {
                            lege = new Spesialist(legeNavn, kontrollKode);
                        }
                        legeListe.leggTil(legeListe.størrelse(), lege);
                        break;
                    
                    case "resepter":
                        int legemiddelNummer = Integer.parseInt(deler[0]);
                        Legemiddel legeMiddel_resepter = finnLegemiddel(legemiddelNummer, legemiddelListe);
                        String legeNavn_resepter = deler[1];
                        Lege lege_resepter = finnLege(legeNavn_resepter, legeListe);
                        int pasientID = Integer.parseInt(deler[2]);
                        Pasient pasient_resepter = finnPasient(pasientID, pasientListe);

                        Resept resept = null;

                        switch (deler[3]) {
                            case "hvit":
                                int reit = Integer.parseInt(deler[4]);
                                //resept = new HvitResept(legeMiddel_resepter, lege_resepter, pasient_resepter, reit);
                                try {
                                    resept = lege_resepter.skrivHvitResept(legeMiddel_resepter, pasient_resepter, reit);
                                } catch (UlovligUtskrift e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            
                            case "blå":
                                int reit2 = Integer.parseInt(deler[4]);
                                //resept = new BlåResept(legeMiddel_resepter, lege_resepter, pasient_resepter, reit2);
                                try {
                                    resept = lege_resepter.skrivBlaaResept(legeMiddel_resepter, pasient_resepter, reit2);
                                } catch (UlovligUtskrift e) {
                                    System.out.println(e.getMessage());
                                } 
                                break;

                            case "p":
                                int reit3 = Integer.parseInt(deler[4]);
                                //resept = new PResept(legeMiddel_resepter, lege_resepter, pasient_resepter, reit3);
                                try {
                                    resept = lege_resepter.skrivPResept(legeMiddel_resepter, pasient_resepter, reit3);
                                } catch (UlovligUtskrift e) {
                                    System.out.println(e.getMessage());
                                }
                                break;

                            default:
                                //resept = new MilitærResept(legeMiddel_resepter, lege_resepter, pasient_resepter);
                                try {
                                    resept = lege_resepter.skrivMilResept(legeMiddel_resepter, pasient_resepter);
                                } catch (UlovligUtskrift e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                        }
                        reseptListe.leggTil(resept);
                        break;
                    default:
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("legedata.txt ikke funnet");
            return;
        }

        Legesystem ls = new Legesystem(pasientListe, legemiddelListe, legeListe, reseptListe);
        ls.startMeny();
    }
}
