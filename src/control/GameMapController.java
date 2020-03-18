package control;

import resources.constants.InputConstant;
import resources.strings.GameConstant;
import utility.Logger;

public class GameMapController {

    public void fillGameArray ()
    {
        for (int count = 0; count < 10; count++)
        {
            Logger.view(GameConstant.UPPER_LOWER_BORDER);
        }
    }
}
