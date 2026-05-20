import java.JFrame;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Hendelseshåndtering {
    static int myv = 10;
    public static void main (String[] args) {
        JFrame vindu = new JFrame();
        vindu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vindu.setPreferredSize(new Dimension(200, 200));

        JPanel panel = new JPanel(new BorderLayout(10, 10));
        vindu.add(panel);

        JLabel label = new JLabel("Tallet er : " + myv);
        
        //label.setText("Min verdi er :  " + myv);
        vindu.add(label);

        JButton knapp = new JButtion("Trykk meg!");
        knapp.addActionListener(new ActionListener
        knapp.addActionListener(new HåndterknappTrykk());
        vindu.add(knapp);
        vindu.pack();
        vindu.setLocationRelativeTo(null);
        vindu.setVisible(true);
    }
}
