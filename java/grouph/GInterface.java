package grouph;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class GInterface extends JFrame  {
	private JScrollPane scrollPane;
    
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
        
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(3,3));
        JPanel infoPanel = new JPanel();
        JPanel gSize = new JPanel();
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
	   
        //infoPanel.add(groupSize);      
        infoPanel.add(ok1);
        gSize.add(groupSize);
        //groupPanel.add(classList); 
        groupPanel.add(ok2);
        //groupPanel.add(classScrollPane);
        //makePanel.add(groupList);
        makePanel.add(ok3);       
        //makePanel.add(groupScrollPane);
       // add(infoPanel, BorderLayout.NORTH);
        //add(groupPanel,BorderLayout.CENTER);
        //add(classScrollPane,BorderLayout.NORTH);
       // add(makePanel, BorderLayout.SOUTH);
        
        
        add(gSize);
        add(infoPanel);
        add(classScrollPane);
        add(groupPanel);
        
        add(groupScrollPane);
        add(makePanel);

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
