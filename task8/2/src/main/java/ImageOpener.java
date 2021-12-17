import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class ImageOpener extends JFrame {
    JLabel imgLabel = new JLabel();
    public ImageOpener(String path) {
        super(path);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(imgLabel);
        imgLabel.setIcon(new ImageIcon(path));
        setSize(getPreferredSize());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        new ImageOpener(input.nextLine());
    }
}