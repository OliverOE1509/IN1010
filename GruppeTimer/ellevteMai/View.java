import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class View {
    private JLabel label;

    public View(Controller controller) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 400));

        try {
            UIManager.setLookAndFeel(
                UIManager.getCrossPlatformLookAndFeelClassName()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        label = new JLabel("Counter : 0" );
        JButton button = new JButton("Legg til 1");
        button.addActionListener(controller);
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //button.addActionListener(button.);
    }

    public void oppdaterLabel(int count) {
        label.setText("Counter : " + count);
    }


    
}
