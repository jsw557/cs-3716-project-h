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
	String firstName,lastName,id;
	/*
	 * Empty Constructor
	 */
	public Student()
	{}
	
	/*
	 * Makes a student object with a first name , last name and an id
	 * @param firstName The first name
	 * @param lastName The Last Name
	 * @param id The unique id
	 */
	public Student(String firstName,String lastName,String id)
	{
		this.firstName = firstName;
		this.lastName=lastName;
		this.id=id;
	}
	
	/*
	 * Gets the students first name
	 * @return The given name
	 */
	String getFirstName()
	{
		return firstName;
	}
	
	/*
	 * Gets the students last name
	 * @return The family name
	 */
	String getLastName()
	{
		return lastName;
	}
	
	/*
	 * Gets the students id
	 * @return The id of the student
	 */
	String getID()
	{
		return id;
	}
	
	/*
	 * Changes the students first name
	 * @paran name The Students given name
	 */
	void setFirstName(String name)
	{
		firstName =name;
	}
	
	/*
	 * Changes the students Last name
	 * @param name The students given name
	 */
	void setLastName(String name)
	{
		lastName =name;
	}
	
	/*
	 * Changes the students full name
	 * @param firstName The given name
	 * @param lastName The family name
	 */
	void setName(String firstName,String lastName)
	{
		this.firstName= firstName;
		this.lastName=lastName;
	}
	
	/*
	 * Changes a studnets ID
	 * @param id The studnets ID
	 */
	void setID(String id)
	{
		this.id=id;
	}
}
