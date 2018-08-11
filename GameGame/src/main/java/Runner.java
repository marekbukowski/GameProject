import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {


    static char board[][] = null;
    static ArrayList<Point> path = new ArrayList<>();
    public static boolean flag = false;

    public static void main(String[] args) {

        File file = new File("Frame.txt");
        try {
            Scanner in = new Scanner(file);

            int col = in.nextInt();
            int row = in.nextInt();
            board = new char[row][col];
            in.nextLine();
            System.out.println(col);
            System.out.println(row);
            int y = 0;
            while (in.hasNext()) {
                String Line = in.nextLine();
                for (int i = 0; i < Line.length(); i++) {
                    board[y][i] = Line.charAt(i);
                }
                y++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        do {
            DisplayBoard();
            MoveR();
        }
        while (true);
    }

    public static void DisplayBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static void moveRandom(int x, int y) {
        if (board[x][y] == 'P') {

            board[x][y + 1] = 'R';
            if (!(wall(x, y)))
                return;
            board[x][y - 1] = 'R';
            if (!(wall(x, y)))
                return;
            board[x + 1][y] = 'R';
            if (!(wall(x, y)))
                return;
            board[x - 1][y] = 'R';
        }
        return;
    }

    public static boolean wall(int x, int y) {
        return board[x][y] == '#';
    }

    public static void MoveR() {

        Scanner MoveR = new Scanner(System.in);
        System.out.println("Player move: W - up, S - down, D - right, A - left");
        String move = MoveR.nextLine();

        char R;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'R') {
                    if (flag == true) {
                        path.add(new Point(i, j));
                        for (Point p : path) {
                            System.out.println(p);
                        }
                    }
                    if (move.equals("W")) {
                        if (wall(j, i - 1))
                            System.out.println("wall");
                        else {
                            board[i][j] = ' ';
                            board[i - 1][j] = 'R';
                        }
                    } else if (move.equals("S")) {
                        if (wall(j, i + 1))
                            System.out.println("wall");
                        else {
                            board[i][j] = ' ';
                            board[i + 1][j] = 'R';
                        }
                    } else if (move.equals("D")) {
                        if (wall(j + 1, i))
                            System.out.println("wall");
                        else {
                            board[i][j] = ' ';
                            board[i][j + 1] = 'R';
                        }
                    } else if (move.equals("A")) {
                        if (wall(j - 1, i))
                            System.out.println("wall");
                        else {
                            board[i][j] = ' ';
                            board[i][j - 1] = 'R';
                        }
                    }

                    else if (move.equals("P")){
                        board[i][j] = 'P';
                        moveRandom(i,j);
                        flag = true;
                    }
                    else if (move.equals("Z")){
                        for (i = path.size(); i > path.size(); i--){
                            try {
                                Thread.sleep(1000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            System.out.println(path);
                        }
                    }
                    return;
                }
            }

        }

    }
}
