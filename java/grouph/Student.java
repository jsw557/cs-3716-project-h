package grouph;

/**
 * Creates a student that will be added to a group
 * @author stb
 *
 */
public class Student {
	private Controller controller = new Controller();
	private String name;
	private String id;
	private double gpa;

	/*
	 * Makes a student object with a name, an id, and GPA
	 * @param name
	 * @param id The unique id
	 * @param gpa 
	 
	public Student( String name, String id, double gpa ) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	*/
	
	// gets the students name
	public String getName() {
		return name;
	}
	
	// gets the students ID
	public String getId() {
		return id;
	}
	
	// gets the students GPA
	public double getGPA() {
		return gpa;
	}
	
	// sets the students name
	public void setName( String n ) {
		this.name = n;
	}
	
	// sets the students ID
	public void setId( String i ) {
		this.id = i;
	}
	
	// sets the students GPA
	public void setGPA( double g ) {
		this.gpa = g;
	}
}
