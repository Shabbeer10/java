import java.util.Scanner;

public class TicTacToe {
    // The game board
    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    // Method to display the board
    public static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("  -----");
        }
    }

    // Method to check if a player has won
    public static boolean checkWin(char player) {
        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true; // Row
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true; // Column
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true; // Diagonal
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true; // Diagonal
        return false;
    }

    // Method to check if the board is full (draw)
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char currentPlayer = 'X'; // X goes first
        boolean gameWon = false;

        // Game loop
        while (true) {
            printBoard();
            System.out.println("Player " + currentPlayer + "'s turn!");

            // Ask for row and column input
            int row, col;
            while (true) {
                System.out.print("Enter row (0, 1, 2): ");
                row = scanner.nextInt();
                System.out.print("Enter column (0, 1, 2): ");
                col = scanner.nextInt();

                // Validate the move
                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    break; // Valid move
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }

            // Place the move on the board
            board[row][col] = currentPlayer;

            // Check for a win
            if (checkWin(currentPlayer)) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameWon = true;
                break;
            }

            // Check for a draw
            if (isDraw()) {
                printBoard();
                System.out.println("The game is a draw!");
                break;
            }

            // Switch players
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
