package Gfx.Asets;
import java .awt. image. BufferedImage;
import java.awt .Graphics;
public class WorldTile {
    public static int defaultWorldTileWidth = 64, defaultWorldTileHeight = 64;

    protected BufferedImage texture;

    protected int id;

    public WorldTile(BufferedImage texture , int id){
        this .tileTexture = texture;
        this. id =  id;
    }
    protected void tick() {
    }

    public void render(Graphics g , int x, int y){
        g.drawImage(tileTexture,x,y,defaultWorldTileWidth,defaultWorldTileHeight,null )
    }
}
