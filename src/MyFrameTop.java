import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrameTop extends JFrame implements ActionListener {
    JPanel control;
    JPanel canvas;
    JMenuItem Load;
    JMenuItem New;
    JMenuItem Exit;
    MyFrameTop(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1300,700);
        this.setLayout(new FlowLayout());
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu save = new JMenu("Save ");
        JMenu help = new JMenu("Help");
        menuBar.add(file);
        menuBar.add(save);
        menuBar.add(help);
        canvas = new JPanel();
        control = new JPanel();
        control.setBounds(0,0,300,700);
        canvas.setBounds(300,0,1000,700);
        canvas.setForeground(Color.BLACK);
        canvas.setBackground(Color.BLUE);


        Load = new JMenuItem("Load");
        New = new JMenuItem("New");
        Exit = new JMenuItem("Exit");
        Load.addActionListener(this);
        New.addActionListener(this);
        Exit.addActionListener(this);
        file.add(Load);
        file.add(New);
        file.add(Exit);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
        this.add(canvas);
        this.add(control);
        file.setMnemonic(KeyEvent.VK_F);
        save.setMnemonic(KeyEvent.VK_S);
        help.setMnemonic(KeyEvent.VK_H);
        Load.setMnemonic(KeyEvent.VK_L);
        Exit.setMnemonic(KeyEvent.VK_E);
        New.setMnemonic(KeyEvent.VK_N);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Load){
           JFileChooser fileChooser = new JFileChooser();
           fileChooser.showOpenDialog(null);
        } else if (e.getSource()==New) {
            System.out.println("New");
        } else if (e.getSource() == Exit) {
            System.exit(0);
        }
    }
}
