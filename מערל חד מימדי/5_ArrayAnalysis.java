/*
 הדפסת המספר המינימלי והמקסימלי במערך.
הדפסת מספר ההופעות של המספר המקסימלי במערך.
הדפסת המציינים של תאי המערך השווים למספר המקסימלי במערך.

 */

public class 5_ArrayAnalysis {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 5, 2, 8, 8, 1, 8}; // דוגמא למערך של מספרים

        // יצירת משתנים למציאת המקסימום והמינימום
        int min = numbers[0];
        int max = numbers[0];
        int maxCount = 0;

        // לולאה לסריקת המערך וחיפוש המקסימום והמינימום
        for (int number : numbers) {
            if (number > max) {
                max = number;
                maxCount = 1; // אפס את הספירה ותתחיל מחדש
            } else if (number == max) {
                maxCount++; // עדכון ספירת המקסימום
            }

            if (number < min) {
                min = number;
            }
        }

        // הדפסת המספר המקסימלי והמינימלי
        System.out.println("Minimum number in the array: " + min);
        System.out.println("Maximum number in the array: " + max);

        // הדפסת מספר ההופעות של המספר המקסימלי
        System.out.println("Occurrences of the maximum number: " + maxCount);

        // הדפסת המציינים של תאי המערך ששווים למספר המקסימלי
        System.out.print("Indexes of the array elements that are equal to the maximum number: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // לשורה חדשה בסוף
    }
}


/*
 * מציאת המקסימום והמינימום: הלולאה עוברת על כל האיברים במערך, משווה כל איבר למשתנים max וmin ומעדכנת אותם בהתאם.
ספירת הופעות המקסימום: במהלך הסריקה, אם נמצא איבר שווה למקסימום, המונה maxCount מתעדכן.
 */