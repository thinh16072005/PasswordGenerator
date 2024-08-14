package view;/* The UI of the password generator app */
// This will inherit the JFrame superclass
import model.PasswordGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasswordGeneratorGUI extends JFrame {
    // Create object from model.PasswordGenerator class
    PasswordGenerator generator;

    // Create the constructor
    public PasswordGeneratorGUI() {
        super("Password Generator");

        // Set the size of the UI
        setSize(540, 570);

        // Prevent the UI from being able to resized:
        setResizable(false);

        // Set the layout to be null to have control over the position of our components in the app
        setLayout(null);

        // Terminate the program when the GUI is closed (end the process)
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Center the GUI to the screen:
        setLocationRelativeTo(null);

        // Init password generator:
        generator = new PasswordGenerator();

        // Render GUI components:
        addGuiComponents();
    }

    private void addGuiComponents() {
        // Create title text:
        JLabel title = new JLabel("Password Generator");
        title.setFont(new Font("Dialog", Font.BOLD, 32));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setBounds(0, 10, 500, 39);
        add(title);

        // Create result text area:
        JTextArea passwordOutput = new JTextArea();
        passwordOutput.setEditable(false); // Prevent the editing
        passwordOutput.setFont(new Font("Dialog", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(passwordOutput); // Add the scroll-ability when the output is too long
        scrollPane.setBounds(25, 97, 479, 50);
        scrollPane.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(scrollPane);

        /* Create password length input: */
        // The text field:
        JTextArea passwordLengthInput = new JTextArea();
        passwordLengthInput.setFont(new Font("Dialog", Font.PLAIN, 12));
        passwordLengthInput.setBounds(480, 215, 25, 25);
        passwordLengthInput.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(passwordLengthInput);
        // The 'Password length' label:
        JLabel passwordLengthLabel = new JLabel("Password Length:");
        passwordLengthLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        passwordLengthLabel.setBounds(350, 210, 150, 39);
        add(passwordLengthLabel);


        /* Create buttons */
        // Uppercase button:
        JToggleButton upperCaseButton = new JToggleButton("Uppercase");
        upperCaseButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        upperCaseButton.setBounds(25, 302, 225, 56);
        add(upperCaseButton);

        // Lowercase button:
        JToggleButton lowerCaseButton = new JToggleButton("Lowercase");
        lowerCaseButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        lowerCaseButton.setBounds(282, 302, 225, 56);
        add(lowerCaseButton);

        // Special symbols button:
        JToggleButton symbolsButton = new JToggleButton("Symbols");
        symbolsButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        symbolsButton.setBounds(25, 373, 225, 56);
        add(symbolsButton);

        // Numbers button:
        JToggleButton numbersButton = new JToggleButton("Numbers");
        numbersButton.setFont(new Font("Dialog", Font.PLAIN, 20));
        numbersButton.setBounds(282, 372, 225, 56);
        add(numbersButton);

        // Create 'Generate' Button:
        JButton generateButton = new JButton("Generate");
        generateButton.setFont(new Font("Dialog", Font.BOLD, 20));
        generateButton.setBounds(155, 450, 222, 56);
        // Link the password generation action to the button:
        generateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validation: only passwordLengthLabel > 8 and one of the toggled button is activated:
                if (passwordLengthInput.getText().length() < 8) return;
                boolean anyToggleSelected = upperCaseButton.isSelected() ||
                                            lowerCaseButton.isSelected() ||
                                            symbolsButton.isSelected() ||
                                            numbersButton.isSelected();
                // Generate password:
                // Convert text to integer:
                int passwordLength = Integer.parseInt(passwordLengthInput.getText());
                if (anyToggleSelected) {
                    String generatedPassword = generator.generatePassword(
                            passwordLength,
                            upperCaseButton.isSelected(),
                            lowerCaseButton.isSelected(),
                            symbolsButton.isSelected(),
                            numbersButton.isSelected()
                    );
                    // Display password back to user:
                    passwordOutput.setText(generatedPassword);
                }
            }
        });
        add(generateButton);
    }
}
