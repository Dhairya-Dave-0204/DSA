public class InterfaceImplementation {
    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Queen can move any number of squares in any direction.");
    }
}