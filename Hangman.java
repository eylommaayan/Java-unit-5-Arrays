import java.util.Scanner;

public class Hangman {
    // המילה שהשחקן צריך לנחש
    private static String[] words = {"programming", "java", "hangman", "computer", "developer"};
    // מילה אקראית מתוך הרשימה
    private static String word = words[(int) (Math.random() * words.length)];
    // המילה כפי שהיא נראית לשחקן (עם מקפים לאותיות שעדיין לא נחשפו)
    private static char[] guessedWord = new char[word.length()];
    // מספר הניחושים הנותרים
    private static int remainingGuesses = 6;

    public static void main(String[] args) {
        // אתחול המילה המנוחשת עם מקפים
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '-';
        }

        // סריקה לקליטת קלט מהשחקן
        Scanner scanner = new Scanner(System.in);

        // לולאה ראשית של המשחק
        while (remainingGuesses > 0) {
            // הדפסת המילה המנוחשת עד כה ומספר הניחושים הנותרים
            System.out.println("Word: " + String.valueOf(guessedWord));
            System.out.println("Remaining guesses: " + remainingGuesses);
            System.out.print("Enter a letter: ");

            // קליטת האות מהשחקן
            char guess = scanner.next().charAt(0);

            // בדיקה אם האות נמצאת במילה
            boolean correctGuess = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            // אם האות לא נמצאה, הפחתת מספר הניחושים הנותרים
            if (!correctGuess) {
                remainingGuesses--;
            }

            // בדיקה אם השחקן ניחש את כל המילה
            if (String.valueOf(guessedWord).equals(word)) {
                System.out.println("Congratulations! You've guessed the word: " + word);
                break;
            }
        }

        // אם נגמרו הניחושים, הדפסת הודעה לשחקן
        if (remainingGuesses == 0) {
            System.out.println("Sorry, you've run out of guesses. The word was: " + word);
        }

        scanner.close();
    }
}
