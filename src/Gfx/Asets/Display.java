package Gfx.Asets;
import java.awt.Canvas;
import java.awt. ;
import javax.swing.JFrame;
public class Display {
    private JFrame frame;
    private Canvas Canvas;
    private final String title;

    public Display(String title, int height, int width ){
        this.title = title;
        this.height = height;
        this.width = width;
        createDisplay();
    }

private void creatDisplay(){
        frame = new JFrame(title);
        frame.setSize(width , height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        canvas = new Canvas();
        canvas.setPerferredSize(new Dimension(width,height));
        canvas.setMaximumSize(new Dimension(width,height));
        canvas.setMinimumSize(new Dimension(width,height));
        canvas.setFocusable(false);

        frame. add(canvas);
        frame.pack();

}

    public Canvas getCanvas() {
        return Canvas;
    }
    public JFrame getFrame(){
        return frame;
    }

}
