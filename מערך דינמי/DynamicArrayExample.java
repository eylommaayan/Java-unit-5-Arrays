import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        ArrayList<Integer> dynamicArray = new ArrayList<>(); // יצירת מערך דינמי

        // הוספת פריטים למערך
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);

        // הדפסת כל האיברים במערך
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + dynamicArray.get(i));
        }

        // הסרת פריט מהמערך
        dynamicArray.remove(2); // הסרת האיבר באינדקס 2

        // הדפסת כל האיברים במערך לאחר ההסרה
        System.out.println("After removal:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + dynamicArray.get(i));
        }
    }
}
