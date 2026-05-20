import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Legesystem {
    IndeksertListe<Pasient> pasientListe;
    IndeksertListe<Legemiddel> legemiddelListe;
    IndeksertListe<Lege> legeListe;
    IndeksertListe<Resept> reseptListe;

    public Legesystem(IndeksertListe<Pasient> pl, 
        IndeksertListe<Legemiddel> lml,
        IndeksertListe<Lege> ll,
        IndeksertListe<Resept> rl
    ) {
        this.pasientListe = pl;
        this.legemiddelListe = lml;
        this.legeListe = ll;
        this.reseptListe = rl;
    }

    public void skrivUtAlleData() {
        System.out.println("Pasient liste: " + pasientListe.toString());
        System.out.println("Legemiddel liste: " + legemiddelListe.toString());
        System.out.println("Lege liste: " + legeListe.toString());
        System.out.println("Resept liste: " + reseptListe.toString());
    }

    public void skrivUtAlleStat() {

        System.out.println("Too bad");

    }

    public void leggTilPasient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Navn? \n");
        String navn = sc.nextLine();
        System.out.println("fødselsnr? \n");
        String fnr = sc.nextLine();
        Pasient pasient = new Pasient(navn, fnr);
        pasientListe.leggTil(pasientListe.størrelse(), pasient);
    }

    public void leggTilLegemiddel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Navn? \n");
        String navn = sc.nextLine();
        System.out.println("Pris? \n");
        int pris = sc.nextInt();
        System.out.println("Mengde? \n");
        double mengde = sc.nextDouble();
        System.out.println("Er det: \n0. vanlig\n1. narkotisk\n2. vanedannende");
        String type = sc.nextLine().trim();
        Legemiddel lm = null;
        switch (type) {
            case "vanlig":
                lm = new Vanlig(navn, pris, mengde);
                break;

            case "narkotisk", "vanedannende":
                System.out.println("Styrke: ");
                int styrke = sc.nextInt();
                lm = new Narkotisk(navn, pris, mengde, styrke);
                break;
        }
        legemiddelListe.leggTil(legemiddelListe.størrelse(), lm);
    }

    public void leggTilLege() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Navn?\n");
            String name = sc.nextLine();
            System.out.println("Kontrollnr? (0 hvis ikke spesialist)\n");
            String kontrollkode = sc.nextLine(); 

            Lege lege;   
            if (kontrollkode.equals("0")) {
                lege = new Lege(name);
            } else {
                lege = new Spesialist(name, kontrollkode);
            }
            legeListe.leggTil(legeListe.størrelse(), lege);
        }
    }

    public void leggTilResept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Legemiddel navn? \n");
        String legemiddelNavn = sc.nextLine();
        Legemiddel valgtLegemiddel = null;
        for (Legemiddel lm : legemiddelListe) {
            if (lm.navn.equals(legemiddelNavn)) {
                valgtLegemiddel = lm;
            }
        }
        System.out.println("lege navn? \n");
        String legeNavn = sc.nextLine();
        Lege valgtLege = null;
        for (Lege l : legeListe) {
            if (l.hentNavn().equals(legeNavn)) {
                valgtLege = l;
            }
        }
        System.out.println("Pasient-ID? \n");
        int pasientID = sc.nextInt();
        Pasient pasient = null;
        for (Pasient p : pasientListe) {
            if (p.hentID() == pasientID) {
                pasient = p;
                break;
            }
        }
        System.out.println("Alternativer (skriv første ordet i alternativene):\n0. hvit resept\n1. blaa resept\n2. militær resept\n3. presept");
        String valg = sc.nextLine();
        Resept resept = null;
        switch (valg) {
            case "hvit", "blaa", "presept":
                int reit = sc.nextInt();
                resept = new HvitResept(valgtLegemiddel, valgtLege, pasient, reit);
                break;
            
            case "militær":
                resept = new MilitærResept(valgtLegemiddel, valgtLege, pasient);
                break;
        }
        reseptListe.leggTil(reseptListe.størrelse(), resept);

    }

    public void avslutt() {
        System.exit(0);
    }

    public void brukResept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("PasientID? \n");
        int pasientID = sc.nextInt();
        for (Resept r : reseptListe) {
            if (r.hentPasientId() == pasientID) {
                r.bruk();
            }
        }
        sc.close();
    }

    public void skrivUtDataPåFil() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Navn på fil? \n");
        String filnavn = sc.nextLine();
        try (PrintWriter writer = new PrintWriter(filnavn)) {
            // Write pasienter
            writer.println("# Pasienter (navn, fnr)");
            for (Pasient p : pasientListe) {
                writer.println(p.hentNavn() + "," + p.hentFødselsNr());
            }
            writer.println();
            
            // Write legemidler
            writer.println("# Legemidler (navn,type,pris,virkestoff,[styrke])");
            for (Legemiddel lm : legemiddelListe) {
                if (lm instanceof Narkotisk) {
                    Narkotisk nark = (Narkotisk) lm;
                    writer.println(lm.hentNavn() + ",narkotisk," + lm.hentPris() + "," + lm.mengdeVirkestoff + "," + nark.styrke);
                } else if (lm instanceof Vanedannende) {
                    Vanedannende vaned = (Vanedannende) lm;
                    writer.println(lm.hentNavn() + ",vanedannende," + lm.hentPris() + "," + lm.mengdeVirkestoff + "," + vaned.styrke);
                } else {
                    writer.println(lm.hentNavn() + ",vanlig," + lm.hentPris() + "," + lm.mengdeVirkestoff);
                }
            }
            writer.println();
            
            // Write leger
            writer.println("# Leger (navn,kontrollkode / 0 hvis vanlig lege)");
            for (Lege l : legeListe) {
                if (l instanceof Spesialist) {
                    Spesialist s = (Spesialist) l;
                    writer.println(l.hentNavn() + "," + s.hentKontrollkode());
                } else {
                    writer.println(l.hentNavn() + ",0");
                }
            }
            writer.println();
            
            // Write resepter
            writer.println("# Resepter (legemiddelNummer,legeNavn,pasientID,type,[reit])");
            for (Resept r : reseptListe) {
                // Find legemiddel index/number
                int lmIndex = 0;
                for (int i = 0; i < legemiddelListe.størrelse(); i++) {
                    if (legemiddelListe.hent(i).equals(r.hentLegemiddel())) {
                        lmIndex = i;
                        break;
                    }
                }
                
                String type = "";
                if (r instanceof HvitResept) {
                    type = "hvit";
                    writer.println(lmIndex + "," + r.hentLege().hentNavn() + "," + r.hentPasientId() + "," + type + "," + r.hentReit());
                } else if (r instanceof BlåResept) {
                    type = "blaa";
                    writer.println(lmIndex + "," + r.hentLege().hentNavn() + "," + r.hentPasientId() + "," + type + "," + r.hentReit());
                } else if (r instanceof MilitærResept) {
                    type = "militaer";
                    writer.println(lmIndex + "," + r.hentLege().hentNavn() + "," + r.hentPasientId() + "," + type);
                } else if (r instanceof PResept) {
                    type = "p";
                    writer.println(lmIndex + "," + r.hentLege().hentNavn() + "," + r.hentPasientId() + "," + type + "," + r.hentReit());
                }
            }
            
            System.out.println("Alle data skrevet på " + filnavn);
        
        } catch (FileNotFoundException e ) {
            System.out.println("Kunne ikke opprette filen: " + e.getMessage());
        }

    }

    public void startMeny() {
        boolean running = true;
        Scanner sc = new Scanner(System.in);

        while (running) {
            System.out.println("0. Avslutt");
            System.out.println("1. Skriv ut alle data");
            System.out.println("2. Skriv ut statistikk");
            System.out.println("3. Legg til lege");
            System.out.println("4. Legg til legemiddel");
            System.out.println("5. Legg til pasient");
            System.out.println("6. Legg til resept");
            System.out.println("7. Bruk resept");
            System.out.println("8. Skrive ut alle data paa fil");


            int valg = Integer.parseInt(sc.nextLine());
            try {
                switch (valg) {
                    case 0:
                        avslutt();
                        break;
                    case 1:
                        skrivUtAlleData();
                        break;
                    case 2:
                        skrivUtAlleStat();
                        break;
                    case 3:
                        leggTilLege();
                        break;
                    case 4:
                        leggTilLegemiddel();
                        break;
                    case 5:
                        leggTilPasient();
                        break;
                    case 6:
                        leggTilResept();
                        break;
                    case 7:
                        brukResept();
                        break;
                    case 8:
                        skrivUtDataPåFil();
                        break;
                }   
            } catch (NumberFormatException e) {
                System.out.println("Må være et tall");
            }
           
        }
    }

}
