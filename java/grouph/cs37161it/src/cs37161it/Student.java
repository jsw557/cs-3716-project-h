/**
 * 
 */
package cs37161it;

/**
 * @author stb
 *
 */
public class Student 
{
	String fName,lName,ID;
	
	public Student()
	{
		
	}
	
	public Student(String fName, String lName, String ID)
	{
		this.fName =fName;
		this.lName = lName;
		this.ID =ID;
	}
	
	void setFirstName(String fName)
	{
		this.fName=fName;
	}

	void setLastName(String lName)
	{
		this.lName = lName;
	}
	
	void setName(String fName,String lName)
	{
		this.fName = fName;
		this.lName= lName;
	}
	
	void setID(String ID)
	{
		this.ID=ID;
	}
	
	String get
}
