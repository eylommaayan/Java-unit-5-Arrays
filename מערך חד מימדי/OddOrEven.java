/**כתוב תוכנית שמגדריה מערך של  Int בגודל 5
התוכנית תקלטו מהמשתמש 5 מספרים ותשמור אותם במערך

התוכנית תדפיס כמה מספרים זוגיים יש וכמה אי זוגיים יש במערך
 */

import java.util.Scanner;


public class OddOrEven {
  
    public static void main(String[] args) {
        // יצירת מערך בגודל 5
        int[] numbers = new int[5];
        
        // יצירת אובייקט Scanner לקריאת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);
        
        // קליטת 5 מספרים מהמשתמש ושמירתם במערך
        System.out.println("אנא הכנס 5 מספרים:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        // סגירת הסורק
        scanner.close();
        
        // חישוב והדפסת מספר המספרים הזוגיים והאי זוגיים
        int evenCount = 0;
        int oddCount = 0;
        
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("מספר המספרים הזוגיים הוא: " + evenCount);
        System.out.println("מספר המספרים האי זוגיים הוא: " + oddCount);
    }
}
