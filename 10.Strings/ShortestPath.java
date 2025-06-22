// Given a route consisting of a series of directions (N, S, E, W),
// calculate the shortest path to reach the destination.

public class ShortestPath {
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        float shortestPath = calculateShortestPath(route);
        System.out.println("The shortest path to reach the destination is: " + shortestPath);
    }

    public static float calculateShortestPath(String route) {
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    x++;
                    break;
                case 'S':
                    x--;
                    break;
                case 'E':
                    y++;
                    break;
                case 'W':
                    y--;
                    break;
                default:
                    break;
            }
        }

        int xSquare = (int)Math.pow(x, 2);
        int ySquare = (int)Math.pow(y, 2);
        float shortestPath = (float)Math.sqrt(xSquare + ySquare);
        return shortestPath;
    }
}
