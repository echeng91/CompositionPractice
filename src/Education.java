
public class Education {

	private String[] schoolList;
	private int schoolCount;

	public Education()
	{
		schoolList = new String[10];
		schoolCount = 0;
	}

	public void addSchool(String schoolName)
	{
		if(schoolCount < schoolList.length)
		{
			schoolList[schoolCount] = schoolName;
			schoolCount++;
		}
		else
		{
			for(int i = 0; i < schoolList.length - 1; i++)
			{
				schoolList[i] = schoolList[i + 1];
			}
			schoolList[schoolList.length - 1] = schoolName;
		}
	}

	@Override
	public String toString()
	{
		String returnString = "School list:\n";
		for(int i = 0; i < schoolCount; i++)
		{
			returnString += "\t" + schoolList[i] + "\n";
		}
		return returnString;
	}
}
