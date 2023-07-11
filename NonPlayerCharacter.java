import java.security.SecureRandom;

/**
 * This is our NonPlayer Character that inherits
 * from GameCharacter it represent objects the game controls 
 * (as opposed to objects a human player controls).
 * @author 
 * @version 1.3
 * Lab1
 * CS131ON
 */

public class NonPlayerCharacter extends GameCharacter{
	
	private boolean active;
	private String intelligenceType;
	
	public NonPlayerCharacter()
	{
		super();
		setActive(false);
		setIntelligenceType("AVREAGE");
	}
	
	public NonPlayerCharacter(String id, String personality, boolean active, String IntelligenceType)
	{
		super(id,personality);
		this.active=active;
		this.intelligenceType=IntelligenceType;
	}

	public String reportStructure()
	{
		StringBuilder sb = new StringBuilder("==================================\n");
		sb.append("UniqueID: "+getUniqueID()+"\n");
		sb.append("Personality: "+getPersonality()+"\n");
		sb.append("==================================\n");
		sb.append("Active: "+isActive()+"\n");
		sb.append("Intelligence: "+getIntelligenceType()+"\n");
		sb.append("==================================\n");
		return sb.toString();
	}
	
	public String introduce()
	{
		return ("Hello, my name is "+super.uniqueID);
	}
	
	public String exclaim()
	{
		SecureRandom rand = new SecureRandom();
		String[] strArray={"Dag Gummit","Doggone it", "Holy cow", "Jeez", "Well cheese and crackers"};
		int random = rand.nextInt(4);
		return strArray[random];
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getIntelligenceType() {
		return intelligenceType;
	}

	public void setIntelligenceType(String intelligenceType) {
		this.intelligenceType = intelligenceType;
	}
	
	
	
	

}//end class

