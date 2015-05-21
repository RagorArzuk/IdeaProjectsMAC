package GUI;

import java.awt.*;
import javax.swing.*;

public class FrameSwing extends JFrame {
    
    public FrameSwing() {}

//  Konstruktor mit LayoutManager:
    public static FrameSwing erzeugeFrameSwing(String title, int width, int height, LayoutManager lm) {
        FrameSwing frame = new FrameSwing();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(lm);
        
        return frame;
    }
    
//    Konstruktor ohne LayoutManager:
    public static FrameSwing erzeugeFrameSwing(String title, int width, int height) {
        FrameSwing frame = new FrameSwing();
        frame.setTitle(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        return frame;
    }
    
//    leerer Konstruktor:
    public static FrameSwing erzeugeFrameSwing() {
        FrameSwing frame = new FrameSwing();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        return frame;
    }

    public static void main(String[] args) {

        FrameSwing frame = FrameSwing.erzeugeFrameSwing("Hello, World!", 300, 300, new FlowLayout());
        JButton b1= new JButton("Quit");
        JLabel label = new JLabel("ich bin ein Label!");
        label.setToolTipText("Des isch nur en Teschd!");


        frame.add(b1);
        frame.add(label);

        frame.setVisible(true);
        

    }
}
