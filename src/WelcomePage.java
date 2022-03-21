import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomlabel = new JLabel("welcom");

    WelcomePage(){

        welcomlabel.setBounds(0,0,200,35);
        welcomlabel.setFont(new Font(null,Font.ITALIC,25));



        frame.add(welcomlabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }


}
