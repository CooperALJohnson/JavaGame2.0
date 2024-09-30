/**
 * Class representing the player.
 */
public class Player {

    private int x;
    private int y;
    private final String icon = "P";

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public boolean move(char direction, GameMap gameMap) {
        int newX = x;
        int newY = y;

        switch (direction) {
            case 'w':
                newX -= 1;
                break;
            case 'a':
                newY -= 1;
                break;
            case 's':
                newX += 1;
                break;
            case 'd':
                newY += 1;
                break;
            default:
                return false;
        }

        if (gameMap.isValidPosition(newX, newY)) {
            x = newX;
            y = newY;
            return true;
        } else {
            System.out.println("You can't move there!");
            return false;
        }
    }

    public boolean hasReachedGoal(GameMap gameMap) {
        return gameMap.isGoalPosition(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getIcon() {
        return icon;
    }
}
