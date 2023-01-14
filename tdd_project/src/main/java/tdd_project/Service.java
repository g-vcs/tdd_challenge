package tdd_project;

public class Service {

    public String getNthUpperCharacter(String string, int n) {
        StringBuilder result = new StringBuilder();

        if (n < 1) {
            return result.toString();
        }

        for (int i = n - 1; i < string.length(); i += n) {
            if (Character.isUpperCase(string.charAt(i))) {
                result.append(string.charAt(i));
            }
        }
        //System.out.println("result is: " + result);
        return result.toString();
    }
}
