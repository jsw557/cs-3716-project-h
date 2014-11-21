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
	private int size;
	//The group that will hold students
	private ArrayList<Student> group;
	//The id for the group
	private String id;
	
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
	public boolean isFull()
	{
		return (this.size==group.size());
	}
	
	/* 
	 * Returns the number of members in a group
	 * @return The number of members in the group
	 */
	public int numOfStudents()
	{
		return group.size();
	}
	
	/*
	 * Finds if a student is in a group
	 * @return Is student in group
	 */
	public boolean isInGroup(Student stu)
	{
		return group.contains(stu);
	}
	
	/*
	 * Adds a student to a group if there is room
	 * @param stu The student we attempt to add to add to a group
	 */
	public void add(Student stu)
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
	public void remove(Student stu)
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
	public void setId (String id) {
		this.id = id;
	}
	
	/*
	 * Gets the id of a group
	 * @return The group id
	 */
	public String getId () {
		return this.id;
	}
	
	/*
	 * Returns a string implementation of the members in a group
	 * @return List of members in a group
	 */
	public String groupToString() {
		String out="";
		
		for(Student stu: this.group) {
			out = out + stu.getFirstName() + " " + stu.getLastName() + ", ";
		}
		return out;
	}
}
