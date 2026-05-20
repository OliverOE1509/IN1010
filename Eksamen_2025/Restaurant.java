package Eksamen_2025;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Restaurant {
    Samling<Ansatt> ansatte = new Samling<>(25);
    Samling<Bord> bord = new Samling<>(15);

    public Kelner finnMinstÅGjøre(boolean erVinkelner) {
        Kelner minstHittil = null;
        for (Ansatt a : ansatte) {
            if (a instanceof Vinkelner && erVinkelner || a instanceof Kelner && !erVinkelner) {
                Kelner kx = (Kelner) kx;
                if (minstHittil == null || kx.antallServerer() < minstHittil.antallServerer()) {
                    minstHittil = kx;
                }
            }
        }
    }

    public void taImotGjester(Gjestegruppe gruppe) {
        int antall = gruppe.antall(); // Bruker rekursiv metode
        Bord aktueltBord = null; // Må instansiere et aktuelt bord
        for (Bord b : bord) { // Vi har bord som er en samling med bord i restauranten
            if (b.antPlasser >= antall) {
                aktueltBord = b; // Siden vi vil bare tildele et aktuelt bord, tar vi første vi finner
                break;
            }
        }
        aktueltBord.gjester = gruppe; // Tildel det aktuelle bordet sin gjestegruppe som input parameteret
        aktueltBord.kelner = finnMinstÅGjøre(gruppe.noenØnskerVin()); // Bruker metoden finnMinstÅGjøre for å finne mest ledige kelner. NoenÆnskerVin bruker vi som parameter til finnMinstÅGjøre
        aktuellKelner = aktueltBord.kelner;
        aktuellKelner.kelnerBord.settInn(aktueltBord);
        if (aktueltBord == null) { // Hvis det ikke ble funnet noe bord, får vi opp en melding i et GUI om at det ikke er et ledig bord.
            visskilt();
            return null;
        }
    }

    private void visskilt() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(100, 100));
        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Beklager, restauranten er full :(");

        class exitButton implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                system.exit(1);
            }
        }
        JButton button = new JButton("Ok");
        button.addActionListener(new exitButton());

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
