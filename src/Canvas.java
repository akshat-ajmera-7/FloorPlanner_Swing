import javax.swing.*;
import java.awt.*;

public class Canvas extends JFrame {
    JPanel control;
    JPanel canvas;
    Canvas(){
        canvas = new JPanel();
        control = new JPanel();
        control.setBounds(0,0,300,700);
        canvas.setBounds(300,0,1000,700);
        canvas.setForeground(Color.BLACK);
        canvas.setBackground(Color.BLUE);

}}
