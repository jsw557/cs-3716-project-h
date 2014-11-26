

/**
 * A class that will create a 2D array of Boolean values that will determine if students are free 
 * at certain times during the day.Schedule is made of blocks that are divided into days and hours.
 *  If free a block will be true if busy a block will be false.
 * @author stb
 *
 */
public class Schedule {
	private Controller controller = new Controller();
	//The 2D representation of a schedule
	boolean[][] schedule;
	
	/*
	 * Creates a Schedule for 24 hours and 7 days
	 */
	public Schedule() {
		schedule = new boolean[7][24];
		this.initialize();
	}
	
	/*
	 * Creates a schedule with a set number of days and hours
	 * @param days The number of days we are considering for the schedule
	 * @param hours The number of hours a day we consider for the schedule
	 */
	public Schedule( int days, int hours ) {
		schedule = new boolean[days][hours];
		this.initialize();
	}
	
	/*
	 * Initializes the schedule to all busy time
	 */
	public void initialize() {
		for( int i = 0; i < this.getDays(); i++ ) {
			
			for( int j = 0; j < this.getHours(); j++ ) {
				schedule[i][j]=false;
			}
		}
	}
	
	/*
	 * Gets the number of days in a schedule
	 * @return The number of days in this schedule
	 */
	public int getDays() {
		return schedule.length;
	}
	
	/*
	 * Gets the number of hours in a day of the schedule
	 * @return The number of hours the schedule considers in a day
	 */
	public int getHours() {
		return schedule[0].length;
	}
	
	/*
	 * Gets the state of a certain block of the schedule
	 * @param day The selected day we are considering
	 * @param hour The Selected hour of the day we are considering
	 */
	public boolean getBlock( int day, int hour ) {
		return schedule[day][hour];
	}
	
	/*
	 * Changes a block to busy
	 * @param day The Selected day
	 * @param hour The Selected hour of the day
	 */
	public void setBlockBusy( int day, int hour ) {
		schedule[day][hour] = false;
	}
	
	/*
	 * Changes a block to free 
	 * @param day Selected day of the schedule
	 * @param hour Selected hour of the day
	 */
	public void setBlockFree( int day, int hour ) {
		schedule[day][hour]=true;
	}
	
	/*
	 * Returns a 2D array representing the schedule
	 * @return The schedule
	 */
	public boolean[][] getSchedule() {
		return schedule;
	}
	
	/*
	 * Returns a string representation of if a block is free or busy
	 * @return State of the Block
	 */
	public String blockToString( int day, int hour ) {
		if( this.getBlock( day, hour ) == false ) {
			return "Busy";
		}
		return "Free";
	}
}
