package control;

public class Main {
    int i = 1;
    int x = 1;

    public static void main (String[]args)
    {
        createGameField();
    }

    private static void createGameField()
    {
        new GameMapController().fillGameArray();
    }

}
