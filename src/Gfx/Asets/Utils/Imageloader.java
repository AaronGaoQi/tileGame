package Gfx.Utils;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
public class Imageloader {

    public static  BufferedImage LoadImage(String path){
        try{
            return ImageIO.read(imageLoader.class.getResource(path));
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
