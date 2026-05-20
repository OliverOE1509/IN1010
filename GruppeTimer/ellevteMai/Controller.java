import java.awt.event.*;
import javax.swing.*;

public class Controller implements ActionListener {
    public Mode mode;
    public View view;

    public Controller()  {
        this.mode = new Mode();
        this.view = new View(this);
        //this.view.button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mode.add();
        view.oppdaterLabel(mode.getCount());
    }
}
