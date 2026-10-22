import java.util.*;

class SnakeGame {
    int width, height;
    int[][] food;
    int foodIndex;
    Deque<Integer> snake;
    HashSet<Integer> set;
    boolean gameOver;

    public SnakeGame(int width, int height, int[][] food) {
        this.width = width;
        this.height = height;
        this.food = food;
        foodIndex = 0;
        gameOver = false;

        snake = new LinkedList<>();
        set = new HashSet<>();

        snake.addFirst(0);
        set.add(0);
    }

    public int move(String direction) {
        if (gameOver) return -1;

        int head = snake.peekFirst();
        int row = head / width;
        int col = head % width;

        if (direction.equals("U")) row--;
        else if (direction.equals("D")) row++;
        else if (direction.equals("L")) col--;
        else if (direction.equals("R")) col++;

        if (row < 0 || row >= height ||
            col < 0 || col >= width) {
            gameOver = true;
            return -1;
        }

        int newHead = row * width + col;

        boolean eating = foodIndex < food.length &&
                food[foodIndex][0] == row &&
                food[foodIndex][1] == col;

        int tail = snake.peekLast();

        if (!eating || newHead == tail) {
            snake.removeLast();
            set.remove(tail);
        }

        if (set.contains(newHead)) {
            gameOver = true;
            return -1;
        }

        snake.addFirst(newHead);
        set.add(newHead);

        if (eating) foodIndex++;

        return foodIndex;
    }
}