import javax.swing.*;
import java.awt.*;

public class Shapes extends JFrame {
    public Shapes() throws HeadlessException {
        setSize(1000, 900);
        setVisible(true);
        add(new ShapeConfig());
    }

    public static void main(String[] args) {
        new Shapes();
    }
}
