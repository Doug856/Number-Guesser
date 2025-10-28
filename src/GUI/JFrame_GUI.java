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
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setResizable(false);
        setLayout(new GridBagLayout());

        addTitleLabel();
        addInputSection();
        addGeneratedNumber();
        addConfirmLabel();

        setVisible(true);
    }

    public void addTitleLabel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 20, 10);

        title = new JLabel("Number Guesser");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, gbc);
    }

    public void addInputSection() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        // panel to hold text field + button
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

        enterBar = new JTextField(15);
        enterBar.setPreferredSize(new Dimension(250, 45)); // height will now apply

        btnEnter = new JButton("Enter");
        btnEnter.setPreferredSize(new Dimension(100, 45));

        inputPanel.add(enterBar);
        inputPanel.add(btnEnter);

        add(inputPanel, gbc);
    }

    public void addGeneratedNumber() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 10, 10, 10);

        generatedNumber = new JLabel("Test", SwingConstants.CENTER);
        generatedNumber.setFont(new Font("Arial", Font.BOLD, 22));
        add(generatedNumber, gbc);
    }

    public void addConfirmLabel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        confirmLabel = new JLabel("Test", SwingConstants.CENTER);
        add(confirmLabel, gbc);
    }
}
