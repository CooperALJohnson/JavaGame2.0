import java.util.*;;

/**
 * Main class to run the game.
 */
public class Game {

    private GameMap gameMap;
    private Player player;
    private Scanner scanner;

    public Game() {
        gameMap = new GameMap();
        player = new Player(gameMap.getStartX(), gameMap.getStartY());
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to the Maze Game!");
        System.out.println("Your goal is to reach the 'G' tile.");
        System.out.println("Use W (up), A (left), S (down), D (right) to move.");
        System.out.println();

        gameMap.printMap(player);

        while (!player.hasReachedGoal(gameMap)) {
            System.out.print("Enter a move (W/A/S/D): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.length() != 1 || !player.move(input.charAt(0), gameMap)) {
                System.out.println("Invalid move, try again!");
            }

            gameMap.printMap(player);
        }

        System.out.println("Congratulations, you have reached the goal!");
        scanner.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
