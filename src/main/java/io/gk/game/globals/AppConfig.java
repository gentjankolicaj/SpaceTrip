package io.gk.game.globals;

import io.gk.game.general.LanguageType;
import io.gk.game.util.LoggerType;
import io.gk.game.util.StringType;

/**
 * @author gentjan kolicaj
 */
public class AppConfig {

    public static final LoggerType LOGGER_TYPE = LoggerType.CONSOLE_OUT;
    public static final StringType STRING_TYPE = StringType.JSON; //types of string to print
    //Panel sizes
    public static final int WINDOW_WIDTH = 930;
    public static final int WINDOW_HEIGHT = 640;
    public static final int START_PANEL_WIDTH = 640;
    public static final int START_PANEL_HEIGHT = 330;
    public static final int GAME_PANEL_WIDTH = 930;
    public static final int GAME_PANEL_HEIGHT = 540;
    public static final int INFO_PANEL_WIDTH = 930;
    public static final int INFO_PANEL_HEIGHT = 100;
    public static LanguageType AppLanguage = LanguageType.ALBANIAN;

    private AppConfig() {
    }


}
