import javax.swing.*;
import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;

public class ShapeConfig extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        graphics.setStroke(new BasicStroke(5));
        for (int i = 0; i < 10; i++) {
            printRectangle(graphics,getRandomPosition(),getRandomPosition(),getRandomSize(),getRandomSize());
            printCircle(graphics,getRandomPosition(),getRandomPosition(),getRandomSize(),getRandomSize());
        }
    }
    private Color getRandomColor(){
        int red = (int) (Math.random()*256);
        int green = (int) (Math.random()*256);
        int blue = (int) (Math.random()*256);
        return new Color(red,green,blue);
    }
    public void printRectangle(Graphics2D graphics,int x,int y,int w,int h){
        Shape rectangle = new Rectangle2D.Double(x,y,w,h);
        graphics.setColor(getRandomColor());
        graphics.fill(rectangle);
    }
    public void printCircle(Graphics2D graphics,int x,int y,int w,int h){
        Shape ellipse = new Ellipse2D.Double(x,y,w,h);
        graphics.setColor(getRandomColor());
        graphics.fill(ellipse);
    }
    private int getRandomPosition(){
        return (int) (Math.random()*600);
    }
    private int getRandomSize(){
        return (int) (Math.random()*100)+50;
    }
}