package model;

public class Criteria {
    // Characters pool:
    public static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    public static final String NUMBERS = "0123456789";
    public static final String SYMBOLS = "!@#$%^&*()-_=+[]{};:,.<>/?";

    static int upperCaseChoice, lowerCaseChoice, numbersChoice, symbolsChoice;
    
    // Create attributes:
    private boolean includeUpperCase, includeLowerCase, includeNumbers, includeSymbols;

    // Getters
    public boolean isIncludeUpperCase() {
        return includeUpperCase;
    }

    public boolean isIncludeLowerCase() {
        return includeLowerCase;
    }

    public boolean isIncludeNumbers() {
        return includeNumbers;
    }

    public boolean isIncludeSymbols() {
        return includeSymbols;
    }

    // Setters
    public void setIncludeUpperCase(int upperCaseChoice) {
        if (upperCaseChoice == 1) {
            includeUpperCase = true;
        } else includeUpperCase = false;
    }

    public void setIncludeLowerCase(int lowerCaseChoice) {
        if (lowerCaseChoice == 1) {
            includeLowerCase = true;
        } else includeLowerCase = false;
    }

    public void setIncludeNumbers(int numbersChoice) {
        if (numbersChoice == 1) {
            includeNumbers = true;
        } else includeNumbers = false;
    }

    public void setIncludeSymbols(int symbolsChoice) {
        if (symbolsChoice == 1) {
            includeSymbols = true;
        } else includeSymbols = false;
    }

}