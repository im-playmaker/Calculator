import javax.swing.JFrame;
import java.awt.*;

public class Calculator {
int boardWidth = 360;
int boardHeight = 540;

JFrame frame = new JFrame("Calculator ");

Calculator (){
    frame.setVisible(true);
    frame.setSize(boardWidth,boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());
}

}
