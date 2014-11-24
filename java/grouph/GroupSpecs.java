/**
 * 
 */
package grouph;
import java.util.ArrayList;

/**
 * This class will hold the main parameters that the initiator will enter to determine important 
 * factors for placing members into groups
 * @author stb
 *
 */
public class GroupSpecs 
{
	//Sets size of the groups
	int size;
	//List of students that the initiator wishes to match or keep apart
	ArrayList<Student> forceMatch, forceApart;
	//The course id
	String CRN;
	//List of courses marks will be needed from
	ArrayList<Course> reqCourses;
	
	//Blank Constructor
	public GroupSpecs()
	{
		forceMatch = new ArrayList<Student>(0);
		forceApart = new ArrayList<Student>(0);
	}
	
	/*
	 * Sets the max size of the groups
	 * @param size The max size
	 */
	void setSize(int size)
	{
		this.size=size;
	}
	
	/*
	 * Gets the max size of a group
	 * @return Max Group size
	 */
	int getSize()
	{
		return size;
	}
	
	/*
	 * Set the value of the course he is looking to make groups for
	 * @param CRN The id of the course
	 */
	void setCRN(String CRN)
	{
		this.CRN=CRN;
	}
	
	/*
	 * Get the ID of the course 
	 * @return The course id
	 */
	String getCourseID()
	{
		return CRN;
	}
	
	/*
	 * Sets the list of courses the initiator decides are important to have
	 * @param reqCourses The required courses
	 */
	void setRequiredCourses()
}
