package control;

public class Main {

    public static void main (String[]args)
    {
        createGameField();
    }

    private static void createGameField()
    {
        new GameMapController().fillGameArray();
    }

}
