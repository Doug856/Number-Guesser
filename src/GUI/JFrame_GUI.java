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
        setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();


        addTitleLabel( gbc);
        addEnterBar(gbc);
        addEnterBtn(gbc);
        addGeneratedNumber(gbc);
        addConfirmLabel(gbc);

        setVisible(true);
    }

    public void addTitleLabel(GridBagConstraints gbc) {
        title = new JLabel("Number Guesser");
        add(title,gbc);
    }

    public void addEnterBar(GridBagConstraints gbc) {
        enterBar = new JTextField();
        add(enterBar,gbc);
    }

    public void addEnterBtn(GridBagConstraints gbc) {
        btnEnter = new JButton("Enter");
        add(btnEnter,gbc);
    }

    public void addGeneratedNumber(GridBagConstraints gbc) {
        generatedNumber = new JLabel("");
        add(generatedNumber,gbc);
    }

    public void addConfirmLabel(GridBagConstraints gbc) {
        confirmLabel = new JLabel("");
        add(confirmLabel,gbc);
    }


}
