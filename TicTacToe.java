import java.util.Scanner;

public class TicTacToe {
    // הגדרת לוח המשחק כמערך דו-ממדי בגודל 3x3
    private static char[][] board = new char[3][3];
    // הגדרת השחקן הנוכחי שמתחיל ב-'X'
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        // אתחול הלוח עם סימני ריק
        initializeBoard();
        // הדפסת הלוח ההתחלתי
        printBoard();
        // לולאה שממשיכה עד שמישהו מנצח או יש תיקו
        while (true) {
            // השחקן הנוכחי מבצע מהלך
            playerMove();
            // הדפסת הלוח לאחר המהלך
            printBoard();
            // בדיקה אם השחקן הנוכחי ניצח
            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            // בדיקה אם הלוח מלא ואין מנצח (תיקו)
            if (isBoardFull()) {
                System.out.println("The game is a draw!");
                break;
            }
            // החלפת השחקן הנוכחי לשחקן הבא
            switchPlayer();
        }
    }

    // פונקציה לאתחול הלוח עם סימני ריק ('-')
    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // פונקציה להדפסת הלוח
    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // פונקציה לביצוע מהלך של השחקן הנוכחי
    private static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        // לולאה שממשיכה עד שהשחקן מבצע מהלך חוקי
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row [1-3] and column [1-3]): ");
            // קריאת המיקום (שורה ועמודה) מהשחקן
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            // בדיקה אם המיקום חוקי ואם התא פנוי
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                // עדכון הלוח עם המהלך של השחקן
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid");
            }
        }
    }

    // פונקציה להחלפת השחקן הנוכחי
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // פונקציה לבדיקה אם השחקן הנוכחי ניצח
    private static boolean checkWin() {
        // בדיקת שורות ועמודות
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // בדיקת אלכסונים
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // פונקציה לבדיקה אם הלוח מלא ואין מהלכים פנויים
    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}
