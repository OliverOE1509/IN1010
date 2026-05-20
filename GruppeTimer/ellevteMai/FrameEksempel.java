import java.awt.*;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import java.awt.event.*;

class FrameEksempel {
    public static int count = 0;   
    public static void main (String[] args) {
         
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
        JLabel label = new JLabel("Count :" + count);

        class AddCounter implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count : NUTTTTT" + count);
                //System.out.println(count);
            }
        }
        JButton button = new JButton("Legg til 1");
        button.addActionListener(new AddCounter());

        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}