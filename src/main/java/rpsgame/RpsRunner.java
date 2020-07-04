package rpsgame;

public class RpsRunner {
    public static void main(String[] args) {
        while (true) {
            Game game = new Game();
            game.run();
            if (!UserDialogs.getContinue())
                return;
        }
    }
}
