//A class to simulate how we will match students to a group



public class Match 

{

	//How a student fits into a group

	double compatable;

	Group group;

	Student student;

	public Match(Student s,Group g)

	{

		//Checks compatibility using a single rule an keeps the location of the match

		compatable=Math.abs(((s.getParam()+g.getParam())/2.0)-((double)g.getParam()));

		student=s;

		group=g;

	}

	

	double getCompatability()

	{

		return compatable;

	}

	

	Student getStudent()

	{

		return student;

	}

	

	Group getGroup()

	{

		return group;

	}

}

