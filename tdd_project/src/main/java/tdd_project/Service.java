package tdd_project;

public class Service {

    public String getNthUpperCharacter(String string, int n) {
        StringBuilder result = new StringBuilder();

        if (n < 1 || string == null) { //if n less than zero or string null
            return result.toString();
        }

        for (int i = n - 1; i < string.length(); i += n) {
            if (Character.isUpperCase(string.charAt(i)) || //check if is Upper
                    Character.isDigit(string.charAt(i)) || //check if is Number
                    !Character.isLetterOrDigit(string.charAt(i))) { // check if is not a number or letter (special char)
                result.append(string.charAt(i));
            }
        }

        return result.toString();
    }
}
