/**
 * מינימום ומקסימום:
כתוב תכנית המבצעת את המשימות הבאות:
- הדפסת המספר המינמלי והמספר המקסימלי במערך
- הדפסת מספר ההופעות של מספר מקסימלי
- הדפסת המציינים של תאי המערך השווים למספר המקסימלי במערך
 */

public class 5_MinMax {

    public static void main(String[] args) {
        int[] numbers = {3, 8, 2, 7, 2, 10, 7, 4, 8, 8};

        // מציאת המינימום והמקסימום
        int min = numbers[0];
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // הדפסת המספר המינימלי והמספר המקסימלי
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

        // חיפוש מספר הופעות של מספר המקסימלי
        int maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                maxCount++;
            }
        }

        // הדפסת מספר הופעות של מספר המקסימלי
        System.out.println("Occurrences of maximum number: " + maxCount);

        // חיפוש המציינים של תאי המערך השווים למספר המקסימלי
        System.out.print("Indices of elements equal to maximum number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
