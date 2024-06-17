/**
 
 * נתונה ההגדרה הבאה:
int[] numbers = new int[6];
כתוב תוכנית לכל אחת מהמשימות:
 */


public public class Exercises {

    public static void main(String[] args) {
        // תרגיל 1: איפוס אברי המערך
        int[] numbers = new int[6];
        java.util.Arrays.fill(numbers, 0);

        // תרגיל 2: קליטת נתונים למערך
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // תרגיל 3: הדפסת כל אברי המערך בהתאם לסדר קליטתם
        System.out.println("Elements of the array in input order:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // תרגיל 4: הדפסת כל אברי המערך בסדר הפוך לסדר קליטתם
        System.out.println("Elements of the array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // תרגיל 5: הדפסת כל האיברים הנמצאים במקומות זוגיים
        System.out.println("Elements at even indices:");
        for (int i = 0; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // תרגיל 6: הדפסת כל האיברים הנמצאים במקומות האי-זוגיים
        System.out.println("Elements at odd indices:");
        for (int i = 1; i < numbers.length; i += 2) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // תרגיל 7: הדפסת המספרים שערכם אי זוגי
        System.out.println("Elements with odd values:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
 {
    
}
