package GUI;

import javax.swing.*;
import java.awt.*;

/**
 * The {@code JFrame_GUI} class represents the main user interface
 * for the Number Guesser program.
 * <p>
 * It extends {@link JFrame} and contains all GUI components, including
 * labels, a text field for user input, and a button to submit guesses.
 * <p>
 * This class is responsible for creating, laying out, and managing
 * the visual elements of the application.
 *
 * @author Douglass Duncan
 * @version 1.0
 * @IDE IntelliJ IDEA
 * @since 2025-10-28
 */
public class JFrame_GUI extends JFrame {

    /**
     * Title label displayed at the top of the window.
     */
    private JLabel title;
    /** Text field where the user enters their guessed number. */
    private JTextField enterBar;
    /** Button that submits the user's input for checking. */
    private JButton btnEnter;
    /** Label that displays the randomly generated number. */
    private JLabel generatedNumber;
    /** Label that confirms whether the user's guess was correct or not. */
    private JLabel confirmLabel;

    /**
     * Constructs the main JFrame window for the Number Guesser game.
     * <p>
     * Initializes window properties such as size, layout, and default close operation.
     * Calls methods to add all GUI components.
     * </p>
     */
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

    /**
     * Adds the title label to the GUI.
     * <p>
     * The title is centered at the top and uses a bold font for emphasis.
     * </p>
     */
    private void addTitleLabel() {
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

    /**
     * Adds the input section containing the JTextField and JButton.
     * <p>
     * Users enter their guess in the text field and click the button to submit.
     * An ActionListener is attached to the button to handle click events.
     * </p>
     */
    private void addInputSection() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));

        enterBar = new JTextField(15);
        enterBar.setPreferredSize(new Dimension(250, 45));
        enterBar.setText("Number between 1-10");

        btnEnter = new JButton("Enter");
        btnEnter.setPreferredSize(new Dimension(100, 45));

        // Attach button click handler
        btnEnter.addActionListener(e -> btnEnterClicked());

        inputPanel.add(enterBar);
        inputPanel.add(btnEnter);

        add(inputPanel, gbc);
    }

    /**
     * Adds a label to display the randomly generated number.
     * <p>
     * The label is centered horizontally and uses a larger font to make it
     * clearly visible to the user.
     * </p>
     */
    private void addGeneratedNumber() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(20, 10, 10, 10);

        generatedNumber = new JLabel("", SwingConstants.CENTER);
        generatedNumber.setFont(new Font("Arial", Font.BOLD, 22));
        add(generatedNumber, gbc);
    }

    /**
     * Adds the confirmation label which shows feedback on the user's guess.
     * <p>
     * Displays messages for correct/incorrect guesses or invalid input.
     * The label is centered and uses a readable font size.
     * </p>
     */
    private void addConfirmLabel() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.insets = new Insets(10, 10, 10, 10);

        confirmLabel = new JLabel("", SwingConstants.CENTER);
        confirmLabel.setFont(new Font("Arial", Font.BOLD, 15));
        add(confirmLabel, gbc);
    }

    /**
     * Handles the action when the Enter button is clicked.
     * <p>
     * Reads the user input from the text field, generates a random number
     * between 1 and 10, updates the generated number label, and sets the
     * confirmation label with appropriate color-coded feedback.
     * </p>
     *
     * @throws NumberFormatException if the user input is not a valid integer
     */
    public void btnEnterClicked() {
        try {
            int uNum = Integer.parseInt(enterBar.getText());
            int randomNum = (int) (Math.random() * 10) + 1;
            generatedNumber.setText(String.valueOf(randomNum));
            enterBar.setText("");

            if (uNum == randomNum) {
                confirmLabel.setText("You guessed correct!!!!");
                confirmLabel.setForeground(Color.GREEN);
            } else {
                confirmLabel.setText("You guessed incorrect!!");
                confirmLabel.setForeground(Color.RED);
            }
        } catch (NumberFormatException e) {
            confirmLabel.setText("Please Enter A Number");
            confirmLabel.setForeground(Color.RED);
        }
    }
}



