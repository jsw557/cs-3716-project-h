/**
 * 
 */
package grouph;

/**
 * Creates a student that will be added to a group
 * @author stb
 *
 */
public class Student
{
	private Controller controller = new Controller();
	String name;
	String id;
	double gpa;
	/*
	 * Empty Constructor
	 */
	public Student()
	{}
	
	/*
	 * Makes a student object with a name and an id
	 * @param name
	 * @param id The unique id
	 */
	public Student(String name,String id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	/*
	 * Gets the students name
	 * @return The given name
	 */
	String getName()
	{
		return name;
	}
	
	/*
	 * Gets the students id
	 * @return The id of the student
	 */
	String getId()
	{
		return id;
	}
}
