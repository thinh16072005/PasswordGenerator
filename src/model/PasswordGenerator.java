package model;

import java.util.Random;

public class PasswordGenerator  {

    public static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>/?";
    
    // Create Random object:
    private final Random rand;

    // Constructor:
    public PasswordGenerator() {
        rand = new Random();
    }

    // Method to randomly generate password with criteria:

    public String generatePassword(
        int length, 
        boolean includeUpperCase,
        boolean includeLowerCase,
        boolean includeNumbers,
        boolean includeSymbols) 
    {

        StringBuilder passwordBuilder = new StringBuilder();

        String validCharacters = "";

        // model.Criteria of a password:
        if (includeUpperCase) validCharacters += UPPER_CASE;
        if (includeLowerCase) validCharacters += LOWER_CASE;
        if (includeNumbers) validCharacters += NUMBERS;
        if (includeSymbols) validCharacters += SYMBOLS;


        // Generate a password:
        for (int i = 0; i < length; i++) {
            // Generate password index:
            int passwordIndex = rand.nextInt(validCharacters.length());

            // Get the characters based on the index:
            char getCharacterIndex = validCharacters.charAt(passwordIndex);

            // Store characters in passwordBuilder:
            passwordBuilder.append(getCharacterIndex);
        }
        return passwordBuilder.toString();
    } 
}
