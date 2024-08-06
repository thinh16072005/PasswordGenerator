public class Criteria {
    int upperCaseChoice, lowerCaseChoice, numbersChoice, symbolsChoice;

    // Create attributes:
    private boolean includeUpperCase;
    private boolean includeLowerCase;
    private boolean includeNumbers;
    private boolean includeSymbols;

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
    public void setIncludeUpperCase(boolean includeUpperCase) {
        if (upperCaseChoice == 1) {
            includeUpperCase = true;
        } else includeUpperCase = false;
    }

    public void setIncludeLowerCase(boolean includeLowerCase) {
        if (lowerCaseChoice == 1) {
            includeLowerCase = true;
        } else includeLowerCase = false;
    }

    public void setIncludeNumbers(boolean includeNumbers) {
        if (numbersChoice == 1) {
            includeNumbers = true;
        } else includeNumbers = false;
    }

    public void setIncludeSymbols(boolean includeSymbols) {
        if (symbolsChoice == 1) {
            includeSymbols = true;
        } else includeSymbols = false;
    }

}