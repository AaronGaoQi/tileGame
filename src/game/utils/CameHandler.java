package game.utils;
import Gfx.Asets.Display;
import gfx.assets.Display;

import java.awt.*;
import java. awt. image. BufferStrategy;

public class CameHandler {
private BufferStrategy bufferStrategy;
private Graphics g;

private Display diaplay;

public static final int SCREEN_WIDTH = 1200;
public static final int SCREEN_HEIGHT = 800;

private final String GAME_TITLE = "NAME";

public static void main(String[] args){
    GameHandler game = new GameHandler();
    game.init();

}

private void init{
    display = new Display(GAME_TITLE,SCREEN_HEIGHT,SCREEN_WIDTH);
    run();
    }
    private void tick(){
    }
}

