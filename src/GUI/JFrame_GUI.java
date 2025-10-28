package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrame_GUI extends JFrame {

    private JLabel title;
    private JTextField enterBar;
    private JButton btnEnter;
    private JLabel generatedNumber;
    private JLabel confirmLabel;


    public JFrame_GUI() {
        super("Number Guesser");
        setSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

    }

    public void addTitleLabel() {
        title = new JLabel("Number Guesser");
    }

    public void addEnterBar() {
        enterBar = new JTextField();
    }

    public void addEnterBtn() {
        btnEnter = new JButton("Enter");
    }

    public void addGeneratedNumber() {
        generatedNumber = new JLabel("");
    }

    public void addConfirmLabel() {
        confirmLabel = new JLabel("");
    }


}
