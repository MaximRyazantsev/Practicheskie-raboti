import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Football extends JFrame {
    private int scoreACM = 0, scoreRM = 0;
    JButton ACMilan = new JButton("AC Millan");
    JButton RealMadrid = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result: " + scoreACM + " X " + scoreRM);
    JLabel LastScorer = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: DRAW" );
    public Football () {
        super("AC Millan X Real Madrid");
        setSize(250, 120);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(ACMilan);
        add(RealMadrid);
        add(Result);
        add(LastScorer);
        add(Winner);
        ACMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                scoreACM++;
                Result.setText("Result: " + scoreACM + " X " + scoreRM);
                LastScorer.setText("Last Scorer: AC Milan");
                if (scoreACM > scoreRM) {
                    Winner.setText("Winner: AC Milan");
                } else {
                    if (scoreACM < scoreRM) {
                        Winner.setText("Winner: Real Madrid");
                    } else {
                        Winner.setText("Winner: DRAW");
                    }
                }
            }
        });
        RealMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreRM++;
                Result.setText("Result: " + scoreACM + " X " + scoreRM);
                LastScorer.setText("Last Scorer: Real Madrid");
                if (scoreACM > scoreRM) {
                    Winner.setText("Winner: AC Milan");
                } else {
                    if (scoreACM < scoreRM) {
                        Winner.setText("Winner: Real Madrid");
                    } else {
                        Winner.setText("Winner: DRAW");
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        new Football();
    }
}