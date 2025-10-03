import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.*;

public class Calculator {
int boardWidth = 360;
int boardHeight = 540;

//Create the Main Frame
JFrame frame = new JFrame("Calculator ");

//create a Jlabel
JLabel displayLabel = new JLabel();
JPanel displayPanel = new JPanel();



//Custom color like Iphone Calculator
Color customLightGray= new Color(212,212,210);
Color customDarkGray= new Color(80,80,80);
Color customBlack = new Color(28,28,28);
Color customOrange = new Color(255,149,0);


//constructor to build the Interface
Calculator (){
    frame.setVisible(true);
    frame.setSize(boardWidth,boardHeight);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    //Customize our display label 
    displayLabel.setBackground(customBlack);
    displayLabel.setForeground(Color.white);
    displayLabel.setFont(new Font("Arial",Font.PLAIN,80));
    displayLabel.setHorizontalAlignment(JLabel.RIGHT);
    displayLabel.setText("0");
    displayLabel.setOpaque(true);

    //add component to each other
    displayPanel.setLayout(new BorderLayout());
    displayPanel.add(displayLabel);
    frame.add(displayLabel);
}

}
