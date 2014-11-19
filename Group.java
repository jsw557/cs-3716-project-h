//A Class to simulate the groups



import java.util.*;

public class Group 

{

	//List of students that are members

	protected ArrayList<Student> group;

	int size;

	//Number to simulate parameter matches

	int param;

	

	public Group(int size,int param)

	{

		this.param = param;

		group= new ArrayList<Student>(1);

		this.size=size;

	}

	

	void add(Student stu)

	{

		group.add(stu);

	}

	

	void remove(Student stu)

	{

		group.remove(stu);

		

	}

	

	boolean isInGroup(Student stu)

	{

		return group.contains(stu);

	}

	

	boolean isFull()

	{

		return this.size == group.size(); 

	}

	

	int getParam()

	{

		return param;

	}

	

	String getMembers()

	{

		String out="";

		for(Student s:group)

		{

			out=out+","+s.getName();

		}

		if(out.equals(""))

		{

			out= "No Members";

		}

		return  out;

	}

}

