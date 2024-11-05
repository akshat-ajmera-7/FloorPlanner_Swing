import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,700);
        this.setLayout(new FlowLayout());
        new MyFrameTop();
    }
}
