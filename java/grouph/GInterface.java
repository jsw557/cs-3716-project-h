//package grouph;

import java.awt.*;
import javax.swing.*;


public class GInterface extends JFrame{
    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                GInterface window = new GInterface();
                window.setVisible(true);
            }
        });
    }
    public GInterface() {
        initGUI();
    }
    public void initGUI() {
        
        JPanel panel = new JPanel();

        JTextField groupSize = new JTextField();
        JTextField classNum = new JTextField();
        groupSize.setPreferredSize(new Dimension(150, 25));
        classNum.setPreferredSize(new Dimension(150, 25));
        JButton ok1 = new JButton("Set Size");
        JButton ok2 = new JButton("Select Class");
	    
        panel.add(groupSize); panel.add(ok1); 
        panel.add(classNum); panel.add(ok2); 
        
        add(panel);    
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Group Maker");
        setSize(300, 200);
        setLocationRelativeTo(null);
        
    }

    
}
