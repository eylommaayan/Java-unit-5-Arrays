

/**
 * במערל דו מימדי אנחנו יוצרים מערך עם שני סוגריים מרובעים
 * ובראשון זה מספר שורות
 * בשני מספר  האלמנטים בכל שורה
 * @author user
 */

 public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = {
            {72, 74, 76, 78},
            {81, 80, 84, 82},
            {90, 89, 99, 88}
        };

        for (int j = 0; j < grades[0].length; j++) {
            System.err.print(grades[0][j] + " "); // [0][0]  [0][1]  [0][2] [0][3]
        }
        System.err.print("\n");

        for (int j = 0; j < grades[1].length; j++) {
            System.err.print(grades[1][j] + " "); // [1][0]  [1][1]  [1][2] [1][3]
        }
        System.err.print("\n");

        for (int j = 0; j < grades[2].length; j++) {
            System.err.print(grades[2][j] + " "); // [2][0]  [2][1]  [2][2] [2][3]
        }
        System.err.print("\n");
    }
}

    //    int[][] grades = new int[3][4];
    //    grades[0][0]=85;
    //    grades[0][2]= 80;
    //    grades[0][3]=90;
    //    grades[1][0]=87;
    //    grades[1][1]= 71;
    //    grades[1][2]=70;
    //    grades[2][0]=97;
    //    grades[2][1]= 82;
    //    grades[2][2]=80;
    //    System.out.println("" + grades[0][0] + "" + grades[0][1] +""+  grades[0][2] );
    
//    } 
// }
