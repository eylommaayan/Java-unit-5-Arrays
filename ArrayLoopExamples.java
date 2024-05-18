//דוגמאות ללשימוש במערכים

public class ArrayLoopExamples {

    public static void main(String[] args) {
        // הדפסת הרכיבים של מערך מספרים שלמים באמצעות לולאה עבור
        int[] numbers = {22, 24, 26, 29, 30};

        
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //  הדפסת כל רכיב שני במערך מספרים שלמים
        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for(int i=0; i<grades.length; i+=2){
            System.out.println(grades[i]);
        }

        // הכפלת הרכיבים של מערך מספרים שלמים
        int[] values = {3, 5, 7, 9, 11};
    
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;  // Double the current element
        }


        // שימוש באותיות רישיות ברכיבים של מערך מחרוזות
        String[] colors = {"red", "green", "blue"};
     
for (int i = 0; i < colors.length; i++) {
    colors[i] = colors[i].toUpperCase();  
}


        // איתור האינדקס של ערך ספציפי במערך מספרים שלמים
        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        // TODO: Use a for loop to find the index of targetValue in the data array

        int index = -1; // Initialize index to -1 to indicate that the targetValue is not found

// Using a for loop to find the index of the targetValue in the data array
for (int i = 0; i < data.length; i++) {
    if (data[i] == targetValue) {
        index = i;  // Set index to the current position
        break;      // Exit the loop once the first match is found
    }
}
    }
}
