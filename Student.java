//A class to simulate the bases of a student



public class Student 

{

	//A number to rep parameters

	//Used to simulate compatabilty

	int param;

	String name;

	public Student(){

	param=0;

	name="";

	}

	

	public Student(int param,String name)

	{

		this.name = name;

		this.param = param;

	}

	

	int getParam()

	{

		return param;

	}

	

	String getName()

	{

		return name;

	}

}



