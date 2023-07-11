
public class BasketballTeam extends SportsTeam{
	
	private int fieldGoals,fieldGoalsAttempted,freeThrows,freeThrowsAttempted;
	
	public BasketballTeam()
	{
		super();
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0;
		freeThrowsAttempted=0;
	}
	
	public BasketballTeam(String teamName,String teamMascot, String headCoach)
	{
		super(teamName,teamMascot,headCoach);
		fieldGoals=0;
		fieldGoalsAttempted=0;
		freeThrows=0;
		freeThrowsAttempted=0;
	}
	
	public double fieldGoalPercentage()
	{
		return (double)fieldGoals/fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage()
	{
		return (double)freeThrows/freeThrowsAttempted;
	}
	
	public double[] getStats() {
        double winPercentage = getWinPercentage();
        double fieldGoalPercentage = fieldGoalPercentage();
        double freeThrowPercentage = freeThrowPercentage();
        return new double[] { winPercentage, fieldGoalPercentage, freeThrowPercentage };
    }
	
	public void setStats(int wins,int losses,int fieldGoals, int fieldGoalsAttempted,int freeThrows,int freeThrowsAttempted)
	{
		this.wins=wins;
		this.losses=losses;
		this.fieldGoals=fieldGoals;
		this.fieldGoalsAttempted=fieldGoalsAttempted;
		this.freeThrows=freeThrows;
		this.freeThrowsAttempted=freeThrowsAttempted;
	}
}
