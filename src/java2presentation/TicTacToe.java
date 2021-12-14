package java2presentation;


public class TicTacToe {
    public static void main(String[] args) {
        int[][] moves = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2}};
        boolean gameWinLoseStatus = false;
        boolean gamePending = false;
        char[][] gameState = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}};

        for (int i=0; i<moves.length; i+=2) {
            gameState[moves[i][0]][moves[i][1]] = 'x';
        }
        for (int i=1; i<moves.length; i+=2) {
            gameState[moves[i][0]][moves[i][1]] = 'o';
        }

        if ((gameState[0][0] == 'x' && gameState[0][1] == 'x' && gameState[0][2] == 'x') ||
                (gameState[1][0] == 'x' && gameState[1][1] == 'x' && gameState[1][2] == 'x') ||
                (gameState[2][0] == 'x' && gameState[2][1] == 'x' && gameState[2][2] == 'x') ||
                (gameState[0][0] == 'x' && gameState[1][0] == 'x' && gameState[2][0] == 'x') ||
                (gameState[0][1] == 'x' && gameState[1][1] == 'x' && gameState[2][1] == 'x') ||
                (gameState[0][2] == 'x' && gameState[1][2] == 'x' && gameState[2][2] == 'x') ||
                (gameState[0][0] == 'x' && gameState[1][1] == 'x' && gameState[2][2] == 'x') ||
                (gameState[0][2] == 'x' && gameState[1][1] == 'x' && gameState[2][0] == 'x')) {
            gameWinLoseStatus = true;
            System.out.println("A Won");
        } else if ((gameState[0][0] == 'o' && gameState[0][1] == 'o' && gameState[0][2] == 'o') ||
                (gameState[1][0] == 'o' && gameState[1][1] == 'o' && gameState[1][2] == 'o') ||
                (gameState[2][0] == 'o' && gameState[2][1] == 'o' && gameState[2][2] == 'o') ||
                (gameState[0][0] == 'o' && gameState[1][0] == 'o' && gameState[2][0] == 'o') ||
                (gameState[0][1] == 'o' && gameState[1][1] == 'o' && gameState[2][1] == 'o') ||
                (gameState[0][2] == 'o' && gameState[1][2] == 'o' && gameState[2][2] == 'o') ||
                (gameState[0][0] == 'o' && gameState[1][1] == 'o' && gameState[2][2] == 'o') ||
                (gameState[0][2] == 'o' && gameState[1][1] == 'o' && gameState[2][0] == 'o')) {
            gameWinLoseStatus = true;
            System.out.println("B Won");
        }

        for (int i =0; i<gameState.length; i++) {
            for (int j =0; j<gameState[i].length; j++) {
                if (gameState[i][j] == ' ') {
                    gamePending = true;
                }
            }
        }

        if (gamePending && !gameWinLoseStatus) {
            System.out.println("Game Pending");
        } else if (!gamePending && !gameWinLoseStatus) {
            System.out.println("The game is a Draw");
        }

        for (int i =0; i<gameState.length; i++) {
            for (int j =0; j<gameState[i].length; j++) {
                System.out.print("| "+ gameState[i][j] + " ");
            }
            System.out.println();
        }
    }
}
