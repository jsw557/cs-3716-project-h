package grouph;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class GInterface extends JFrame  {
    
    public Controller controller = new Controller();
    
    public Controller getController()
    {
    	return controller;
    }
    
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
        
        setLayout(new BorderLayout());
        JPanel infoPanel = new JPanel();
        JPanel groupPanel = new JPanel();
        JPanel makePanel = new JPanel();

        final JTextField groupSize = new JTextField();
        groupSize.setPreferredSize(new Dimension(200, 28));  // get size
        final JTextArea classList = new JTextArea();
        classList.setPreferredSize(new Dimension(400, 320));   // select class
       // classList.setEditable(false);
        JScrollPane classScrollPane = new JScrollPane(classList);
        final JTextArea groupList = new JTextArea();
        groupList.setPreferredSize(new Dimension(400, 320));    // make groups
        JScrollPane groupScrollPane = new JScrollPane(groupList);
        groupList.setEditable(false);
            


        JButton ok1 = new JButton("Set Size");
        JButton ok2 = new JButton("Select Class");
        JButton ok3 = new JButton("Make Groups");
	   
        infoPanel.add(groupSize);
        infoPanel.add(ok1);
        groupPanel.add(classList); 
        groupPanel.add(ok2);
        makePanel.add(groupList);
        makePanel.add(ok3);       
        
        add(infoPanel, BorderLayout.NORTH);
        add(groupPanel,BorderLayout.CENTER);
        add(makePanel, BorderLayout.SOUTH);

        

        ok1.addActionListener( new ActionListener () { public void actionPerformed(ActionEvent setGSize) {
                controller.setGroupSize(Integer.parseInt(groupSize.getText()));
           // System.out.println("It worked!"+controller.groupSize);
            }
        });
        ok2.addActionListener( new ActionListener () {public void actionPerformed(ActionEvent getCrse) {
                controller.parseFile();
                classList.setText(controller.str);
            }
        });
        ok3.addActionListener( new ActionListener () {public void actionPerformed(ActionEvent makeGrp) {
        	System.out.println(controller.StuList.get(0).getName()+" "+controller.groupSize);
                controller.makeGroup(controller.StuList,controller.groupSize);
                groupList.setText(controller.gStr);
                }
            
        });
        
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Group Maker");
        setSize(600, 700);         // main frame
        setLocationRelativeTo(null);
        
    }

    
}
