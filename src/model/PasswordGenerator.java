package model;

import java.util.Random;

public class PasswordGenerator extends Criteria {
    
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
        if (includeUpperCase) validCharacters += Criteria.UPPER_CASE;
        if (includeLowerCase) validCharacters += Criteria.LOWER_CASE;
        if (includeNumbers) validCharacters += Criteria.NUMBERS;
        if (includeSymbols) validCharacters += Criteria.SYMBOLS;


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
