package grouph;

import java.util.ArrayList;
/**
 * @author stb
 *
 */
public class StuProp {
	Schedule schedule;
	ArrayList<String> desiredMatch, desiredApart, forceMatch, forceApart;
	ArrayList<Grade> marks;
	public StuProp()
	{}
	
	//public StuProp(Schedule schedule ,ArrayList<String> forceMatch, ArrayList<String> forceApart, ArrayList<String> desiredMatch, ArrayList)
	
	public void setSchedule( Schedule schedule ) {
		this.schedule = schedule;
	}
}
