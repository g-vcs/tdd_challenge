package tdd_project;

import java.util.HashMap;
import java.util.Map;

public class Service {

    public String getNthUpperCharacter(String string, int n) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> counter = new HashMap<>(); //


        if (n < 1 || string == null) { //if n less than zero or string null
            return result.toString();
        }

        for (int i = n - 1; i < string.length(); i += n) {
            char letter = string.charAt(i);

            if (Character.isUpperCase(letter) || //check if is Upper
                    Character.isDigit(letter) || //check if is Number
                    !Character.isLetterOrDigit(letter)) { // check if is not a number or letter (special char)
                result.append(letter);

                if (counter.containsKey(letter)) {
                    counter.put(string.charAt(i), counter.get(letter) + 1);
                } else {
                    counter.put(string.charAt(i), 1);
                }
            }
        }
        //System.out.println(counter);
        System.out.println("Letter = Repetitions");
        for (Map.Entry<Character, Integer> element : counter.entrySet()) {
            System.out.println(element.getKey() + " = " + element.getValue());
        }

        return result.toString();
    }
}
