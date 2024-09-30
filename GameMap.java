/**
 * Class representing the game map.
 */
public class GameMap {

    private String[][] map;
    private final int startX = 0;
    private final int startY = 0;
    private final int goalX = 0;
    private final int goalY = 5;

    public GameMap() {
        initializeMap();
    }

    private void initializeMap() {
        map = new String[][]{
                {"S", ".", "O", ".", "O", "G"},
                {".", ".", ".", ".", ".", "."},
                {".", ".", ".", "O", ".", "."},
                {".", "O", ".", ".", ".", "."},
                {".", ".", ".", ".", ".", "."},
        };
    }

    public void printMap(Player player) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == player.getX() && j == player.getY()) {
                    System.out.print(player.getIcon() + " ");
                } else {
                    System.out.print(map[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isValidPosition(int x, int y) {
        return x >= 0 && x < map.length &&
               y >= 0 && y < map[0].length &&
               !map[x][y].equals("O");
    }

    public boolean isGoalPosition(int x, int y) {
        return x == goalX && y == goalY;
    }

    public int getStartX() {
        return startX;
    }

    public int getStartY() {
        return startY;
    }
}
