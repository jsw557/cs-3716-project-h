import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
// import javax.swing.JFileChooser;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Controller receives information in terms of Groups,
 * Students, Grades, Schedules and creates groups.
 * 
 */

public class Controller {
    
	private GInterface gInterface;
	private ArrayList<Group> groupList;	// The list that holds groups
	private Group group;
	private Student student;
	private Project project;
	private ArrayList<Student> StuList;	= new ArrayList<Student>// The list that holds students
	private int groupSize;
	private String selectedFile;
	
	private JFileChooser chooser = new JFileChooser();

	
	// parse string from csv file
	public void parseFile ( ) {
		StuList = new ArrayList<Student>;
		String line = "";
		final String DELIMITER = ",";
		
		try {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
            		"txt", "cvs");
            chooser.setFileFilter(filter);
            
            int returnVal = chooser.showOpenDialog(parent);
            
            if(returnVal == JFileChooser.APPROVE_OPTION) {
            	System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
            }
            
            selectedFile = chooser.getSelectedFile();
			
	        BufferedReader reader = new BufferedReader(
	        		new FileReader(selectedFile));
	        
	        while ((line = br.readLine()) != null) {
	        	
		        // use comma as separator
	        	student = new Student;
	        	student.name = line.split(DELIMITER);
	        	student.id = line.split(DELIMITER);
	        	student.gpa = line.split(DELIMITER);
	        	
	        	StuList.add(student);
	        }
		}
	  	catch (FileNotFoundException ex) {
	        JOptionPane.showMessageDialog(frame,
	        		ex.getMessage(),
	        	    JOptionPane.ERROR_MESSAGE);
	    }
	 }
	
	// receives the size of group 
	public void setGroupSize ( int size ) {
		groupSize = size;
	}
	
	// receives the Student list and make a group
	public void makeGroup ( ArrayList<Student> StuList ) {
		group = new Group;
		
		for ( int i = 0; i < groupSize; i++) {
			
		}
		
		makeGroupList(group);
	}
	
	public void makeGroupList ( Group group ) {
		groupList = new ArrayList<Group>;
		groupList.add(group);
	}
	
	/**
	public void load( String file ) {
		try {
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
            		"JPG & GIF Images", "jpg", "gif");
            chooser.setFileFilter(filter);
            
            int returnVal = chooser.showOpenDialog(parent);
            
            if(returnVal == JFileChooser.APPROVE_OPTION) {
            	System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());
            }
       	}
       	catch( Exception ex ) {
       		JOptionPane.showMessageDialog(null, ex.getMessage());
        }
	}

	public void save( String file ) {
		try {
            File fpw = new File( file );
            PrintWriter pw = new PrintWriter(fpw);
            pw.write( editArea.getText() );
            pw.close();
        }
        catch( Exception ex ) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
	}
	
	public Controller(){
		super();
	}
	
	**/


}

