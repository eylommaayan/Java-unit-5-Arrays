public class Looping2darrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 76, 78},
            {81, 80, 84, 82},
            {90, 89, 99, 88}
        };

        // לולאה לעבור על כל השורות
        for (int i = 0; i < grades.length; i++) {
            // לולאה לעבור על כל העמודות בשורה הנוכחית
            for (int j = 0; j < grades[i].length; j++) {
                // הדפסת הערך הנוכחי
                System.out.println(grades[i][j]);
            }
        }
    }
}
