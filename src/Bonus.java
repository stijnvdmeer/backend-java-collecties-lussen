import java.util.*;

public class Bonus {

    public static void main(String[] args) {

        // Onderstaande code is uitgecommentarieerd. Haal de code uit de comment (delete /* en */) om aan de slag te gaan met de bonus
        // In de code staan op verschillende plekken comments tussen "/*...*/" als hint wat je moet doen


        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback(stringnumber);

    }
    public static HashSet randomnumbergenerator() {
        Random rand = new Random();
        HashSet<Integer> set = new HashSet<Integer>();
        while(set.size() < 4){
            set.add(rand.nextInt(10));
        }
        return set;
    }

    public static String setToStringConverter(HashSet<Integer> set) {
        String string = "";
        for (Integer element : set) {
            string = string + element;
        }
        return string;
    }



    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        boolean play = true;
        while (play) {
            System.out.println("+ = juiste nummer op de juiste plek, - = juiste nummer verkeerde plek, X = verkeerde nummer");
            System.out.println("Doe een gok, Let op vul 4 getallen in.");
            String guess = scanner.nextLine();
            if (Objects.equals(guess, stringnumber)) {
                System.out.println("gefeliciteerd je hebt het goed");
                play = false;
            } else {
                for (int i = 0; i < 4; i++) {
                    if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                        feedback.append("+");
                    } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                        feedback.append("-");
                    } else {
                        feedback.append("X");
                    }
                }
            }
            System.out.println(feedback.toString());
            feedback.delete(0 , feedback.length());
        }
    }
}
// Hashset was een slechte keuze omdat er in hashsets geen dubbele waardes kunnen staan.
// Hierdoor zijn er minder antwoord mogelijkheden.