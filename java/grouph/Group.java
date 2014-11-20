/**
 * 
 */
package grouph;

import java.util.ArrayList;

/**
 * The groups that members will be added to
 * @author stb
 *
 */
public class Group 
{
	//Max size of a group
	int size;
	//The group that will hold students
	ArrayList<Student> group;
	//The id for the group
	String id;
	
	public Group()
	{}
	
	/*
	 * Makes a group that cannot exceed a certain size
	 * @param size the max size of a group
	 * @param id The id to describe this group
	 */
	public Group(int size,String id)
	{
		this.size=size;
		this.id=id;
		group = new ArrayList<Student>(1);
	}
	
	/*
	 * Returns if a group is at max capacity or not
	 * @return is the group is full
	 */
	boolean isFull()
	{
		return (this.size==group.size());
	}
	
	/* 
	 * Returns the number of members in a group
	 * @return The number of members in the group
	 */
	int numOfStudents()
	{
		return group.size();
	}
	
	/*
	 * Finds if a student is in a group
	 * @return Is student in group
	 */
	boolean isInGroup(Student stu)
	{
		return group.contains(stu);
	}
	
	/*
	 * Adds a student to a group if there is room
	 * @param stu The student we attempt to add to add to a group
	 */
	void add(Student stu)
	{
		if(!this.isFull())
		{
			group.add(stu);
		}
	}
	
	/*
	 * Removes a student from a group if they are in it
	 * @param The student to be removed
	 */
	void remove(Student stu)
	{
		if(this.isInGroup(stu))
		{
			group.remove(stu);
		}
	}
	
	/*
	 * This Will return an arraylist of the members in a group
	 * @return The group
	 */
	ArrayList<Student> getGroup()
	{
		return group;
	}
	/*
	 * Sets the id of a group
	 * @param id The new id for the group
	 */
	void setID(String id)
	{
		this.id = id;
	}
	
	/*
	 * Gets the id of a group
	 * @return The group id
	 */
	String getID()
	{
		return this.id;
	}
	
	/*
	 * Returns a string implementation of the members in a group
	 * @return List of members in a group
	 */
	String groupToString()
	{
		String out="";
		for(Student stu:this.group)
		{
			out= out+ stu.getFirstName()+ " "+stu.getLastName()+", ";
		}
		return out;
	}
}
