
import java.util.Arrays;

public class UodetingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresoo","Iced Coffee", "Macchiato"};
        /* בשביל לעדכן מערך */
        menu[2]= "Latte";
        System.out.println(Arrays.toString(menu)); 

/* אי אפשר לשנות את רוגדל המערך
 * לכן אנחנו יוצרים מערך חדש
 * בלולאה למטה נעתיק את המערך הקודם לחדש
 */
        String[] newMenu = new String[5];
        for (int i = 0; i < menu.length; i++){
            newMenu[i] = menu[i];
        }
        System.out.println(Arrays.toString(newMenu));
    }
}
